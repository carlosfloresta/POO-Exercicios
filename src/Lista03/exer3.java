
package Lista03;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class exer3 {
    
   
    public static void main(String[] args){
        int total = 0;
        
         exer3 Aleatorio = new exer3();
         Aleatorio.aleatorio();
        
    }
    
    public static String aleatorio(){
        
      int num1,num2; 
       
      String num= JOptionPane.showInputDialog(null,"Digite a quantidade de numeros a ser gerada: ");
      num1 = Integer.parseInt(num);   
      String nu= JOptionPane.showInputDialog(null,"Digite a faixa de numeros validos para o sorteio: ");
      num2 = Integer.parseInt(nu);
    
    Random gerador = new Random();
    String s = "";
    
    for (int i = 0; i < num1; i++) {
    
        
       s+= gerador.nextInt(num2);
        
       s += "\n";   
    }
    JOptionPane.showMessageDialog(null,"\nNumeros Sorteados: \n"+s);
    
        return s;
   
}
    
    
}
