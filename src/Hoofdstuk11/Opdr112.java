package Hoofdstuk11;

/**
 * Created by nickkasan on 14-11-16.
 */

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdr112 extends Applet {

    public void paint(Graphics g) {
        int teller;
        int x = 0;


        for (teller = 10; teller <= 20; teller++) {
            x += 20;
            g.drawString("" + teller, x, 50);
        }
    }
}