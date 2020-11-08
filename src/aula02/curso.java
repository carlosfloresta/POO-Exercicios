
package aula02;

import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;


public class curso extends Applet implements ActionListener,KeyListener 
{
    
Label L1,L2,L3,L4,L5,L6,L7,L8;      Button B1,B2;
 TextField T1,T2,T3,T4,T5,T6;     Choice C1,C2; 


public void init(){

    curso janela = new curso();
   janela.setVisible(true);

}

public curso(){
    
    setBackground(new Color(200,200,200));
    
 setLayout(new GridLayout(9,10,2,2));

 L1 = new Label("NOME: "); L2 = new Label("CPF: ");
 L3 = new Label("CURSO: ");  L4 = new Label("HORARIO: ");
 L5 = new Label("VALOR: ") ; L6 = new Label("Nome > ");
 L7 = new Label("CPF > "); L8 = new Label("Valor total a pagar por mês > ");
 B1 = new Button ("Calcular");  B1.addActionListener(this);
 B2 = new Button ("Limpar");    B2.addActionListener(this);
 T1 = new TextField();        T2 = new TextField();
 T3 = new TextField();        T3.setEditable(false);
 T4 = new TextField();        T4.setEditable(false);
 T5 = new TextField();        T5.setEditable(false);
 T6 = new TextField();        T6.setEditable(false);

 C1 = new Choice();
 C2 = new Choice();
 C1.add("Analise e Desevolvimento de Sistemas");        C1.add("Logistica");
 C1.add("Ed.Fisica");        
 C1.select(0);
 
 C2.add("Manhã");        C2.add("Tarde");
 C2.add("Noite");        
 C2.select(0);
 
 T1.addKeyListener(this); T2.addKeyListener(this);
 add(L1);  add(T1);   
 add(L2);   add(T2);   add(L3); 
 add(C1);  add(L5);   add(T3); add(L4); add(C2);  
 add(L6); add(T5); 
 add(L7); add(T6); 
 add(L8); add(T4);
 add(B2);
 add(B1);  
 
 
 }


public void actionPerformed(ActionEvent e) 
 {
     
   switch (C1.getSelectedIndex())
              {
          case 0: T3.setText("1500");break;
          case 1: T3.setText("700");break;
          case 2: T3.setText("500");break;
          
      }  
   
   if (e.getSource()==B1)
  {
  
   float A = Float.valueOf(T3.getText()).floatValue();
   String B = String.format(T1.getText());
   String C = String.format(T2.getText());
   
   float resultado=0,result=0;
   T5.setText(""+B);
   T6.setText(""+C);
   switch (C2.getSelectedIndex())
              {
          case 0: T4.setText(""+A); 
       break;
          
          
          case 1: T4.setText(""+A);break;
          case 2: 
              resultado=(A*5)/100;
              result=A+resultado;
              T4.setText(""+result);
              
          break;
      }
   }
   
    
   
 if (e.getSource()==B2)
  {
   T1.setText("");  T2.setText("");  T3.setText(""); T4.setText(""); T5.setText(""); T6.setText("");
   C1.select(0);
   C2.select(0);
   
  }    
}


public void keyPressed(KeyEvent e)
 { 
 if(e.getKeyCode()==10 || e.getKeyCode()==9) 
        {  e.setKeyCode(9);  }
 }


public void keyReleased(KeyEvent e) {}


public void keyTyped(KeyEvent e) {}
}


