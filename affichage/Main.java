package affichage;

import body.Planet;
import position.Point;

public class Main {

    public static void main(String[] args) {
        Point positionM = new Point(-4.636108e6, 0);
        Point vitesseM = new Point(0, -12.58);

        Point positionm = new Point(3.83936392e8, 0);
        Point vitessem = new Point(0, 1022);

        Point accelerationM = new Point(0, 0);
        Planet M = new Planet(5.972e24, positionM, vitesseM, accelerationM, 6371e3);

        Point accelerationm = new Point(0, 0);
        Planet m = new Planet(7.34767309e22, positionm, vitessem, accelerationm, 1737.4e3);

        MaFenetre maFenetre = new MaFenetre(M, m);
    }

}
