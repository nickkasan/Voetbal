package Hoofdstuk8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdr82 extends Applet {
    Button knop;
    Button knop2;
    Button knop3;
    Button knop4;

    String schermtekst;

    Label label;

    String M;
    String V;
    String PV;
    String PM;

    int a;
    int b;
    int c;
    int d;

    int totaal;

    String Totaal;


    public void init() {
        schermtekst = " ";

        knop = new Button("1");
        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);
        add(knop);

        knop2 = new Button("2");
        add(knop2);

        knop3 = new Button("3");
        add(knop3);

        knop4 = new Button ("4");
        add(knop4);

        label = new Label("");
        add(label);

        a = 48;
        b = 22;
        c = 11;
        d = 3;
        totaal = (a + b + c +d);

    }

    public void paint(Graphics g) {
        g.drawString(M, 70, 70);
        g.drawString(V, 70, 90);
        g.drawString(PV, 70, 110);
        g.drawString(PM, 70, 130);
        g.drawString(Totaal, 70, 170);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            M = "Mannen : " + a;

            V = "Vrouwen : " + b;

            PV = "Potentiële vrouwen : " + c;

            PM = "Potentiële mannen : " + d;

            Totaal = "totaal : " + totaal;

            repaint();
        }
    }

}