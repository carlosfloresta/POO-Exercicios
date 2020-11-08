package Lista01;

import javax.swing.JOptionPane;

public class exer5 {

	public static void main(String[] args) {
		
		double comprimento,largura,profundidade,soma,total;
		 String comprimento1,largura1,profundidade1;
		 
		 largura1= JOptionPane.showInputDialog(null,"Digite a largura da piscina : ");
		 largura= Double.parseDouble(largura1);
			
		 comprimento1= JOptionPane.showInputDialog(null,"Digite o comprimento da piscina : ");
		 comprimento= Double.parseDouble(comprimento1);
		 
		 profundidade1= JOptionPane.showInputDialog(null,"Digite a profundidade : ");
		 profundidade= Double.parseDouble(largura1);
		 
		 
		 soma=(largura*comprimento*profundidade);
		 
		 total=(soma*45.00);
		 
		 
		 JOptionPane.showMessageDialog(null, "Valor da construção e R$ "+ total, "\n", 0);

	}

}
