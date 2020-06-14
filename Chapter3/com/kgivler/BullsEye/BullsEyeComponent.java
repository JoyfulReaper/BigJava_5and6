package com.kgivler.BullsEye;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

import java.awt.Rectangle;

public class BullsEyeComponent extends JComponent {
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;

        // Rectangle r = new Rectangle(centerX, centerY, 1,1);
        // g2.draw(r);

        BullsEye b = new BullsEye(centerX, centerY);
        b.draw(g2);
    }
}