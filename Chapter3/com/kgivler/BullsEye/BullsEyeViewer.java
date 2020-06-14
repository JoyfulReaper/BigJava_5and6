package com.kgivler.BullsEye;

import javax.swing.JFrame;

public class BullsEyeViewer {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        frame.setSize(300, 400);
        frame.setTitle("Bull's Eye");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BullsEyeComponent b = new BullsEyeComponent();
        frame.add(b);

        frame.setVisible(true);
    }
}