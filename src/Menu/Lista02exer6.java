
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


public class Lista02exer6 extends JFrame implements ActionListener {
    
    JLabel l1,l2,l3;
	JLabel lblNum1,lblNum2;
    JButton btnCalcular,btnLimpar,btnSair;
    JTextField txtNum1,txtNum2; 
    Choice C1; 
    
    public static void main(String args[])
    {
    Lista02exer6 Janela=new Lista02exer6();
    Janela.addWindowListener (new fechajanela());
    Janela.show();
    }
    
    Lista02exer6()
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
    

    C1 = new Choice();
    C1.add("Pagamento em Dinheiro");        C1.add("Pagamento em Cheque");
    C1.add("Pagamento em Cartão");       
    C1.select(0);
    add(C1); add(lblNum1);  add(txtNum1);  add(lblNum2);  add(txtNum2);   
    add(btnCalcular);     add(btnLimpar); add(btnSair);
    
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
    
    switch (C1.getSelectedIndex())
              {
          case 0: 
          if (e.getSource()==btnCalcular)
            {  result = (N1 * 5)/100; 
               resultado=(N1-result);
            }
          break;
          
          case 1: 
              if (e.getSource()==btnCalcular)
            {  result = (N1 * 5)/100; 
               resultado=(N1+result);
            }
          break;
          
          case 2: 
             if (e.getSource()==btnCalcular)
            {  result = (N1 * 10)/100; 
               resultado=(N1+result);
            } 
         
      }
    
            
   txtNum2.setText(""+resultado);
    
    }
    
}
