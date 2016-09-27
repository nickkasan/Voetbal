package Hoofdstuk4;

/**
 * Created by nickkasan on 20-09-16.
 */

import java.awt.*;
import java.applet.*;

public class Show extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);


        g.drawLine(10, 20, 120, 20);
        g.drawString("Lijn", 50, 35);

        g.drawRect(10, 45, 110, 50);
        g.drawString("Rechthoek", 30, 110);

        g.drawRoundRect(10, 120, 110, 60, 15, 15);
        g.drawString("Afgeronde rechthoek", 10, 195);

        g.setColor(Color.magenta);
        g.fillRect(140, 45, 110, 50);
        g.setColor(Color.BLACK);
        g.drawOval(140, 45, 110, 50);
        g.drawString("Rechthoek met ovaal", 130, 110);

        g.setColor(Color.magenta);
        g.fillOval(140, 125, 110, 50);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal", 155, 195);

        g.drawOval(270, 45, 110, 50);
        g.setColor(Color.magenta);
        g.fillArc(270, 45, 110, 50, 350, 50);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal", 270, 110);

        g.drawOval(300, 125, 50, 50);
        g.drawString("Cirkel", 305, 195);


    }
}
