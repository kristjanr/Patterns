import circle.AbstractCircleFactory;
import circle.big.BigCircleFactory;
import circle.small.SmallCircleFactory;

public class Main {

    public static void main(String[] args) {
        buildCircle(SmallCircleFactory.instance());
        buildCircle(BigCircleFactory.instance());
    }

    // TODO: Actually create a 2D circle with a circular black line and fill it with some other colour.
    private static void buildCircle(AbstractCircleFactory factory) {
        factory.makeFilling();
        factory.makeLine();
    }
}
