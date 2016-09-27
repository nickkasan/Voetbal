package Hoofdstuk4;

/**
 * Created by nickkasan on 16-09-16.
 */

import java.awt.*;
import java.applet.*;

public class Opdr47 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.gray);

        g.setColor(Color.white);
        g.fillRoundRect(40, 40, 200, 200, 40, 40);

        g.setColor(Color.black);
        g.fillOval(65, 60, 50, 50);

        g.setColor(Color.black);
        g.fillOval(165, 60, 50, 50);

        g.setColor(Color.black);
        g.fillOval(165, 165, 50, 50);

        g.setColor(Color.black);
        g.fillOval(65, 165, 50, 50);

    }
}