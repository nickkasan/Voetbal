package Hoofdstuk11;

/**
 * Created by nickkasan on 15-11-16.
 */


import java.awt.*;
import java.applet.*;

public class Opdr114 extends Applet {


    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int T3;
        int y = 0;

        g.drawString("Tafel Van 3", 20, 20);

        for(teller = 1; teller < 11; teller++) {
            T3 = teller * 3;
            y += 20;
            g.drawString("" + T3, 260, y );
            g.drawString(teller + " x 3 =", 205, y );
        }
    }
}