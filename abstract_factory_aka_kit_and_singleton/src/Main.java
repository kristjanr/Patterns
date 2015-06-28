import circle.MyPanel;
import circle.big.BigCircleFactory;
import circle.small.SmallCircleFactory;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Circles");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        MyPanel firstPanel = new MyPanel(SmallCircleFactory.instance());
        MyPanel secondPanel = new MyPanel(BigCircleFactory.instance());

        GridLayout gridLayout = new GridLayout(1,2);
        JPanel parentPanel = new JPanel(gridLayout);
        parentPanel.add(firstPanel);
        parentPanel.add(secondPanel);
        frame.getContentPane().add(parentPanel);

        frame.setMinimumSize(new Dimension(1200, 600));
        frame.pack();
        frame.setVisible(true);
    }
}

// Singletons: http://www.javaworld.com/article/2073352/core-java/simply-singleton.html

// Multiple panels in a frame: http://stackoverflow.com/questions/23855974/multiple-panels-in-jframe

// extending JPanel as MyPanel: http://www.coderanch.com/t/345202/GUI/java/Create-Graphics-object

// drawing Ellipses: https://docs.oracle.com/javase/tutorial/2d/geometry/primitives.html

// filling Ellipses: https://docs.oracle.com/javase/8/docs/api/java/awt/Graphics2D.html

// building a frame: https://docs.oracle.com/javase/tutorial/uiswing/components/frame.html
