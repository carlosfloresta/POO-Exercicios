
package Lista05;

import javax.swing.JOptionPane;


public class Motor {
	boolean status = false;
	int velocidade = 0;
	int voltagem = 0;
	String fabricante = "";
	void ligaMotor(int voltagem) {
		this.voltagem = voltagem;
		status = true;
		JOptionPane.showMessageDialog(null,"Motor ligado, voltagem = " + this.voltagem);
	}
	void desligaMotor() {
		status = false;
		JOptionPane.showMessageDialog(null,"Motor desligado");
	}
	int verificaVelocidade(int velocidade) {
               this.velocidade = velocidade;
		return velocidade;
	}
	public static void main(String args[]) {
		Motor motor = new Motor();
		motor.fabricante = "Ford";
		JOptionPane.showMessageDialog(null,"O fabricante do motor é " + motor.fabricante);
		motor.ligaMotor(12);
		JOptionPane.showMessageDialog(null,"A velocidade é " + motor.verificaVelocidade(80)+" RPM");
		motor.desligaMotor();
	}
}

