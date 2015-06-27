package circle.small;

import circle.AbstractCircleFactory;
import circle.Filling;
import circle.Line;

public class SmallCircleFactory implements AbstractCircleFactory {

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
    public Line makeLine() {
        return new SmallLine();
    }

    @Override
    public Filling makeFilling() {
        return new SmallFilling();
    }
}
