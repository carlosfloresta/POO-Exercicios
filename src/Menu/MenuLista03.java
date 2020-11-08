
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


public class MenuLista03 extends JApplet implements ActionListener,KeyListener {
    
    JLabel lblTitulo,lblExer1,lblExer2,lblExer3;
    JButton btnExer1,btnExer2,btnExer3;
    
    public void init()
 {
 MenuLista03 Janela = new MenuLista03();
 Janela.setVisible(true); 
 }
    
    public MenuLista03()
    {
        
        
    setBackground(new Color(160,134,150));
    setLayout(new GridLayout(12,1));
    Icon icon = new ImageIcon("C:\\Users\\Carlos\\Documents\\NetBeansProjects\\Aula01\\src\\Menu\\iconetitulo.png");
    lblTitulo = new JLabel("LISTA 03",icon,JLabel.CENTER);
            
            
     lblExer1 = new JLabel("Exercicio 1 - Volume de uma esfera");    
     lblExer2 = new JLabel("Exercicio 2 - Temperatura de Fahrenheit para celsius");
     lblExer3 = new JLabel("Exercicio 3 - Sorteio de numero aleatorio na faixa escolhida");
     
     
     
    lblTitulo.setForeground(Color.black);
    lblTitulo.setFont(new Font("",Font.BOLD,15));
    
    lblExer1.setForeground(Color.black);
    lblExer1.setFont(new Font("",Font.BOLD,12));
    
    lblExer2.setForeground(Color.black);
    lblExer2.setFont(new Font("",Font.BOLD,12));
    
    lblExer3.setForeground(Color.black);
    lblExer3.setFont(new Font("",Font.BOLD,12));
    
    
    
    
   
    btnExer1 = new JButton ("Exercicio 01");     btnExer1.addActionListener(this);
    btnExer2 = new JButton ("Exercicio 02");     btnExer2.addActionListener(this);
    btnExer3 = new JButton ("Exercicio 03");     btnExer3.addActionListener(this);
    
    
 
  
                      add(lblTitulo); 
    add(lblExer1); add(lblExer2); add(lblExer3); 
     
    add(btnExer1); add(btnExer2);  add(btnExer3);  
  
   
    
   
    }
    
    public void actionPerformed(ActionEvent e)
    {
        

    
    
    if (e.getSource()==btnExer1)
            {
            
            Lista03.exer1 exer1 = new Lista03.exer1();
        String[] args = null;
           
           exer1.main(args);
            }
         if (e.getSource()==btnExer2)
            {
            
            Lista03.exer2 exer2 = new Lista03.exer2();
        String[] args = null;
           exer2.main(args);
        
            }   
     if (e.getSource()==btnExer3)
            {
            
            Lista03.exer3 exer3 = new Lista03.exer3();
        String[] args = null;
           
           exer3.main(args);
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
