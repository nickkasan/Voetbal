package Hoofdstuk6;

/**
 * Created by nickkasan on 22-09-16.
 */

import java.awt.*;
import java.applet.*;


public class Opdr63 extends Applet {

    int positiefgetal1;
    int positiefgetal2;
    int uitkomst;





    public void init() {
        super.init();

        positiefgetal1 = 2147483647;
        positiefgetal2 = 1;
        uitkomst = (positiefgetal1 + positiefgetal2);




    }

    public void paint(Graphics g) {

        g.drawString("" + uitkomst, 20, 40);

    }




}
