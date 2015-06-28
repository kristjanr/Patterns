package circle.small;

import circle.CircleFactory;
import circle.Filling;
import circle.Line;

import java.awt.*;

public class SmallCircleFactory implements CircleFactory {

    private static SmallCircleFactory smallCircleFactory = null;

    private SmallCircleFactory() {
    }

    public synchronized static SmallCircleFactory instance(){
        if (smallCircleFactory == null) {
            smallCircleFactory = new SmallCircleFactory();
        }
        return smallCircleFactory;
    }

    @Override
    public Line makeLine(Graphics2D g) {
        return new SmallLine(g);
    }

    @Override
    public Filling makeFilling(Graphics2D g) {
        return new SmallFilling(g);
    }
}
