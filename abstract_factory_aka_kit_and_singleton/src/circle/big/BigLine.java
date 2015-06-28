package circle.big;

import circle.Line;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class BigLine implements Line {
    public BigLine(Graphics2D g){
        g.draw(new Ellipse2D.Double(0, 0, 500, 500));
    }
}
