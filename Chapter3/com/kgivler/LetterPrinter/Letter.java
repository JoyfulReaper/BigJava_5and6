package com.kgivler.LetterPrinter;

import java.util.ArrayList;

public class Letter {
    private String from;
    private String to;
    private ArrayList<String> lines = new ArrayList<String>();

    Letter(String from, String to)
    {
        this.from = from;
        this.to = to;
    }

    public void addLine(String text)
    {
        lines.add(text);
    }

    public String getText()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Dear " + to + ":\n\n");
        for(String s : lines)
            sb.append(s + "\n");
        sb.append("\n");
        sb.append("Sincerely,\n\n");
        sb.append(from);

        return sb.toString();
    }
}