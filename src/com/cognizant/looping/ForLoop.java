package com.cognizant.looping;

import java.util.Scanner;

public class ForLoop {
    int numbers=1,Multiplier;
    Scanner s1=new Scanner(System.in);

    void getData()
    {
        System.out.println("Enter the Multiplier Number ");
        Multiplier=s1.nextInt();
        System.out.println("Enter the Range ");
        numbers=s1.nextInt();
    }
    void performMultiplication()
    {
        for(int i=1;i<=numbers;i++)
        {
            System.out.println(i + " X "+Multiplier+" = "+(i*Multiplier));
        }
    }

    public static void main(String[] args) {
        ForLoop fl=new ForLoop();
        fl.getData();
        fl.performMultiplication();
    }
}
