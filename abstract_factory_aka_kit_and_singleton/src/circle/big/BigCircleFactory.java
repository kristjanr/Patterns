package circle.big;

import circle.AbstractCircleFactory;
import circle.Filling;
import circle.Line;

public class BigCircleFactory implements AbstractCircleFactory {

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
    public Line makeLine() {
        return new BigLine();
    }

    @Override
    public Filling makeFilling() {
        return new BigFilling();
    }
}
