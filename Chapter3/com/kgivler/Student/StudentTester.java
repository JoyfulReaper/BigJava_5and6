package com.kgivler.Student;

import java.util.Scanner;

public class StudentTester {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Name: ");
        String name = in.nextLine();

        System.out.print("Quizzes: ");
        int quizzes = in.nextInt();

        Student s = new Student(name);

        for(int i = 1; i <= quizzes; i++)
        {
            System.out.print("Quiz #: " + i + " grade: ");
            s.addQuiz(in.nextDouble());
        }
        in.close();
        System.out.println("Student: " + name + " Average Grade is: " + s.getAverageScore());
    }
}