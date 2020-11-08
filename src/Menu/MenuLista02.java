
package Menu;


import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;


public class MenuLista02 extends JApplet implements ActionListener,KeyListener {
    
    JLabel lblTitulo,lblExer1,lblExer2,lblExer3,lblExer4,lblExer5,lblExer6,lblExer7,lblExer8;
    JButton btnExer1,btnExer2,btnExer3,btnExer4,btnExer5,btnExer6,btnExer7,btnExer8;
    
    public void init()
 {
 MenuLista02 Janela = new MenuLista02();
 Janela.setVisible(true); 
 }
    
   public MenuLista02()
    {
        
        
   
   
    setBackground(new Color(160,134,150));
    setLayout(new GridLayout(18,-5));
    Icon icon = new ImageIcon("C:\\Users\\Carlos\\Documents\\NetBeansProjects\\Aula01\\src\\Menu\\iconetitulo.png");
    lblTitulo = new JLabel("LISTA 02",icon,JLabel.CENTER);
            
            
     lblExer1 = new JLabel("Exercicio 1 - Cor da Janela azul,tela quadrada");    
     lblExer2 = new JLabel("Exercicio 2 - 3 imagens em formato igual o numero 3 de um dado (firefox,mario e google, alterar o caminho da imagem pra funcionar)");
     lblExer3 = new JLabel("Exercicio 3 - 3 botoes quando clica em um ativa o outro");
     lblExer4 = new JLabel("Exercicio 4 - calculadora com a função potencia");
     lblExer5 = new JLabel("Exercicio 5 - simulador de venda de sorvete");
     lblExer6 = new JLabel("Exercicio 6 - Venda de algo com cartao, cheque e dinheiro e acrescimento e desconto");
     lblExer7 = new JLabel("Exercicio 7 - Mesmo que o anterior só com botao de radio");
     lblExer8 = new JLabel("Exercicio 8 - Cadastro de pessoa usando JtextArea");
     
    lblTitulo.setForeground(Color.black);
    lblTitulo.setFont(new Font("",Font.BOLD,15));
    
    lblExer1.setForeground(Color.black);
    lblExer1.setFont(new Font("",Font.BOLD,12));
    
    lblExer2.setForeground(Color.black);
    lblExer2.setFont(new Font("",Font.BOLD,12));
    
    lblExer3.setForeground(Color.black);
    lblExer3.setFont(new Font("",Font.BOLD,12));
    
    lblExer4.setForeground(Color.black);
    lblExer4.setFont(new Font("",Font.BOLD,12));
    
    lblExer5.setForeground(Color.black);
    lblExer5.setFont(new Font("",Font.BOLD,12));
    
    lblExer6.setForeground(Color.black);
    lblExer6.setFont(new Font("",Font.BOLD,12));
    
    lblExer7.setForeground(Color.black);
    lblExer7.setFont(new Font("",Font.BOLD,12));
    
    lblExer8.setForeground(Color.black);
    lblExer8.setFont(new Font("",Font.BOLD,12));
    
   
    btnExer1 = new JButton ("Exercicio 01");     btnExer1.addActionListener(this);
    btnExer2 = new JButton ("Exercicio 02");     btnExer2.addActionListener(this);
    btnExer3 = new JButton ("Exercicio 03");     btnExer3.addActionListener(this);
    btnExer4 = new JButton ("Exercicio 04");     btnExer4.addActionListener(this);
    btnExer5 = new JButton ("Exercicio 05");     btnExer5.addActionListener(this);
    
    btnExer6 = new JButton ("Exercicio 06");     btnExer6.addActionListener(this);
    btnExer7 = new JButton ("Exercicio 07");     btnExer7.addActionListener(this);
    btnExer8 = new JButton ("Exercicio 08");     btnExer8.addActionListener(this);
    
    
   
    
 
  
                      add(lblTitulo); 
    add(lblExer1); add(lblExer2); add(lblExer3); add(lblExer4); 
    add(lblExer5); add(lblExer6); add(lblExer7); add(lblExer8); 
    add(btnExer1); add(btnExer2);  add(btnExer3);  add(btnExer4); 
    add(btnExer5); add(btnExer6); add(btnExer7);  add(btnExer8);
   
    
   
    }
    
    public void actionPerformed(ActionEvent e)
    {
        

    
    
    if (e.getSource()==btnExer1)
            {
            
            Lista02.exer1 exer1 = new Lista02.exer1();
        String[] args = null;
           
           exer1.main(args);
            }
         if (e.getSource()==btnExer2)
            {
            
            Lista02.exer2 exer2 = new Lista02.exer2();
        String[] args = null;
           exer2.main(args);
        
            }   
     if (e.getSource()==btnExer3)
            {
            
            Menu.Lista02exer3 exer3 = new Menu.Lista02exer3();
           
           exer3.setVisible(true);
            }
        if (e.getSource()==btnExer4)
            {
            
            Menu.Lista02exer4 exer4 = new Menu.Lista02exer4();
        
           exer4.setVisible(true);
            } 
        if (e.getSource()==btnExer5)
            {
            
            Menu.Lista02exer5 exer5 = new Menu.Lista02exer5();
        
           
           exer5.setVisible(true);
            } 
        
        if (e.getSource()==btnExer6)
            {
            
            Menu.Lista02exer6 exer6 = new Menu.Lista02exer6();
        
           
           exer6.setVisible(true);
            } 
        
        if (e.getSource()==btnExer7)
            {
            
            Menu.Lista02exer7 exer7 = new Menu.Lista02exer7();
        
           
           exer7.setVisible(true);
            } 
        
        if (e.getSource()==btnExer8)
            {
            
            Menu.Lista02exer8 exer8 = new Menu.Lista02exer8();
        
           
           exer8.setVisible(true);
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
