package Lista01;

import javax.swing.JOptionPane;

public class exer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double largura,comprimento,aux;
		String largura1,comprimento1;
		
		
		largura1= JOptionPane.showInputDialog(null,"Digite a largura do terreno: ");
		largura= Double.parseDouble(largura1);
		
		comprimento1= JOptionPane.showInputDialog(null,"Digite o comprimento do terreno: ");
		comprimento= Double.parseDouble(comprimento1);
		
		aux=largura*comprimento;
		
		JOptionPane.showMessageDialog(null, "A area total do terreno e "+ aux, "\n", 0);
		

	}

}