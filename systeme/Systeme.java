package systeme;

import body.Planet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class Systeme extends JPanel {

    Planet M;
    Planet m;

    double dt = 10000;
    double t = 0.0;

    int echelle = 900000;

    public Systeme(Planet a, Planet m) {
        this.M = a;
        this.m = m;
    }

    public void move() {
        this.M.move(dt, m);
        this.m.move(dt, M);
        this.t += dt;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.translate(this.getWidth() / 2, this.getHeight() / 2);
        g2d.scale(1, -1);

        g2d.setColor(Color.BLUE);
        g2d.fillOval((int) (M.getPosition().getX() / echelle), (int) (M.getPosition().getY() / echelle), (int) (M.getRayon() / echelle), (int) (M.getRayon() / echelle));

        g2d.setColor(Color.GRAY);
        g2d.fillOval((int) (m.getPosition().getX() / echelle), (int) (m.getPosition().getY() / echelle), 30, 30);
    }

}