package Menu;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class Aula02polinomio extends Frame implements ActionListener {

    Label l1, l2, l3;
    Label lblNum1, lblNum2, lblNum3, lblNum4, lblNum5;
    Button btnCalcular, btnLimpar, btnSair;
    TextField txtNum1, txtNum2, txtNum3, txtNum4, txtNum5;

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Aula02polinomio Janela = new Aula02polinomio();
        Janela.addWindowListener(new fechajanela());
        Janela.show();
    }

    Aula02polinomio() {

        setTitle("Calculo do Polinomio");
        setSize(300, 250);
        setLocation(100, 100);
        setBackground(new Color(150, 150, 150));
        setLayout(new GridLayout(8, 2));
        lblNum1 = new Label("A ");
        lblNum1.setForeground(Color.white);
        lblNum2 = new Label("B ");
        lblNum2.setForeground(Color.white);
        lblNum3 = new Label("C");
        lblNum3.setForeground(Color.white);
        lblNum4 = new Label("X1 ");
        lblNum4.setForeground(Color.white);
        lblNum5 = new Label("X2 ");
        lblNum5.setForeground(Color.white);

        lblNum1.setFont(new Font("", Font.BOLD, 14));
        lblNum2.setFont(new Font("", Font.BOLD, 14));
        lblNum3.setFont(new Font("", Font.BOLD, 14));
        lblNum4.setFont(new Font("", Font.BOLD, 14));
        lblNum5.setFont(new Font("", Font.BOLD, 14));

        btnCalcular = new Button("Calcular ");
        btnCalcular.addActionListener(this);
        btnLimpar = new Button("Limpar");
        btnLimpar.addActionListener(this);
        btnLimpar.setBackground(Color.black);
        btnLimpar.setForeground(Color.white);
        btnSair = new Button("Sair");
        btnSair.addActionListener(this);

        txtNum1 = new TextField();
        txtNum2 = new TextField();
        txtNum3 = new TextField();
        txtNum4 = new TextField();
        txtNum5 = new TextField();

        txtNum4.setEditable(false);
        txtNum5.setEditable(false); //define que o textField como somente leitura
        add(lblNum1);
        add(txtNum1);
        add(lblNum2);
        add(txtNum2);
        add(lblNum3);
        add(txtNum3);
        add(lblNum4);
        add(txtNum4);
        add(lblNum5);
        add(txtNum5);
        add(btnCalcular);
        add(btnLimpar);
        add(btnSair);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnLimpar) {
            txtNum1.setText("");
            txtNum2.setText("");
            txtNum3.setText("");
            txtNum4.setText("");
            txtNum5.setText("");

            return;
        }

        if (e.getSource() == btnSair) {
            txtNum1.setText("");
            txtNum2.setText("");
            txtNum3.setText("");
            txtNum4.setText("");
            txtNum5.setText("");

            dispose();
            return;
        }

        float N1 = 0, N2 = 0, N3 = 0;
        float delta, r1, r2;
        try {
            N1 = Float.parseFloat(txtNum1.getText());
            N2 = Float.parseFloat(txtNum2.getText());
            N3 = Float.parseFloat(txtNum3.getText());
        } catch (NumberFormatException erro) {
            txtNum4.setText("Erro");
            txtNum5.setText("Erro");
            return;
        }
        if (e.getSource() == btnCalcular) {

            delta = ((N2 * N2) - (4 * N1 * N3));
            r1 = 0;
            r2 = 0;
            if (delta < 0) {

                txtNum4.setText("Nao existem raizes !");
                txtNum5.setText("Nao existem raizes !");
            }

            r1 = (float) ((-N2 + Math.sqrt(delta)) / (2 * N1));
            r2 = (float) ((-N2 - Math.sqrt(delta)) / (2 * N1));

            if (delta == 0) {

                txtNum4.setText("" + r1);

            }
            if (delta > 0) {

                txtNum4.setText("" + r1);
                txtNum5.setText("" + r2);
            }

        }
    }
}
