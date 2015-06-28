package circle.big;

import circle.CircleFactory;
import circle.Filling;
import circle.Line;

import java.awt.*;

public class BigCircleFactory implements CircleFactory {

    private static BigCircleFactory bigCircleFactory = null;

    private BigCircleFactory() {
    }

    public synchronized static BigCircleFactory instance() {
        if (bigCircleFactory == null) {
            bigCircleFactory = new BigCircleFactory();
        }
        return bigCircleFactory;
    }

    @Override
    public Line makeLine(Graphics2D g) {
        return new BigLine(g);
    }

    @Override
    public Filling makeFilling(Graphics2D g) {
        return new BigFilling(g);
    }
}
