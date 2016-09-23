package H4.Opdr41;

/**
 * Created by nickkasan on 15-09-16.
 */

import java.awt.*;
import java.applet.*;

public class Opdr41 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        g.setColor(Color.yellow);
        g.drawRect(20, 20, 100, 50);
        g.drawRect(20, 72, 100, 50);
        g.drawRect(20, 120, 100, 50);

        g.setColor(Color.RED);
        g.fillRect(20, 20, 100, 50);

        g.setColor(Color.white);
        g.fillRect(20, 72, 100, 50);

        g.setColor(Color.BLUE);
        g.fillRect(20, 120, 100, 50);

        g.drawLine(120, 120, 120, 190);
    }
}