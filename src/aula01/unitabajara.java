package aula01;

import javax.swing.JOptionPane;

public class unitabajara {

	public static void main(String[] args) {
		
	double med;
	
	String p1= JOptionPane.showInputDialog(null,"Digite o primeira Nota: ");
	double p1a= Double.parseDouble(p1);
	
	String p2= JOptionPane.showInputDialog(null,"Digite o segunda Nota: ");
	double p2a= Double.parseDouble(p2);
	
	String p3= JOptionPane.showInputDialog(null,"Digite o terceira Nota: ");
	double p3a= Double.parseDouble(p3);
	
	med=((p1a+p2a+p3a)/3);
	
	if (med<3){
		JOptionPane.showMessageDialog(null,"REPROVADO!");
	
	}else if (med>=3 && med<7){
		JOptionPane.showMessageDialog(null,"NOVA AVALIAÇÃO ");
		String p4 = JOptionPane.showInputDialog(null,"DIGITE A P4: ");
		double p4a= Double.parseDouble(p4);
	
		med=(med+p4a)/2;
		 if(med>=6.0){
			JOptionPane.showMessageDialog(null,"APROVADO APÓS P4 ");	
			
		}else {
			JOptionPane.showMessageDialog(null,"TEM DIREITO A RECUPERAÇÃO ");
			String rec = JOptionPane.showInputDialog(null,"INSERIR RECUPERAÇÃO: ");
			double rec1= Double.parseDouble(rec);
			
			med=med+p4a+rec1;
			
		}
			
	}	
		 if(med>=12){
				JOptionPane.showMessageDialog(null, "APROVADO!");
			
			}else{
				
				JOptionPane.showMessageDialog(null,"REPROVADO!");
				
	}
			
				}
			}
		

	