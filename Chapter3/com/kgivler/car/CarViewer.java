package com.kgivler.car;

import javax.swing.JFrame;

public class CarViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        frame.setSize(300, 400);
        frame.setTitle("Two Cars");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        CarComponent c = new CarComponent();
        frame.add(c);
        frame.setVisible(true);
    }
}