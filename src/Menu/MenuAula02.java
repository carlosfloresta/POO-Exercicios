

package Menu;




import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
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
import javax.swing.JFrame;
import javax.swing.JLabel;





public class MenuAula02 extends JApplet implements ActionListener,KeyListener {
    
    JLabel lblTitulo,lblExer1,lblExer2,lblExer3;
    JButton btnExer1,btnExer2,btnExer3;
  
   
    public void init()
 {
 MenuAula01 Janela = new MenuAula01();
 Janela.setVisible(true); 
 }
    
    public MenuAula02()
    {
        
        
    
    setBackground(new Color(160,150,150));
    setLayout(new GridLayout(12,20));
    
     
    Icon icon = new ImageIcon("C:\\Users\\Carlos\\Documents\\NetBeansProjects\\Aula01\\src\\Menu\\iconetitulo.png");
    lblTitulo = new JLabel("AULA 02",icon,JLabel.CENTER);
    
      lblExer1 = new JLabel("Exercicio 1 - Applet02");      
    lblExer2 = new JLabel("Exercicio 2 - Curso");
     lblExer3 = new JLabel("Exercicio 3 - Polinomio");
     
     
     
     
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
     
    
    
 
  
    add(lblTitulo); add(lblExer1); add(lblExer2); add(lblExer3);  add(btnExer1); add(btnExer2); add(btnExer3); 
   
    
   
    }
    
    public void actionPerformed(ActionEvent e)
    {
        
if (e.getSource()==btnExer1)
            {
            
            FrameApplet ta = new FrameApplet ();
        ta.setVisible (true);
           
            }

if (e.getSource()==btnExer2)
            {
            
            FrameCurso ta = new FrameCurso ();
        ta.setVisible (true);
           
            }


  
          
     if (e.getSource()==btnExer3)
            {
            
            Menu.Aula02polinomio exer3 = new Menu.Aula02polinomio();
        
           exer3.setVisible(true);
           
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
