/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

/**
 *
 * @author Carlos
 */
import Menu.fechajanela;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*; 
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class Lista02exer7 extends JFrame implements ActionListener {
    
    JLabel l1,l2,l3;
	JLabel lblNum1,lblNum2;
    JButton btnCalcular,btnLimpar,btnSair;
    JTextField txtNum1,txtNum2; 
    JRadioButton Pd,Pc,Pct;
   ButtonGroup grupo1;
   
    
    public static void main(String args[])
    {
    Lista02exer7 Janela=new Lista02exer7();
    Janela.addWindowListener (new fechajanela());
    Janela.show();
    }
    
    Lista02exer7()
    {
    setTitle("Venda");
    setSize(300,350);
    setLocation(60,60);
    setBackground(new Color(160,150,150));
    setLayout(new GridLayout(10,20));
    lblNum1 = new JLabel("Valor: ");
    lblNum1.setForeground(Color.black);
    
    lblNum2 = new JLabel("Total");
    lblNum2.setForeground(Color.black);
    lblNum1.setFont(new Font("",Font.BOLD,15));
    lblNum2.setFont(new Font("",Font.BOLD,15));
    
    
    
  
    btnCalcular = new JButton ("Calcular");     btnCalcular.addActionListener(this);
    
    btnLimpar = new JButton ("Limpar"); btnLimpar.addActionListener(this);
    btnLimpar.setBackground(Color.black);
    btnLimpar.setForeground(Color.white);
    btnSair = new JButton ("Sair");     btnSair.addActionListener(this);
    btnSair.setBackground(Color.red);
    btnSair.setForeground(Color.white);
    
    txtNum1 = new JTextField();
    txtNum2 = new JTextField();
    
    txtNum2.setEditable(false);
    
                Pd = new JRadioButton("Pagamento em Dinheiro", false);
		Pc = new JRadioButton("Pagamento em Cheque", false);
                Pct = new JRadioButton("Pagamento em Cartão", false);
		
    
    add(Pd); add(Pc); add(Pct); add(lblNum1);  add(txtNum1);  add(lblNum2);  add(txtNum2);   
    add(btnCalcular);     add(btnLimpar); add(btnSair);
    
    grupo1 = new ButtonGroup();
		grupo1.add(Pd);
		grupo1.add(Pc);
                grupo1.add(Pct);
    
    }
    public void actionPerformed(ActionEvent e)
    {
        
      
        
    if (e.getSource()==btnLimpar)
            {
            txtNum1.setText("");
            txtNum2.setText("");
          
            return;
            }
    
    if (e.getSource()==btnSair)
            {
            txtNum1.setText("");
            txtNum2.setText("");
            
            dispose();
            return;
            }
            
    float N1=0,N2=0,result=0,resultado=0;
    try
    {
     N1 = Float.parseFloat(txtNum1.getText());
  
    }
    catch (NumberFormatException erro)
       {
       txtNum2.setText("Erro");
       return;
       }
    
    if(Pd.isSelected()) {
        
      
          if (e.getSource()==btnCalcular)
            {  result = (N1 * 5)/100; 
               resultado=(N1-result);
              
            }
    } 
     if(Pc.isSelected())  {    
          
              if (e.getSource()==btnCalcular)
            {  result = (N1 * 5)/100; 
               resultado=(N1+result);
            }
    }
          
    if(Pct.isSelected()) {
             if (e.getSource()==btnCalcular)
            {  result = (N1 * 10)/100; 
               resultado=(N1+result);
            } 
         
      }
    
            
   txtNum2.setText(""+resultado);
    
    }
    
}
