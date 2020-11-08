
package Menu;

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
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Lista02exer8 extends JFrame implements ActionListener {
    
    JLabel l1,l2,l3;
	JLabel lblNum1,lblNum2,lblsexo,lblestado;
    JButton btnMostrar,btnLimpar,btnSair;
    JTextArea txtNum3; 
    JTextField txtNum1,txtNum2;
    JRadioButton M,F,Casado,Solteiro,Viuvo;
   ButtonGroup grupo1,grupo2;
   
    
    public static void main(String args[])
    {
        
    Lista02exer8 Janela=new Lista02exer8();
    Janela.addWindowListener (new fechajanela());
    Janela.show();
    }
    
    Lista02exer8()
    {
    setTitle("Cadastro");
    setSize(450,500);
    setLocation(60,60);
    setBackground(new Color(200,200,200));
    setLayout(new GridLayout(15,150));
    lblNum1 = new JLabel("NOME: ");
    lblNum1.setForeground(Color.black);
    
    lblNum2 = new JLabel("ENDEREÇO: ");
    lblNum2.setForeground(Color.black);
    
    lblsexo = new JLabel("SEXO: ");
    lblsexo.setForeground(Color.black);
    
    lblestado = new JLabel("ESTADO CIVIL: ");
    lblestado.setForeground(Color.black);
    
    lblNum1.setFont(new Font("",Font.BOLD,15));
    lblNum2.setFont(new Font("",Font.BOLD,15));
    lblsexo.setFont(new Font("",Font.BOLD,15));
    lblestado.setFont(new Font("",Font.BOLD,15));
    
    
    
  
    btnMostrar = new JButton ("MOSTRAR");     btnMostrar.addActionListener(this);
    
    btnLimpar = new JButton ("Limpar"); btnLimpar.addActionListener(this);
    btnLimpar.setBackground(Color.black);
    btnLimpar.setForeground(Color.white);
    btnSair = new JButton ("Sair");     btnSair.addActionListener(this);
    btnSair.setBackground(Color.red);
    btnSair.setForeground(Color.white);
    
    txtNum1 = new JTextField();
    txtNum2 = new JTextField();
    
    txtNum3 = new JTextArea();
    txtNum3.setEditable(false);
    
    
                M = new JRadioButton("M", false);
		F = new JRadioButton("F", false);
                Solteiro = new JRadioButton("Solteiro(a)", false);
                Casado = new JRadioButton("Casado(a)", false);
                Viuvo = new JRadioButton("Viuvo(a)", false);
		
    
    add(lblNum1);  add(txtNum1);  add(lblNum2);  add(txtNum2);  add(lblsexo); add(M); add(F); add(lblestado); add(Solteiro); add(Casado); add(Viuvo);
    add(btnMostrar);  add(txtNum3);   add(btnLimpar); add(btnSair);
    
    grupo1 = new ButtonGroup();
		grupo1.add(M);
		grupo1.add(F);
                
    grupo2 = new ButtonGroup();
		grupo2.add(Solteiro);
		grupo2.add(Casado); 
		grupo2.add(Viuvo);
                
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
            
            dispose();
            return;
            }
            
    String N1,N2,resultado = null;
    
    
     N1 = String.valueOf(txtNum1.getText());
     N2 = String.valueOf(txtNum2.getText());        
             

    if(M.isSelected() && Solteiro.isSelected()) {
        
    if(e.getSource()==btnMostrar){
        
        resultado = N1+"  "+N2+" "+ "M"+" "+" Solteiro";
        
    }
    
   }
    
    if(M.isSelected() && Casado.isSelected()) {
    
    if(e.getSource()==btnMostrar){
        
      resultado = N1+"  "+N2+" "+ "M"+" "+" Casado";  
        
        
    }
    
   }  
        
    if(M.isSelected() && Viuvo.isSelected()) {
    
    if(e.getSource()==btnMostrar){
        
        resultado = N1+"  "+N2+" "+ "M"+" "+" Viuvo";
    }
    
   }  
    
    
    if(F.isSelected() && Solteiro.isSelected()) {
        
    if(e.getSource()==btnMostrar){
        
        resultado = N1+"  "+N2+" "+ "F"+" "+" Solteira";
    }
    
   }
    
    if(F.isSelected() && Casado.isSelected()) {
    
    if(e.getSource()==btnMostrar){
        
        resultado = N1+"  "+N2+" "+ "F"+" "+" Casada";
    }
    
   }  
        
    if(F.isSelected() && Viuvo.isSelected()) {
    
    if(e.getSource()==btnMostrar){
        
        resultado = N1+"  "+N2+" "+ "F"+" "+" Viuva";
    }
    
   }  
    
           txtNum3.setText(""+resultado); 
  
    
    }
    
}
