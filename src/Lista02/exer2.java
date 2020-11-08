/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista02;

import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class exer2 extends  JFrame {
    
    JLabel limage,limage2,limage3;
    JPanel panel, panel2, barra_traseira;
    
    
    public exer2(){
        
        inicializar_componentes();
    }

	public void inicializar_componentes(){
		setBounds(150, 20, 680, 680);
                 setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        setLayout(null);
		
		
		
//                Image a = t.getImage("C:\\Users\\Carlos\\Documents\\NetBeansProjects\\Aula01\\src\\Lista02\\firefox.png");
//		g.drawImage(a, 200, 200, this);
//                Image b = t.getImage("C:\\Users\\Carlos\\Documents\\NetBeansProjects\\Aula01\\src\\Lista02\\Google.png");
//		g.drawImage(b, 400, 400, this);
//                
               
               
               
                 limage = new JLabel();
        
       limage.setIcon(new ImageIcon(getClass().getResource("/Lista02/mario.jpg")));
       
       limage.setBounds(0, 0, 200, 200);
       this.add(limage);
       
       limage2 = new JLabel();
        
       limage2.setIcon(new ImageIcon(getClass().getResource("/Lista02/Google.png")));
       
       limage2.setBounds(150, 0, 600, 600);
       this.add(limage2);
       
       limage3 = new JLabel();
        
       limage3.setIcon(new ImageIcon(getClass().getResource("/Lista02/firefox.png")));
       
       limage3.setBounds(370, 0, 950, 950);
       this.add(limage3);
	}
	    
     
	public static void main(String[] args) {
		
		
                
                exer2 frame = new exer2();
        frame.setVisible(true);
        frame.setLayout(null);
		
	}

   
			
	}
