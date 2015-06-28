package circle.big;

import circle.CircleFactory;
import circle.Filling;
import circle.Line;

import java.awt.*;

public class BigCircleFactory implements CircleFactory {

    // Singleton pattern begins
    private static BigCircleFactory bigCircleFactory = null;

    private BigCircleFactory() {
    }
    public synchronized static BigCircleFactory instance() {
        if (bigCircleFactory == null) {
            bigCircleFactory = new BigCircleFactory();
        }
        return bigCircleFactory;
    }
    // Singleton pattern ends

    // Factory method aka Virtual Constructor pattern
    @Override
    public Line makeLine(Graphics2D g) {
        return new BigLine(g);
    }

    // Factory method aka Virtual Constructor pattern
    @Override
    public Filling makeFilling(Graphics2D g) {
        return new BigFilling(g);
    }
}
