package com.cognizant.array;

import java.util.Scanner;

public class TwodArray
{
    String roomNo[][]=new String[3][3];
    Scanner s1=new Scanner(System.in);
    void getData()
    {
        for(int i=0;i<roomNo.length;i++)
        {
            for(int j=0;j<roomNo[i].length;j++)
            {
                System.out.println("Enter the Product U want to store it on room no "+(i+1)+(j+1));
                roomNo[i][j]=s1.next();
            }
        }
    }
    void printData()
    {
        System.out.println("****Details present on Room No is ****");
        for(int i=0;i<roomNo.length;i++)
            {
                for(int j=0;j<roomNo[i].length;j++)
                {
                System.out.println("Product stored on room no "+(i+1)+(j+1)+" "+roomNo[i][j]);
                }
            }
    }

    public static void main(String[] args) {
        TwodArray tda=new TwodArray();
        tda.getData();
        tda.printData();
    }

}
