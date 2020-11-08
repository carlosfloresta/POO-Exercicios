package aula01;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class maiornumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				double n1,n2,n3,aux=0;
				
				//instacia do scanner 
                                
                            String j1 = JOptionPane.showInputDialog("Digite o primeiro numero");
                            n1 = Double.parseDouble(j1);
                            
                            String j2 = JOptionPane.showInputDialog("Digite o segundo numero");
                            n2 = Double.parseDouble(j2);
                            
                            String j3 = JOptionPane.showInputDialog("Digite o terceiro numero");
                            n3 = Double.parseDouble(j3);
                            
                            
                            
			

				if ((n1>n2)&&(n1>n3))
				{
					aux=n1;}
					else 
						if (n2>n3)
							{aux=n2;}
						else 
							aux=n3;
                                JOptionPane.showMessageDialog(null,"O maior é "+ aux);
				
			}
			
		
		
		
	}

