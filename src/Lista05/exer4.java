
package Lista05;

import javax.swing.JOptionPane;


public class exer4 {
    
    
   String aumentavelocidade(int velocidade){
        String A="";
        velocidade=0;
        for(int i=0;i<100;i++){
            
            velocidade=velocidade+50;
            A+=velocidade;
            
            A+=",";
        }
        
     
      return   A;
    }
    
    String diminuivelocidade(int velocidade){
       
      String A="";
      velocidade=5000;
      for(int i=100;i>0;i--){
            
            velocidade=velocidade-50;
            A+=velocidade;
            A+=",";
      }
    return   A; 
    }
    
    public static void main(String args[]) {
        
        int velocidade = 0;
        
        Motor motor = new Motor();
        exer4 moto = new exer4();
        
        motor.fabricante = "Fiat";
        JOptionPane.showMessageDialog(null,"O fabricante do motor é " + motor.fabricante);
        motor.ligaMotor(30);
        
        int a = motor.verificaVelocidade(0);
        JOptionPane.showMessageDialog(null,"A velocidade é " +a +" RPM");
        
        
     
        
        
        
        JOptionPane.showMessageDialog(null,"Aumentando velocidade : " + moto.aumentavelocidade(velocidade)+" RPM");
        JOptionPane.showMessageDialog(null,"Diminuindo velocidade : " + moto.diminuivelocidade(velocidade)+" RPM");
    
        
    } 
    
    
    
}
