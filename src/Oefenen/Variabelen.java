package Oefenen;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by nickkasan on 14-09-16.
 */
public class Variabelen extends Applet{

     Color achtergrond;
     Color tekst;
     int getal;
     int getal2;

    public void init() {
        super.init();
        achtergrond = Color.pink;
        tekst = Color.blue;
        getal = 15;
        getal2 = 20;


        setBackground(achtergrond);



    }
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(tekst);
        int x = 50;
        int y = 50;
        int som = getal + getal2;
        g.drawString("Het getal is " + getal + getal2, x, y);
        y = y + 20;

    }



}

