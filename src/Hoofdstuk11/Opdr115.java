package Hoofdstuk11;

/**
 * Created by nickkasan on 15-11-16.
 */

import java.awt.*;
import java.applet.*;

public class Opdr115 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 0;

        for(teller = 1; teller <6; teller++) {
            y += 20;
            g.drawRect(y, y, 20, 20);
        }
    }
}