package aula02;

import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class Applet02 extends Applet implements ActionListener,KeyListener
{
 Label L1,L2,L3,L4;      Button B1,B2;
 TextField T1,T2,T3;     Choice C1; 

public void init()
 {
 Applet02 Janela = new Applet02();
 Janela.setVisible(true); 
 }

public Applet02()
 {
 setBackground(new Color(200,200,200));
 setLayout(new GridLayout(5,2,5,5));
 L1 = new Label("Largura"); L2 = new Label("Comprimento");
 L3 = new Label("Regiao");  L4 = new Label("I.P.T.U.");
 B1 = new Button ("Calcular");  B1.addActionListener(this);
 B2 = new Button ("Limpar");    B2.addActionListener(this);
 T1 = new TextField();        T2 = new TextField();
 T3 = new TextField();        T3.setEditable(false);
 C1 = new Choice();
 C1.add("Norte");        C1.add("Sul");
 C1.add("Leste");        C1.add("Oeste");
 C1.select(0);
 T1.addKeyListener(this); T2.addKeyListener(this);
 add(L1);  add(T1);   add(L2);   add(T2);   add(L3);
 add(C1);  add(L4);   add(T3);   add(B1);   add(B2);
 }

public void actionPerformed(ActionEvent e) 
 {
 if (e.getSource()==B1)
  {
  try
   {
   float L = Float.valueOf(T1.getText()).floatValue();
   float C = Float.valueOf(T2.getText()).floatValue();
   switch(C1.getSelectedIndex())
    {
    case 0: T3.setText(""+ L * C * 1.25 * 1.5);break;
    case 1: T3.setText(""+ L * C * 1.25 * 1.3);break;
    case 2: T3.setText(""+ L * C * 1.25 * 1.1);break;
    case 3: T3.setText(""+ L * C * 1.25);break;
    }
   }
   catch (NumberFormatException erro)
    { T3.setText("Erro");  }
  }
 if (e.getSource()==B2)
  {
   T1.setText("");  T2.setText("");  T3.setText("");
   C1.select(0);
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