/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

/**
 *
 * @author Carlos
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;

class fechajanela extends WindowAdapter {

    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}

public class Aula01calculadora extends Frame implements ActionListener {

    Label l1, l2, l3;
    Label lblNum1, lblNum2, lblNum3;
    Button btnSomar, btnSubtrair, btnMultiplicar, btnDividir, btnLimpar, btnSair;
    TextField txtNum1, txtNum2, txtNum3;

    public static void main(String args[]) {
        Aula01calculadora Janela = new Aula01calculadora();
        Janela.addWindowListener(new fechajanela());
        Janela.show();
    }

    Aula01calculadora() {
        setTitle("Calculadora");
        setSize(250, 195);
        setLocation(50, 50);
        setBackground(new Color(150, 150, 150));
        setLayout(new GridLayout(6, 2));
        lblNum1 = new Label("Num.1");
        lblNum1.setForeground(Color.white);
        lblNum2 = new Label("Num.2");
        lblNum2.setForeground(Color.white);
        lblNum3 = new Label("Total");
        lblNum3.setForeground(Color.white);
        lblNum1.setFont(new Font("", Font.BOLD, 14));
        lblNum2.setFont(new Font("", Font.BOLD, 14));
        lblNum3.setFont(new Font("", Font.BOLD, 14));
        btnSomar = new Button("+");
        btnSomar.addActionListener(this);
        btnSubtrair = new Button("-");
        btnSubtrair.addActionListener(this);
        btnMultiplicar = new Button("x");
        btnMultiplicar.addActionListener(this);
        btnDividir = new Button("/");
        btnDividir.addActionListener(this);
        btnLimpar = new Button("Limpar");
        btnLimpar.addActionListener(this);
        btnLimpar.setBackground(Color.black);
        btnLimpar.setForeground(Color.white);
        btnSair = new Button("Sair");
        btnSair.addActionListener(this);
        txtNum1 = new TextField();
        txtNum2 = new TextField();
        txtNum3 = new TextField();
        txtNum3.setEditable(false);  //define que o textField como somente leitura
        add(lblNum1);
        add(txtNum1);
        add(lblNum2);
        add(txtNum2);
        add(lblNum3);
        add(txtNum3);
        add(btnSomar);
        add(btnSubtrair);
        add(btnMultiplicar);
        add(btnDividir);
        add(btnLimpar);
        add(btnSair);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnLimpar) {
            txtNum1.setText("");
            txtNum2.setText("");
            txtNum3.setText("");
            return;
        }

        if (e.getSource() == btnSair) {
            txtNum1.setText("");
            txtNum2.setText("");
            txtNum3.setText("");
            dispose();
            return;
        }

        float N1 = 0, N2 = 0, result = 0;
        try {
            N1 = Float.parseFloat(txtNum1.getText());
            N2 = Float.parseFloat(txtNum2.getText());
        } catch (NumberFormatException erro) {
            txtNum3.setText("Erro");
            return;
        }
        if (e.getSource() == btnSomar) {
            result = N1 + N2;
        }
        if (e.getSource() == btnSubtrair) {
            result = N1 - N2;
        }
        if (e.getSource() == btnMultiplicar) {
            result = N1 * N2;
        }
        if (e.getSource() == btnDividir) {
            result = N1 / N2;
        }

        txtNum3.setText("" + result);
    }

}
