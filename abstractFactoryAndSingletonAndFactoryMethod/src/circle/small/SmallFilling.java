package circle.small;

import circle.Filling;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class SmallFilling implements Filling {
    public SmallFilling(Graphics2D g){
        Ellipse2D.Double ellipse = new Ellipse2D.Double(0, 0, 100, 100);
        g.setColor(Color.BLUE);
        g.fill(ellipse);
    }
}
