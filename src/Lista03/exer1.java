
package Lista03;

import javax.swing.JOptionPane;


public class exer1 {
 double Volume,raio;
 
 
 
 public static void main(String[] args){
       
     
      
      JOptionPane.showMessageDialog(null,volumeEsfera());
      
       
   }

   
   public static double volumeEsfera(){
       double Volume,raio; 
       double pi=3.14;
      String RaioA= JOptionPane.showInputDialog(null,"Digite o raio da esfera e receba seu volume: ");
      raio = Double.parseDouble(RaioA);  
       Volume=(4.0/3.0)*pi*Math.pow(raio,3);
        return Volume;
   } 
    
}
   

