package affichage;

import body.Planet;
import javax.swing.JFrame;
import javax.swing.Timer;
import systeme.Systeme;

public class MaFenetre extends JFrame {
    Systeme systeme;

    public MaFenetre(Planet M, Planet m) {
        this.systeme = new Systeme(M, m);
        this.setDefaultCloseOperation(3);
        this.setSize(1000, 1000);
        this.add(systeme);
        this.setVisible(true);
        this.setTitle("Two Body Problem");

        Timer timer = new Timer(50 , e -> {
            systeme.move();
            systeme.repaint();
        });

        timer.start();
    }
}
