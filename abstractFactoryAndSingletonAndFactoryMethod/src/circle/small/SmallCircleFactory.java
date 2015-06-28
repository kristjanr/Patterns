package circle.small;

import circle.CircleFactory;
import circle.Filling;
import circle.Line;

import java.awt.*;

public class SmallCircleFactory implements CircleFactory {

    // Singleton pattern begins
    private static SmallCircleFactory smallCircleFactory = null;

    private SmallCircleFactory() {
    }

    public synchronized static SmallCircleFactory instance(){
        if (smallCircleFactory == null) {
            smallCircleFactory = new SmallCircleFactory();
        }
        return smallCircleFactory;
    }
    // Singleton pattern ends

    // Factory method aka Virtual Constructor pattern
    @Override
    public Line makeLine(Graphics2D g) {
        return new SmallLine(g);
    }

    // Factory method aka Virtual Constructor pattern
    @Override
    public Filling makeFilling(Graphics2D g) {
        return new SmallFilling(g);
    }
}
