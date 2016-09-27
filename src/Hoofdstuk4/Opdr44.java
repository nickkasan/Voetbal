package Hoofdstuk4;

/**
 * Created by nickkasan on 15-09-16.
 */

import java.awt.*;
import java.applet.*;

public class Opdr44 extends Applet {

    public void init () {
    }

    public void paint (Graphics g) {
    setBackground(Color.WHITE);
    g.drawLine(40, 60, 40, 250);
    g.setColor(Color.BLACK);
    g.fillRect(50, 160, 60, 80);
    g.setColor(Color.YELLOW);
    g.fillRect(120, 80, 60, 160);
    g.setColor(Color.RED);
    g.fillRect(190, 60, 60, 180);


//  Namen
    g.setColor(Color.BLACK);
    g.drawString("Valerie", 60, 260);
    g.setColor(Color.RED);
    g.drawString("Hans", 200, 260);
    g.setColor(Color.YELLOW);
    g.drawString("Jeroen", 130, 260);



        g.setColor(Color.black);
        g.drawString("0", 10, 250);
        g.setColor(Color.black);
        g.drawString("20", 10, 210);
        g.setColor(Color.black);
        g.drawString("40", 10, 170);
        g.setColor(Color.black);
        g.drawString("60", 10, 130);
        g.setColor(Color.black);
        g.drawString("80", 10, 100);
        g.setColor(Color.black);
        g.drawString("100", 10, 70);






    }































}