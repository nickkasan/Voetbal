package Hoofdstuk4;

/**
 * Created by nickkasan on 13-09-16.
 */
import java.awt.*;
import java.applet.*;

public class Opdr42 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawRect(20, 20, 100, 100);
        g.drawRect(20, 50, 50, 20);
        g.fillRect(20, 50, 50, 20);
        g.drawRect(50, 100, 40, 20);
    }
}