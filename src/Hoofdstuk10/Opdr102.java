package Hoofdstuk10;

/**
 * Created by nickkasan on 11-10-16.
 */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdr102 extends Applet {

    private TextField getalTextfield;
    private double hoogsteGetal;
    private double laagsteGetal;


    @Override
    public void init() {
        super.init();

        getalTextfield = new TextField("", 7);
        Label getalTextLabel = new Label("Voer hier uw getal in: ");
        getalTextfield.addActionListener(new TextfieldListener());
        add(getalTextLabel);
        add(getalTextfield);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.drawString("Het hoogste getal is: " + hoogsteGetal, 50, 60);
        g.drawString("Het laagste getal is: " + laagsteGetal, 50, 90);
    }


    private class TextfieldListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            double huidigGetal = Double.parseDouble(getalTextfield.getText());
            if (huidigGetal > hoogsteGetal) {
                hoogsteGetal = huidigGetal;
                repaint();

            } else if (laagsteGetal < huidigGetal) {
                laagsteGetal = huidigGetal;
                repaint();
            } else {
                repaint();
            }
        }
    }
}