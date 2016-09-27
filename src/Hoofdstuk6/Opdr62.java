package Hoofdstuk6;

/**
 * Created by nickkasan on 22-09-16.
 */

import java.awt.*;
import java.applet.*;


public class Opdr62 extends Applet {

    int seconde;
    int uur;
    int dag;
    int jaar;





    public void init() {
        super.init();

        seconde = 60;
        uur = (seconde) * 60;
        dag = (uur) * 24;
        jaar = (dag) * 365;




    }

    public void paint(Graphics g) {

        g.drawString("Seconde in een uur: " + uur, 20, 40);
        g.drawString("Seconde in een dag: " + dag, 20, 60);
        g.drawString("Seconde in een jaar: " + jaar, 20, 80);

    }




}
