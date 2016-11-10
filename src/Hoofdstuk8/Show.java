package Hoofdstuk8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Show extends Applet {
    TextField input1;
    TextField input2;

    Button keerKnop;
    Button deelknop;
    Button plusknop;
    Button minknop;

    double getal1;
    double getal2;


    public void init() {
        super.init();

        setSize(500, 400);

        input1 = new TextField("", 20);
        add(input1);

        input2 = new TextField("", 20);
        add(input2);

        keerKnop = new Button("X");
        keerKnopLuisteraar keerKnopLuisteraar = new keerKnopLuisteraar();
        keerKnop.addActionListener(keerKnopLuisteraar);
        add(keerKnop);

        deelknop = new Button("/");
        deelKnopLuisteraar deelKnopLuisteraar = new deelKnopLuisteraar();
        deelknop.addActionListener(deelKnopLuisteraar);
        add(deelknop);

        plusknop = new Button("+");
        plusKnopLuisteraar plusKnopLuisteraar = new plusKnopLuisteraar();
        plusknop.addActionListener(plusKnopLuisteraar);
        add(plusknop);

        minknop = new Button("-");
        minKnopLuisteraar minKnopLuisteraar = new minKnopLuisteraar();
        minknop.addActionListener(minKnopLuisteraar);
        add(minknop);


    }


    class keerKnopLuisteraar implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            String arg1 = input1.getText();
            getal1 = Double.parseDouble(arg1);

            String arg2 = input2.getText();
            getal2 = Double.parseDouble(arg2);

            double uitkomst = getal1 * getal2;

            input1.setText("" + uitkomst);

            input2.setText("");


        }
    }

    class deelKnopLuisteraar implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            String arg1 = input1.getText();
            getal1 = Double.parseDouble(arg1);

            String arg2 = input2.getText();
            getal2 = Double.parseDouble(arg2);

            double uitkomst = getal1 / getal2;

            input1.setText("" + uitkomst);

            input2.setText("");


        }
    }

    class plusKnopLuisteraar implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            String arg1 = input1.getText();
            getal1 = Double.parseDouble(arg1);

            String arg2 = input2.getText();
            getal2 = Double.parseDouble(arg2);

            double uitkomst = getal1 + getal2;

            input1.setText("" + uitkomst);
            input2.setText("");


        }
    }

    class minKnopLuisteraar implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            String arg1 = input1.getText();
            getal1 = Double.parseDouble(arg1);

            String arg2 = input2.getText();
            getal2 = Double.parseDouble(arg2);

            double uitkomst = getal1 - getal2;

            input1.setText("" + uitkomst);

            input2.setText("");


        }
    }

}




