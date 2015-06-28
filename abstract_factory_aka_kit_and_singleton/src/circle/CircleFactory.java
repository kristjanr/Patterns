package circle;

import java.awt.*;

public interface CircleFactory {
    Line makeLine(Graphics2D g);
    Filling makeFilling(Graphics2D g);
}

