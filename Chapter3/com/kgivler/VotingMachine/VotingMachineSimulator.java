package com.kgivler.VotingMachine;

import java.util.Scanner;

public class VotingMachineSimulator {
    public static void main(String[] args)
    {
        VotingMachine machine = new VotingMachine();
        Scanner in = new Scanner(System.in);

        Boolean moreVotes = true;
        while(moreVotes)
        {
            System.out.println("Menu: ");
            System.out.println("1) Vote Republican ");
            System.out.println("2) Vote Democrat ");
            System.out.println("3) Get Results");
            System.out.println("4) Reset State");
            System.out.println("5) Quit");
            System.out.println("");
            System.out.print("Input: ");
            int res = in.nextInt();

            switch (res)
            {
                case 1:
                    machine.voteRepublican();
                    break;
                case 2:
                    machine.voteDemocrat();
                    break;
                case 3:
                    System.out.println("Republican Votes: " + machine.getRepublicanTally());
                    System.out.println("Democrat Votes: " + machine.getDemocratTally());
                    break;
                case 4:
                    machine.resetState();
                    break;
                case 5:
                    moreVotes = false;
                    break;
                default:

            }
        }
    }
}