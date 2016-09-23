package H6.Opdr61;



/**
 * Created by nickkasan on 21-09-16.
 */

import java.awt.*;
import java.applet.*;


public class Opdr61 extends Applet {


    int Geld;
    int uitkomst;


    double gemiddelde;


    public void init() {
        super.init();
        Geld = 113;
        uitkomst = (Geld) / 3;



    }

    public void paint(Graphics g) {
        g.drawString("Het geld verdeeld over 3 personen: " + uitkomst, 20, 20);
        g.drawString("Jan krijgt: " + uitkomst, 20, 40);
        g.drawString("Ali krijgt: " + uitkomst, 20, 60);
        g.drawString("Jeannette krijgt: " + uitkomst, 20, 80);
        g.drawString("Nick krijgt: " + uitkomst, 20, 100);
    }




}

