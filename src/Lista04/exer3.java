
package Lista04;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class exer3 {
    
    
   public static void main(String[] args){
       String n = null,n2;
       int i;
       int quantidade = 0;
       
       ArrayList<String> pessoas = new ArrayList<String>();
       JOptionPane.showMessageDialog(null,"Digite os 10 nomes a serem armazenados  "); 
       for(i = 0;i<10;i++){
       String A = JOptionPane.showInputDialog(null,"Digite o nome "+(i+1)+" :");  
       n = String.format(A);
       
       pessoas.add(n);
       
      
       }
       
       String B= JOptionPane.showInputDialog(null,"\n Digite o nome da pessoa que deseja verificar se foi cadastrada "); 
       n2 = String.format(B);
       
       
       if(! pessoas.contains(n2)) {
			JOptionPane.showMessageDialog(null,"Essa pessoa não está cadastrada no array!"); 
		}else{
       
       for(i = 0;i<pessoas.size();i++){
           
       if(pessoas.get(i).compareTo(n2)==0){  
             
           JOptionPane.showMessageDialog(null,"O nome : "+n2+" , está cadastrado no array! ");  
       }
          
       }
       }
       
       JOptionPane.showMessageDialog(null,"\n Todos os nomes cadastrados no array : "+pessoas);
   }
  
}
