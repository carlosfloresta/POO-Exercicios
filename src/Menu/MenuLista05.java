
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


public class MenuLista05 extends JApplet implements ActionListener,KeyListener {
    
    JLabel lblTitulo,lblExer1,lblExer2,lblExer3,lblExer4,lblExer5;
    JButton btnExer1,btnExer2,btnExer3,btnExer4,btnExer5;
    
    public void init()
 {
 MenuLista05 Janela = new MenuLista05();
 Janela.setVisible(true); 
 }
    
    public MenuLista05()
    {
        
        
    setBackground(new Color(160,134,150));
    setLayout(new GridLayout(12,1));
    Icon icon = new ImageIcon("C:\\Users\\Carlos\\Documents\\NetBeansProjects\\Aula01\\src\\Menu\\iconetitulo.png");
    lblTitulo = new JLabel("LISTA 05",icon,JLabel.CENTER);
            
            
     lblExer1 = new JLabel("Exercicio 1 - Funcionamento de um motor");    
     lblExer2 = new JLabel("Exercicio 2 - 3 objetos da anterior imprimindo na tela");
     lblExer3 = new JLabel("Exercicio 3 - Aumentar e diminuir velocidade");
     lblExer4 = new JLabel("Exercicio 4 - Aumenta de 50 em 50 ate 5.000 depois reduz ate chegar a zero");
     
     
     
     
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
    
    lblExer4.setForeground(Color.black);
    lblExer4.setFont(new Font("",Font.BOLD,12));
    
    
    
    
   
    btnExer1 = new JButton ("Exercicio 01");     btnExer1.addActionListener(this);
    btnExer2 = new JButton ("Exercicio 02");     btnExer2.addActionListener(this);
    btnExer3 = new JButton ("Exercicio 03");     btnExer3.addActionListener(this);
    btnExer4 = new JButton ("Exercicio 04");     btnExer4.addActionListener(this);
   
  
    
 
  
                      add(lblTitulo); 
    add(lblExer1); add(lblExer2); add(lblExer3); add(lblExer4); 
     
    add(btnExer1); add(btnExer2);  add(btnExer3); add(btnExer4);  
  
    
   
    }
    
    public void actionPerformed(ActionEvent e)
    {
        

   
    
    if (e.getSource()==btnExer1)
            {
            
            Lista05.Motor exer1 = new Lista05.Motor();
        String[] args = null;
           
           exer1.main(args);
            }
         if (e.getSource()==btnExer2)
            {
            
            Lista05.exer2 exer2 = new Lista05.exer2();
        String[] args = null;
           exer2.main(args);
        
            }   
     if (e.getSource()==btnExer3)
            {
            
            Lista05.exer3 exer3 = new Lista05.exer3();
        String[] args = null;
           
           exer3.main(args);
            }
       
     if (e.getSource()==btnExer4)
            {
            
            Lista05.exer4 exer4 = new Lista05.exer4();
        String[] args = null;
           
           exer4.main(args);
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

