
package Lista05;

import javax.swing.JOptionPane;


public class exer3 {
    
    int aumentavelocidade(int velocidade){
        
        
        String A = JOptionPane.showInputDialog(null,"Digite quanto deseja aumentar a velocidade em RPM : ");
        velocidade = Integer.parseInt(A);
        
     
      return   velocidade;
    }
    
    int diminuivelocidade(int velocidade){
       
        String A = JOptionPane.showInputDialog(null,"Digite quanto deseja diminuir a velocidade em RPM : ");
        velocidade = Integer.parseInt(A);
       
    return   velocidade; 
    }
    
    public static void main(String args[]) {
        
        int velocidade = 0;
        Motor motor = new Motor();
        exer3 moto = new exer3();
        
        motor.fabricante = "Fiat";
        JOptionPane.showMessageDialog(null,"O fabricante do motor é " + motor.fabricante);
        motor.ligaMotor(30);
        
        int a = motor.verificaVelocidade(20000);
        JOptionPane.showMessageDialog(null,"A velocidade é " +a +" RPM");
        
        int soma = motor.velocidade + moto.aumentavelocidade(velocidade);
        int sub = soma - moto.diminuivelocidade(velocidade);
        
        
        if((soma>50000) || (sub<0)){
            
         JOptionPane.showMessageDialog(null,"ERRO! Velocidade informada maior que 50000 RPM ou menor que 0 RPM");   
        }else{
        
        
        
        }
        JOptionPane.showMessageDialog(null,"Aumentando velocidade : " + soma+" RPM");
        JOptionPane.showMessageDialog(null,"Diminuindo velocidade : " + sub+" RPM");
    
        
    }
    
}
