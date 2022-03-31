package com.cognizant.looping;

import java.util.Scanner;

public class DoWhilePgm {
    int numbers=1,Multiplier,i=0;
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
        do
        {
            System.out.println(i + " X "+Multiplier+" = "+(i*Multiplier));
            i++;
        }while(i<=numbers);
    }

    public static void main(String[] args) {
        DoWhilePgm Ddwp=new DoWhilePgm();
        Ddwp.getData();
        Ddwp.performMultiplication();
    }
}