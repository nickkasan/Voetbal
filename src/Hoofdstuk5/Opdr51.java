package Hoofdstuk5;

/**
 * Created by nickkasan on 20-09-16.
 */

import java.awt.*;
import java.applet.*;

public class Opdr51 extends Applet {
    Color ksi;
    Color vullendekleur;
    int hoogte;
    int breedte;

    public void init() {
        vullendekleur = Color.magenta;
        ksi = Color.magenta;
        hoogte = 50;
        breedte = 50;
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);


        g.drawLine(10, 20, 120, 20);
        g.drawString("Lijn", 50, 35);

        g.drawRect(10, 45, 110, hoogte);
        g.drawString("Rechthoek", 30, 110);

        g.drawRoundRect(10, 120, 110, 60, 15, 15);
        g.drawString("Afgeronde rechthoek", 10, 195);

        g.setColor(vullendekleur);
        g.fillRect(140, 45, 110, hoogte);
        g.setColor(ksi);
        g.drawOval(140, 45, 110, hoogte);
        g.drawString("Rechthoek met ovaal", 130, 110);

        g.setColor(vullendekleur);
        g.fillOval(140, 125, 110, hoogte);
        g.setColor(ksi);
        g.drawString("Gevulde ovaal", 155, 195);

        g.drawOval(270, 45, 110, hoogte);
        g.setColor(vullendekleur);
        g.fillArc(270, 45, 110, 50, 350, 50);
        g.setColor(ksi);
        g.drawString("Taartpunt met ovaal", 270, 110);

        g.drawOval(300, 125, breedte, hoogte);
        g.drawString("Cirkel", 305, 195);


    }
}

