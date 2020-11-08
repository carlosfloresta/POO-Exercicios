package aula01;

import javax.swing.JOptionPane;


public class maiornumero2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double dn1,dn2,dn3;
		String n1,n2,n3;
		String aux;
		
		
		n1= JOptionPane.showInputDialog(null,"Digite o primeiro numero");
		dn1= Double.parseDouble(n1);
		
		n2= JOptionPane.showInputDialog(null,"Digite o segundo numero");
		dn2= Double.parseDouble(n2);
		
		n3= JOptionPane.showInputDialog(null,"Digite o terceiro numero");
		dn3= Double.parseDouble(n3);
		
		if ((dn1>dn2)&&(dn1>dn3))
		{
			aux=n1;}
			else 
				if (dn2>dn3)
					{aux=n2;}
				else 
					aux=n3;
		
		JOptionPane.showMessageDialog(null, "o maior é"+ aux);

		
		
	}

}