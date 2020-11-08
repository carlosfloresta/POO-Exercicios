
package Menu;


import aula02.curso;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;


class FrameCurso extends JFrame {
    private curso meuApplet;
    public FrameCurso() {
        super ("Aula02");
        setBounds (50, 50, 300, 300);
        JLabel lbl = new JLabel ("Curso");
        lbl.setBorder (BorderFactory.createLineBorder (Color.BLUE));
        add (lbl, BorderLayout.NORTH);
        meuApplet = new curso();
        add (meuApplet, BorderLayout.CENTER);
    }
    public static void main(String[] args) {
        FrameCurso ta = new FrameCurso ();
        ta.setVisible (true);
    }
}