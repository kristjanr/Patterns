package circle.big;

import circle.Filling;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class BigFilling implements Filling {

    public BigFilling(Graphics2D g){
        Ellipse2D.Double ellipse = new Ellipse2D.Double(0, 0, 500, 500);
        g.setColor(Color.YELLOW);
        g.fill(ellipse);
    }
}
