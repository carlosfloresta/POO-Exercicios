package Lista01;

import javax.swing.JOptionPane;

public class exer4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double n1,n2,n3,n4,media,soma,restdivi;
		String na,nb,nc,nd;

		na= JOptionPane.showInputDialog(null,"Digite o primeiro numero: ");
		n1= Double.parseDouble(na);
		
		nb= JOptionPane.showInputDialog(null,"Digite o segundo numero: ");
		n2= Double.parseDouble(nb);
		
		nc= JOptionPane.showInputDialog(null,"Digite o terceiro numero: ");
		n3= Double.parseDouble(nc);
		
		nd= JOptionPane.showInputDialog(null,"Digite o quarto numero: ");
		n4= Double.parseDouble(nd);
		
		
		soma=(n1+n2+n3+n4);
		media=soma/4;
		restdivi= media/soma;
		
		
		JOptionPane.showMessageDialog(null, "A media e : "+ media + "\n" + "A soma e : " + soma + "\n" + "O resto da divisao e : " + restdivi );
		
		

	}

}