/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;


import Menu.fechajanela;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*; 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Carlos
 */
public class Lista02exer5 extends JFrame implements ActionListener{
    
    JLabel l1,l2,l3;
	JLabel lblNum1,lblNum2,lblNum3;
    JButton btnCalcular,btnLimpar,btnSair;
    JTextField txtNum1,txtNum2,txtNum3; 
    Choice C1; 
    
    public static void main(String args[])
    {
    Lista02exer5 Janela=new Lista02exer5();
    Janela.addWindowListener (new fechajanela());
    Janela.show();
    }
    
    Lista02exer5()
    {
    setTitle("Sorveteria");
    setSize(300,350);
    setLocation(60,60);
    setBackground(new Color(160,150,150));
    setLayout(new GridLayout(10,20));
    lblNum1 = new JLabel("Quantidade: ");
    lblNum1.setForeground(Color.black);
    lblNum2 = new JLabel("Preço Unitario: ");
    lblNum2.setForeground(Color.black);
    lblNum3 = new JLabel("Total");
    lblNum3.setForeground(Color.black);
    lblNum1.setFont(new Font("",Font.BOLD,15));
    lblNum2.setFont(new Font("",Font.BOLD,15));
    lblNum3.setFont(new Font("",Font.BOLD,15));
    
    
   
    btnCalcular = new JButton ("Calcular");     btnCalcular.addActionListener(this);
    
    btnLimpar = new JButton ("Limpar"); btnLimpar.addActionListener(this);
    btnLimpar.setBackground(Color.black);
    btnLimpar.setForeground(Color.white);
    btnSair = new JButton ("Sair");     btnSair.addActionListener(this);
    btnSair.setBackground(Color.red);
    btnSair.setForeground(Color.white);
    
    txtNum1 = new JTextField();
    txtNum2 = new JTextField();
    txtNum3 = new JTextField();
    txtNum3.setEditable(false);
    txtNum2.setEditable(false);
    

    C1 = new Choice();
    C1.add("Chocolate");        C1.add("Baunilha");
    C1.add("Morango");        C1.add("Açai");
    C1.select(0);
    add(C1); add(lblNum1);  add(txtNum1);  add(lblNum2);  add(txtNum2);  add(lblNum3);  add(txtNum3);
    add(btnCalcular);     add(btnLimpar); add(btnSair);
    
    }
    public void actionPerformed(ActionEvent e)
    {
        
      switch (C1.getSelectedIndex())
              {
          case 0: txtNum2.setText("5");break;
          case 1: txtNum2.setText("7");break;
          case 2: txtNum2.setText("9");break;
          case 3: txtNum2.setText("15");break;
      }
        
    if (e.getSource()==btnLimpar)
            {
            txtNum1.setText("");
            txtNum2.setText("");
            txtNum3.setText("");
            return;
            }
    
    if (e.getSource()==btnSair)
            {
            txtNum1.setText("");
            txtNum2.setText("");
            txtNum3.setText("");
            dispose();
            return;
            }
            
    float N1=0,N2=0,result=0;
    try
    {
     N1 = Float.parseFloat(txtNum1.getText());
     N2 = Float.parseFloat(txtNum2.getText());
    }
    catch (NumberFormatException erro)
       {
       txtNum3.setText("Erro");
       return;
       }
    if (e.getSource()==btnCalcular)
            {  result = N1 * N2;  }
    
            
   txtNum3.setText(""+result);
    
    
}
   
}
