package com.cognizant.array;

import java.util.Scanner;

public class StudentInfo {
    int registerNo;
    String name;
    int total=0;
    int marks[];//Declare Array
    int arraySize;
    Scanner s1=new Scanner(System.in);
    void getData()
    {
        System.out.println("Enter the Register Number ");
        registerNo=s1.nextInt();
        System.out.println("Enter the Name ");
        name=s1.next();
        System.out.println("Enter the Array Size U want to allocate");
        arraySize=s1.nextInt();
        marks=new int[arraySize];//Define an array size

        for(int i=0;i<marks.length;i++)
        {
            System.out.println("Enter the Marks for Subject  "+(i+1));
            marks[i]=s1.nextInt();
        }
    }
    void printData()
    {

        System.out.println("Register Number is "+registerNo);
        System.out.println("Name is "+name);
        for(int i=0;i<marks.length;i++)
        {
            System.out.println("Marks for the Subject "+(i+1)+" is "+marks[i]);
            total+=marks[i];
        }
        float avg=total/marks.length;
            System.out.println(" Total Marks is "+total);
            System.out.println(" Average Marks is "+avg);
    }

    public static void main(String[] args) {
        StudentInfo si=new StudentInfo();
        si.getData();
        si.printData();
    }
}
