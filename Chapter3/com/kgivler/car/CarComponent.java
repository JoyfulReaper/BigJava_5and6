package com.kgivler.car;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * This Component draws two car shapes
 */
public class CarComponent extends JComponent {
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Car Car1 = new Car(0,0);

        int x = getWidth() - 60;
        int y = getHeight() - 30;
        Car Car2 = new Car(x,y);

        Car1.draw(g2);
        Car2.draw(g2);
    }
}