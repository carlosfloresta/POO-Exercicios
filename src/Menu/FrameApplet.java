package Menu;



import aula02.Applet02;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;


class FrameApplet extends JFrame {
    private Applet02 meuApplet;
    public FrameApplet() {
        super ("Aula02");
        setBounds (50, 50, 300, 300);
        JLabel lbl = new JLabel ("Applet02");
        lbl.setBorder (BorderFactory.createLineBorder (Color.BLUE));
        add (lbl, BorderLayout.NORTH);
        meuApplet = new Applet02();
        add (meuApplet, BorderLayout.CENTER);
    }
    public static void main(String[] args) {
        FrameApplet ta = new FrameApplet ();
        ta.setVisible (true);
    }
}