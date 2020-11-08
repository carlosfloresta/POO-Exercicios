
package Menu;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*; 
import javax.swing.JButton;
import javax.swing.JFrame;




public class Lista02exer3 extends JFrame implements ActionListener {
    
    
    JButton btn1,btn2,btn3,btnSair;
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lista02exer3 Janela=new Lista02exer3();
	    Janela.addWindowListener (new fechajanela());
	    Janela.show();	
	}


    Lista02exer3(){
        
        setTitle("Exercicio 3 ");
    setSize(400,350);
    setLocation(100,100);
    setBackground(new Color(150,150,150));
    setLayout(new GridLayout(8,2));
    
    btn1 = new JButton ("Botao 1 ");     btn1.addActionListener(this);
    btn2 = new JButton ("Botao 2 ");     btn2.addActionListener(this);
    btn3 = new JButton ("Botao 3 ");     btn3.addActionListener(this);
    btnSair = new JButton ("Sair");     btnSair.addActionListener(this);
    
    btnSair.setBackground(Color.red);
     btnSair.setForeground(Color.white);
    
    
    btn1.setEnabled(true);
    btn2.setEnabled(false);
    btn3.setEnabled(false);
    
    btn1.setToolTipText("Botao 1 Pressione o botao ativo ! ");
    btn2.setToolTipText("Botao 2 Pressione o botao ativo ! ");
    btn3.setToolTipText("Botao 3 Pressione o botao ativo ! ");
    
    
    
    add(btn1);  add(btn2); add(btn3); add(btnSair);
    }
    
    public void actionPerformed(ActionEvent e)
{

    if (e.getSource()==btnSair){
        
        dispose();
        return;
        
    }
    
    
if (e.getSource()==btn1)
        {  
             btn2.setEnabled(true);
             btn1.setEnabled(false);
       
         }
            if (e.getSource()==btn2)
            {  
               btn3.setEnabled(true); 
               btn2.setEnabled(false);
               
                }
                  if (e.getSource()==btn3)
                  {  
                      btn1.setEnabled(true);
                      btn3.setEnabled(false);
                  }
                   
    }        
            
}
