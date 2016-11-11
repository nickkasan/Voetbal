package Hoofdstuk10;

        import java.applet.Applet;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class Opdr101 extends Applet {

    private TextField getalTextfield;
    private double hoogsteGetal;

    @Override
    public void init() {
        super.init();

        getalTextfield = new TextField("", 7);
        Label getalTextLabel = new Label("Voer hier uw getal in");
        getalTextfield.addActionListener(new TextfieldListener());
        add(getalTextLabel);
        add(getalTextfield);


    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.drawString("Het hoogste getal is: " + hoogsteGetal, 50, 60);
    }


    private class TextfieldListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            double huidigGetal = Double.parseDouble(getalTextfield.getText());
            if (huidigGetal > hoogsteGetal) {
                hoogsteGetal = huidigGetal;
                repaint();

            } else {
                repaint();
            }
        }
    }
}