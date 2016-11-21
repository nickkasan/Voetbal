package Hoofdstuk11;

import java.awt.*;
import java.applet.*;

public class Opdr117 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int cirkel = 10;
        int y = 720;
        int x = 520;

        for(teller = 1; teller < 51; teller++) {
            cirkel += 20;
            x -= 10;
            y -= 10;
            g.drawOval(y, x, cirkel, cirkel);
        }
    }
}