package Lista01;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class exer1 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome1,nome2,nome3;
                
                 String j1 = JOptionPane.showInputDialog("Digite o primeiro nome");
                            nome1 = String.valueOf(j1) ;
                            
                            String j2 = JOptionPane.showInputDialog("Digite o segundo nome");
                            nome2 = String.valueOf(j2) ;
		

                            String j3 = JOptionPane.showInputDialog("Digite o terceiro nome");
                            nome3 = String.valueOf(j3) ;

		
                            JOptionPane.showMessageDialog(null," " + nome1 + " "+ nome3);
                             JOptionPane.showMessageDialog(null," " + nome2);

		
		
		

	}

}
