package com.kgivler.BullsEye;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class BullsEye {
    int x;
    int y;

    public BullsEye(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics2D g2)
    {
        int numRings = 5;
        int widthAndHeight = 250;
        int widthAndHeightDecrese = widthAndHeight / numRings;

        for(int i = 0; i < numRings; i++)
        {
            if((i + 1) % 2 == 0)
                g2.setColor(Color.WHITE);
            else
                g2.setColor(Color.BLACK);
            
            Ellipse2D.Double ring = new Ellipse2D.Double(x - widthAndHeight / 2, y - widthAndHeight / 2, widthAndHeight, widthAndHeight);

            widthAndHeight -= widthAndHeightDecrese;
            g2.fill(ring);
        }
    }
}