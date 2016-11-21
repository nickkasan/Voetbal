package Hoofdstuk11;

import java.awt.*;
import java.applet.*;

public class Opdr116 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int cirkel = 10;
        int y = 80;
        int x = 120;

        for(teller = 1; teller < 6; teller++) {
            cirkel += 20;
            x -= 10;
            y -= 10;
            g.drawOval(y, x, cirkel, cirkel);;
        }
    }
}