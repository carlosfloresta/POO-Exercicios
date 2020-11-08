
package Lista03;

import javax.swing.JOptionPane;


public class exer2 {
    
    public static void main(String[] args){
        
       JOptionPane.showMessageDialog(null,Celsius()); 
        
    }
    
    public static double Celsius(){
        
        double total,num1; 
       
      String num= JOptionPane.showInputDialog(null,"Digite a temperatura em Faherenhrit e receba em celsius: ");
      num1 = Double.parseDouble(num);  
       total=5.0/9.0*(num1-32);
        return total;
        
        
    }
    
}
