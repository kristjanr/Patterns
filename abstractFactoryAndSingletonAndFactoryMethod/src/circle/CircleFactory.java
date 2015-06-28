package circle;

import java.awt.*;

// Abstract Factory aka Kit pattern

public interface CircleFactory {

    // Factory method aka Virtual Constructor pattern
    Line makeLine(Graphics2D g);

    // Factory method aka Virtual Constructor pattern
    Filling makeFilling(Graphics2D g);
}

