package Hoofdstuk6;



/**
 * Created by nickkasan on 21-09-16.
 */

import java.awt.*;
import java.applet.*;

public class Show extends Applet {


    private double cijfer1;
    private double cijfer2;
    private double cijfer3;

    double uitkomst;
    double gemiddelde;
    int afgekapt;

    public void init() {
        super.init();
        cijfer1 = 5.9;
        cijfer2 = 6.3;
        cijfer3 = 6.9;
        gemiddelde = (cijfer1 + cijfer2 + cijfer3) / 3;
        afgekapt = (int) (gemiddelde * 10);
        uitkomst = (double) afgekapt / 10;

    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }




}