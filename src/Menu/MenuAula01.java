
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

public class MenuAula01 extends JApplet implements ActionListener,KeyListener {
    
    JLabel lblTitulo,lblExer1,lblExer2,lblExer3,lblExer4;
    JButton btnExer1,btnExer2,btnExer3,btnExer4;
    
    public void init()
 {
 MenuAula01 Janela = new MenuAula01();
 Janela.setVisible(true); 
 }
    
    public MenuAula01()
    {
        
        
    setBackground(new Color(160,150,150));
    setLayout(new GridLayout(10,30));
    Icon icon = new ImageIcon("C:\\Users\\Carlos\\Documents\\NetBeansProjects\\Aula01\\src\\Menu\\iconetitulo.png");
    lblTitulo = new JLabel("AULA 01",icon,JLabel.CENTER);
    
            
     lblExer1 = new JLabel("Exercicio 1 - Maior numero de 3 numeros digitados(entrada e saida pelo monitor)");    
     lblExer2 = new JLabel("Exercicio 2 - Calculadora");
     lblExer3 = new JLabel("Exercicio 3 - Maior numero de 3 numeros digitados(usando caixa de dialogo 'JOptionPane')");
     lblExer4 = new JLabel("Exercicio 4 - Media do aluno,Media inferir  a 3,0 ele é retido,media entre 3 e 7 tem direito a outra avaliação,apos essa se a media dele for igual a 6 ele é aprovado,se nao ele tem direito a ultima avaliação.");
     
     
     
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
   
    btnExer1 = new JButton ("Exercicio 01");     btnExer1.addActionListener(this);
    btnExer2 = new JButton ("Exercicio 02");     btnExer2.addActionListener(this);
    btnExer3 = new JButton ("Exercicio 03");     btnExer3.addActionListener(this);
    btnExer4 = new JButton ("Exercicio 04");     btnExer4.addActionListener(this);
    
    add(lblTitulo); add(lblExer1); add(lblExer2); add(lblExer3); add(lblExer4); add(btnExer1); add(btnExer2);  add(btnExer3);  add(btnExer4);   
    
    }
    
    public void actionPerformed(ActionEvent e)
    {
        

    
    if (e.getSource()==btnExer1)
            {
            
            aula01.maiornumero exer1 = new aula01.maiornumero();
        String[] args = null;
           
           exer1.main(args);
            }
         if (e.getSource()==btnExer2)
            {
            
            Menu.Aula01calculadora exer2 = new Menu.Aula01calculadora();
           exer2.setVisible(true);
        
            }   
     if (e.getSource()==btnExer3)
            {
            
            aula01.maiornumero2 exer3 = new aula01.maiornumero2();
        String[] args = null;
           
           exer3.main(args);
            }
        if (e.getSource()==btnExer4)
            {
            
            aula01.unitabajara exer4 = new aula01.unitabajara();
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
