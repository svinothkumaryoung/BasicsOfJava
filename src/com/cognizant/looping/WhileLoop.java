package com.cognizant.looping;
import java.util.Scanner;
public class WhileLoop {
    int numbers=1,Multiplier,i=1;
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
       while(i<=numbers){
            System.out.println(i + " X "+Multiplier+" = "+(i*Multiplier));
            i++;
        }
    }

    public static void main(String[] args) {
        WhileLoop fl=new WhileLoop();
        fl.getData();
        fl.performMultiplication();
    }
}
