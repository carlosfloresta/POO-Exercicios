
package Lista04;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class exer5 {
    
    public static void main(String[] args){
    int n = 1 ;
    int i ;
    int aux = 0;
    String resultado = "";
    String resultado1 = "";
   
   
    ArrayList<Integer> buff = new ArrayList<Integer>();
   JOptionPane.showMessageDialog(null,"PAR em Ordem CRESCENTE e IMPAR em ordem DECRESCENTE"); 
   while(n !=0)   {
     String A = JOptionPane.showInputDialog(null,"Digite o numero: E digite 0 quando quiser sair. ");  
       n = Integer.parseInt(A);
     
        buff.add(n);
        
        }
      
   int retiraultimonum = buff.size()-1;
        buff.remove(retiraultimonum);
        
        
        for(i=0;i<buff.size()-1;i++){
            for(int j=i+1; j< buff.size(); j++){
          
            if ( buff.get(i).compareTo(buff.get(j)) > 0 )  {

                        aux = buff.get(i);
                        buff.set(i,buff.get(j) );
                        buff.set(j, aux);
             
             } 
          } 
        }   
        
        for(i=0;i<buff.size();i++){
           if(buff.get(i)%2==0){
                
                resultado += buff.get(i);
                resultado += "\n";		
			} 
            
        }   
       
       for(i= buff.size() -1 ;i>=0;i--){
            if(buff.get(i)%2!=0){
                
                resultado1 += buff.get(i);
                resultado1 += "\n";
			}
            
            
        }
    JOptionPane.showMessageDialog(null,"\n Numeros PARES em ordem CRESCENTE : \n "+resultado+"\n Numeros IMPARES em ordem DECRESCENTE : \n"+resultado1);
   
       
    }
    
}
