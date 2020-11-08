package Menu;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GuiMenuPrincipal_Teste extends JFrame {

    private Container contentPane;
    private JMenuBar mnBarra;
    private JMenu mnArquivo, mnExercicios, mnAluno, mnSobre;
    private JMenuItem miSair, miAula01, miAula02, miLista01;
    private JMenuItem miLista02, miLista03, miLista04, miLista05, miAluno, miSobre;
    private JLabel fatec;

    public GuiMenuPrincipal_Teste() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {

        setTitle("Menu Exercicios");
        setBounds(0, 0, 800, 600);

        contentPane = getContentPane();
        contentPane.setBounds(130, 150, 500, 300);

        fatec = new JLabel("Programação Orientada a Objetos");
        fatec.setForeground(Color.black);
        fatec.setFont(new Font("", Font.BOLD, 17));
        fatec.setBounds(270, 10, 1000, 50);

        JLabel limage;
        limage = new JLabel();
        limage.setIcon(new ImageIcon(getClass().getResource("/Menu/fundomenu.jpg")));

        limage.setBounds(130, 150, 500, 300);

        add(fatec);

        add(limage);

        mnBarra = new JMenuBar();
        mnArquivo = new JMenu("Arquivo");
        mnArquivo.setMnemonic('A');

        mnExercicios = new JMenu("Exercicios");
        mnExercicios.setMnemonic('E');

        miSair = new JMenuItem("Sair", new ImageIcon(getClass().getResource("/Menu/iconefechar.png")));
        miSair.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
        miAula01 = new JMenuItem("Aula 01", new ImageIcon(getClass().getResource("/Menu/PastaIcone.png")));
        miAula02 = new JMenuItem("Aula 02", new ImageIcon(getClass().getResource("/Menu/PastaIcone.png")));
        miLista01 = new JMenuItem("Lista 01", new ImageIcon(getClass().getResource("/Menu/PastaIcone.png")));
        miLista02 = new JMenuItem("Lista 02", new ImageIcon(getClass().getResource("/Menu/PastaIcone.png")));
        miLista03 = new JMenuItem("Lista 03", new ImageIcon(getClass().getResource("/Menu/PastaIcone.png")));
        miLista04 = new JMenuItem("Lista 04", new ImageIcon(getClass().getResource("/Menu/PastaIcone.png")));
        miLista05 = new JMenuItem("Lista 05", new ImageIcon(getClass().getResource("/Menu/PastaIcone.png")));

        mnArquivo.add(miSair);
        mnExercicios.add(miAula01);
        mnExercicios.add(miAula02);
        mnExercicios.add(miLista01);
        mnExercicios.add(miLista02);
        mnExercicios.add(miLista03);
        mnExercicios.add(miLista04);
        mnExercicios.add(miLista05);

        mnBarra.add(mnArquivo);
        mnBarra.add(mnExercicios);

        setJMenuBar(mnBarra);

    }

    private void definirEventos() {
        miSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        miAula01.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                MenuAula01 menuaula01 = new MenuAula01();

                contentPane.removeAll();
                contentPane.add(menuaula01);
                contentPane.validate();

            }
        });
        miAula02.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                MenuAula02 menuaula02 = new MenuAula02();
                contentPane.removeAll();
                contentPane.add(menuaula02);
                contentPane.validate();
            }
        });
        miLista01.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                MenuLista01 menulista01 = new MenuLista01();
                contentPane.removeAll();
                contentPane.add(menulista01);
                contentPane.validate();
            }
        });
        miLista02.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                MenuLista02 menulista02 = new MenuLista02();
                contentPane.removeAll();
                contentPane.add(menulista02);
                contentPane.validate();

            }
        });
        miLista03.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                MenuLista03 menulista03 = new MenuLista03();
                contentPane.removeAll();
                contentPane.add(menulista03);
                contentPane.validate();
            }
        });
        miLista04.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                MenuLista04 menulista04 = new MenuLista04();
                contentPane.removeAll();
                contentPane.add(menulista04);
                contentPane.validate();

            }
        });
        miLista05.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                MenuLista05 menulista05 = new MenuLista05();
                contentPane.removeAll();
                contentPane.add(menulista05);
                contentPane.validate();
            }
        });

    }

    public static void abrir() {
        GuiMenuPrincipal_Teste frame = new GuiMenuPrincipal_Teste();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((tela.width - frame.getSize().width) / 2, (tela.height - frame.getSize().height) / 2);
        frame.setVisible(true);
    }
}
