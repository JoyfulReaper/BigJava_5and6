package com.kgivler.Student;

public class Student {
    private int numberOfQuizes;
    private int totalScore;
    private String name;

    public Student(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public Boolean addQuiz(double score)
    {
        if(score < 0)
            return false;

        totalScore += score;
        numberOfQuizes++;
        return true;
    }

    public double getTotalScore()
    {
        return totalScore;
    }

    public double getAverageScore()
    {
        if(numberOfQuizes == 0)
            return 0;
            
        return totalScore / numberOfQuizes;
    }
}