package Lista01;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class exer2 {

	public static void main(String[] args) {
		
double quantidade1,valor1,quantidade2,valor2,quantidade3,valor3,total;

                JOptionPane.showMessageDialog(null, "Primeiro Produto");	
		String j1= JOptionPane.showInputDialog(null,"Digite a quantidade: ");
		quantidade1= Double.parseDouble(j1);
                String j2= JOptionPane.showInputDialog(null,"Digite o valor: ");
		valor1= Double.parseDouble(j2);
                
                 JOptionPane.showMessageDialog(null, "Segundo Produto");	
		String j3= JOptionPane.showInputDialog(null,"Digite a quantidade: ");
		quantidade2= Double.parseDouble(j3);
                String j4= JOptionPane.showInputDialog(null,"Digite o valor: ");
		valor2= Double.parseDouble(j4);

                 JOptionPane.showMessageDialog(null, "Terceiro Produto");	
		String j5= JOptionPane.showInputDialog(null,"Digite a quantidade: ");
		quantidade3= Double.parseDouble(j5);
                String j6= JOptionPane.showInputDialog(null,"Digite o valor: ");
		valor3= Double.parseDouble(j6);

    
	
		
		
		
		total=(quantidade1*valor1)+(quantidade1*valor1)+(quantidade1*valor1);
                 JOptionPane.showMessageDialog(null, "O valor total é " + total);
                
		
		

	}

}