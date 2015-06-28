package circle;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    CircleFactory factory = null;
    public MyPanel(CircleFactory factory) {
        this.factory = factory;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        factory.makeLine(g2d);
        factory.makeFilling(g2d);
    }
}
