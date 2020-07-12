package com.kgivler.Bug;

import java.util.Scanner;

enum Direction {
    EAST, WEST
};

public class Bug {
    
    int position;
    Direction facing;

    public Bug()
    {
        this(0);
    }

    public Bug(int initalPosition)
    {
        this.position = initalPosition;
        facing = Direction.EAST;
    }

    public void turn()
    {
        switch (facing)
        {
            case EAST:
                facing = Direction.WEST;
                break;
            case WEST:
                facing = Direction.EAST;
                break;
            default:
                System.out.println("Invalid Direction, setting to WEST");
                facing = Direction.WEST;
        }
    }

    public void move()
    {
        switch (facing)
        {
            case EAST:
                position++;
                break;
            case WEST:
                position--;
                break;
            default:
                System.out.println("Something went wrong, not moving!");
        }
    }

    public int getPostion()
    {
        return position;
    }
}

class BugTester
{
    public static void main(String[] args)
    {
        Boolean quit = false;
        Scanner in = new Scanner(System.in);
        Bug bug = new Bug();

        while(!quit)
        {
            System.out.print("(T)urn (M)ove (G)et Postion or (Q)uit? ");
            String command = in.nextLine();
            if(command.length() < 1)
                command = " ";

            command = command.substring(0, 1).toUpperCase();

            switch(command)
            {
                case "T":
                    bug.turn();
                    break;
                case "M":
                    bug.move();
                    break;
                case "G":
                    for(int i = -40; i <= 40; i++)
                        if(i == bug.getPostion())
                            System.out.print("*");
                        else
                            System.out.print("-");
                    System.out.println("\nPostion: " + bug.getPostion());
                    break;
                case "Q":
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid command!");
            }
        }
        System.exit(0);
        in.close();
    }
}