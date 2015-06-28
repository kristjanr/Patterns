package circle.small;

import circle.Line;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class SmallLine implements Line {
    public SmallLine(Graphics2D g) {
        g.setColor(Color.BLACK);
        g.draw(new Ellipse2D.Double(0, 0, 100, 100));
    }
}
