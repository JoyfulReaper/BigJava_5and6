package com.kgivler.car;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class Car {
    /**
     * Constructs a car with the given top-left corner.
     * @param x x coordinate of top right corner
     * @param y y coordinate of top right corner
     */
    public Car(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }

    /**
     * Draws the car.
     * @param g2 the graphics context
     */
    public void draw(Graphics2D g2)
    {
        Rectangle body = 
            new Rectangle(xLeft, yTop + 10, 60, 10);
        Ellipse2D.Double frontTire = 
            new Ellipse2D.Double(xLeft + 10, yTop + 20, 10, 10);
        Ellipse2D.Double rearTire =
            new Ellipse2D.Double(xLeft + 40, yTop + 20, 10, 10);
        
        // Bottom of front windsheild
        Point2D.Double r1 =
            new Point2D.Double(xLeft + 10, yTop + 10);
        // Front of the roof
        Point2D.Double r2 =
            new Point2D.Double(xLeft + 20, yTop);
        // Rear of the roof
        Point2D.Double r3 =
            new Point2D.Double(xLeft + 40, yTop);
        // Bottom of rear windsheild
        Point2D.Double r4 =
            new Point2D.Double(xLeft + 50, yTop + 10);

        Line2D.Double frontWindsheild =
            new Line2D.Double(r1, r2);
        Line2D.Double roofTop =
            new Line2D.Double(r2, r3);
        Line2D.Double rearWindsheild =
            new Line2D.Double(r3, r4);

        g2.draw(body);
        g2.draw(frontTire);
        g2.draw(rearTire);
        g2.draw(frontWindsheild);
        g2.draw(roofTop);
        g2.draw(rearWindsheild);
    }
    private int xLeft;
    private int yTop;
}