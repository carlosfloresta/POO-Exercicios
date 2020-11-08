
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


public class MenuLista04 extends JApplet implements ActionListener,KeyListener {
    
    JLabel lblTitulo,lblExer1,lblExer2,lblExer3,lblExer4,lblExer5;
    JButton btnExer1,btnExer2,btnExer3,btnExer4,btnExer5;
    
    public void init()
 {
 MenuLista04 Janela = new MenuLista04();
 Janela.setVisible(true); 
 }
    
    public MenuLista04()
    {
        
        
    
    setBackground(new Color(160,134,150));
    setLayout(new GridLayout(12,1));
    Icon icon = new ImageIcon("C:\\Users\\Carlos\\Documents\\NetBeansProjects\\Aula01\\src\\Menu\\iconetitulo.png");
    lblTitulo = new JLabel("LISTA 04",icon,JLabel.CENTER);
            
            
     lblExer1 = new JLabel("Exercicio 1 - Valores maiores que a media dos numeros digitados");    
     lblExer2 = new JLabel("Exercicio 2 - Menor e maior numero de uma quantidade indefinida");
     lblExer3 = new JLabel("Exercicio 3 - Recebe 10 nomes depois a pessoa digita se o nome esta cadastrado no array");
     lblExer4 = new JLabel("Exercicio 4 - Media de cada classe e media da escola");
     lblExer5 = new JLabel("Exercicio 5 - Pares em ordem crescente e impares em ordem decrescente");
     
     
     
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
    
    lblExer5.setForeground(Color.black);
    lblExer5.setFont(new Font("",Font.BOLD,12));
    
    
    
   
    btnExer1 = new JButton ("Exercicio 01");     btnExer1.addActionListener(this);
    btnExer2 = new JButton ("Exercicio 02");     btnExer2.addActionListener(this);
    btnExer3 = new JButton ("Exercicio 03");     btnExer3.addActionListener(this);
    btnExer4 = new JButton ("Exercicio 04");     btnExer4.addActionListener(this);
    btnExer5 = new JButton ("Exercicio 05");     btnExer5.addActionListener(this);
    
    
 
  
                      add(lblTitulo); 
    add(lblExer1); add(lblExer2); add(lblExer3); add(lblExer4); add(lblExer5);
     
    add(btnExer1); add(btnExer2);  add(btnExer3); add(btnExer4); add(btnExer5);  
  
   
    
   
    }
    
    public void actionPerformed(ActionEvent e)
    {
        

    
    if (e.getSource()==btnExer1)
            {
            
            Lista04.exer1 exer1 = new Lista04.exer1();
        String[] args = null;
           
           exer1.main(args);
            }
         if (e.getSource()==btnExer2)
            {
            
            Lista04.exer2 exer2 = new Lista04.exer2();
        String[] args = null;
           exer2.main(args);
        
            }   
     if (e.getSource()==btnExer3)
            {
            
            Lista04.exer3 exer3 = new Lista04.exer3();
        String[] args = null;
           
           exer3.main(args);
            }
       
     if (e.getSource()==btnExer4)
            {
            
            Lista04.exer4 exer4 = new Lista04.exer4();
        String[] args = null;
           
           exer4.main(args);
            }
        
     if (e.getSource()==btnExer5)
            {
            
            Lista04.exer5 exer5 = new Lista04.exer5();
        String[] args = null;
           
           exer5.main(args);
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
