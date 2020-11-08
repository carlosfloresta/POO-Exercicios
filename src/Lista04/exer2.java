
package Lista04;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;


public class exer2 {
    
    public static void main(String[] args){
    int n = 1 ;
   
    ArrayList<Integer> buff = new ArrayList<Integer>();
   JOptionPane.showMessageDialog(null,"Maior e menor numero de uma quantidade de numeros indefinida"); 
   while(n !=0)   {
     String A = JOptionPane.showInputDialog(null,"Digite o numero: Digite 0 quando quiser sair. ");  
       n = Integer.parseInt(A);
     
        buff.add(n);
        
        }
      
   int retiraultimonum = buff.size()-1;
        buff.remove(retiraultimonum);
       
JOptionPane.showMessageDialog(null,"\n Seus numeros digitados: "+buff+" \n O maior numero é: "+ Collections.max(buff)+ "\n O menor numero é: "+ Collections.min(buff));
    
    
    }
}
