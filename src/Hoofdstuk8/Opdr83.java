package Hoofdstuk8;

/**
 * Created by nickkasan on 11-10-16.
 */


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdr83 extends Applet {
    TextField input1;


    Button okKnop;

    double getal1;



    public void init() {
        super.init();

        setSize(500, 400);

        input1 = new TextField("", 20);
        add(input1);


        okKnop = new Button("OK");
        okKnopLuisteraar okKnopLuisteraar = new okKnopLuisteraar();
        okKnop.addActionListener(okKnopLuisteraar);
        add(okKnop);

    }


    class okKnopLuisteraar implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            String arg1 = input1.getText();
            getal1 = Double.parseDouble(arg1);


            double uitkomst = getal1 / 100 * 21 + getal1;

            input1.setText("" + uitkomst);




        }
    }


}
