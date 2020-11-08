
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


public class Lista02exer4 extends JFrame implements ActionListener {
	
	
	JLabel l1,l2,l3;
	JLabel lblNum1,lblNum2,lblNum3;
    JButton btnSomar, btnSubtrair, btnMultiplicar, btnDividir, btnLimpar,btnSair,btnPotencia;
    JTextField txtNum1,txtNum2,txtNum3;   

public static void main(String args[])
    {
    Lista02exer4 Janela=new Lista02exer4();
    Janela.addWindowListener (new fechajanela());
    Janela.show();
    }

Lista02exer4()
    {
    setTitle("Calculadora");
    setSize(300,350);
    setLocation(60,60);
    setBackground(new Color(160,150,150));
    setLayout(new GridLayout(10,20));
    lblNum1 = new JLabel("Num.1");
    lblNum1.setForeground(Color.black);
    lblNum2 = new JLabel("Num.2");
    lblNum2.setForeground(Color.black);
    lblNum3 = new JLabel("Total");
    lblNum3.setForeground(Color.black);
    lblNum1.setFont(new Font("",Font.BOLD,15));
    lblNum2.setFont(new Font("",Font.BOLD,15));
    lblNum3.setFont(new Font("",Font.BOLD,15));
    
    
    btnSomar = new JButton ("+");     btnSomar.addActionListener(this);
    btnSubtrair = new JButton ("-");     btnSubtrair.addActionListener(this);
    btnMultiplicar = new JButton ("x");     btnMultiplicar.addActionListener(this);
    btnDividir = new JButton ("/");     btnDividir.addActionListener(this);
    btnPotencia = new JButton ("Potencia"); btnPotencia.addActionListener(this);
    btnLimpar = new JButton ("Limpar"); btnLimpar.addActionListener(this);
    btnLimpar.setBackground(Color.black);
    btnLimpar.setForeground(Color.white);
    btnSair = new JButton ("Sair");     btnSair.addActionListener(this);
    btnSair.setBackground(Color.red);
    btnSair.setForeground(Color.white);
    
    txtNum1 = new JTextField();
    txtNum2 = new JTextField();
    txtNum3 = new JTextField();
    txtNum3.setEditable(false);  //define que o textField como somente leitura
    add(lblNum1);  add(txtNum1);  add(lblNum2);  add(txtNum2);  add(lblNum3);  add(txtNum3);
    add(btnSomar);  add(btnSubtrair);  add(btnMultiplicar);  add(btnDividir); add(btnPotencia);  add(btnLimpar); add(btnSair);
    }

public void actionPerformed(ActionEvent e)
    {
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
    if (e.getSource()==btnSomar)
            {  result = N1 + N2;  }
    if (e.getSource()==btnSubtrair)
            {  result = N1 - N2;  }
    if (e.getSource()==btnMultiplicar)
            {  result = N1 * N2;  }
    if (e.getSource()==btnDividir)
            {  result = N1 / N2;  }
    if (e.getSource()==btnPotencia)
            { result = (float) Math.pow(N1,N2); }
            
   txtNum3.setText(""+result);
    }


}
