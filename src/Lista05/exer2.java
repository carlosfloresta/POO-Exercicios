
package Lista05;

import javax.swing.JOptionPane;


public class exer2 {
    
    
    public static void main(String args[]) {
        
        Motor motor = new Motor();
        
        motor.fabricante = "Fiat";
        JOptionPane.showMessageDialog(null,"O fabricante do motor é " + motor.fabricante);
        motor.ligaMotor(30);
        JOptionPane.showMessageDialog(null,"A velocidade é " + motor.verificaVelocidade(220)+" RPM");
	motor.desligaMotor();
    }
    
}
