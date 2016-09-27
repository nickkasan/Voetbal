package Hoofdstuk2;

import java.awt.*;
import java.applet.*;

public class Opdr22 extends Applet {

    public void init() {
        setBackground(Color.white);

    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Nick", 50, 60 );

        g.setColor(Color.red);
        g.drawString("Kasan", 50, 90);
    }
}


