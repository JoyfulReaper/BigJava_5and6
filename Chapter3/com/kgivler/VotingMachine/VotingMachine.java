package com.kgivler.VotingMachine;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

public class VotingMachine {
    int republicanVotes;
    int democratVotes;

    public VotingMachine() {
        republicanVotes = 0;
        democratVotes = 0;
    }

    public int getRepublicanTally() {
        GregorianCalendar cal = new GregorianCalendar();

        //cal.set(Calendar.MONTH, Calendar.NOVEMBER);
        //cal.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
        //cal.set(Calendar.DAY_OF_WEEK_IN_MONTH, 1);

        System.out.println(cal.get(Calendar.DAY_OF_WEEK) + " " + cal.get(Calendar.MONTH) + "/" + cal.get(Calendar.DAY_OF_MONTH) + "/" + cal.get(Calendar.YEAR));
        if(cal.get(Calendar.MONTH) == Calendar.NOVEMBER &&  cal.get(Calendar.DAY_OF_WEEK) == Calendar.TUESDAY && cal.get(Calendar.DAY_OF_WEEK_IN_MONTH) == 1 && cal.get(Calendar.HOUR_OF_DAY) >= 8)
        {   
            Random r = new Random();
            return republicanVotes > democratVotes ? republicanVotes : democratVotes + r.nextInt(99) + 1;
        }

        return republicanVotes;
    }

    public int getDemocratTally() {
        return democratVotes;
    }

    public void resetState() {
        republicanVotes = 0;
        democratVotes = 0;
    }

    public void voteRepublican() {
        republicanVotes++;
    }

    public void voteDemocrat() {
        democratVotes++;
    }
}
