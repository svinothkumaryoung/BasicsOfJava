import java.util.Scanner;

public class ConstructorWithArg {
    int registerNo;
    String name;
    Scanner s=new Scanner(System.in);
    ConstructorWithArg()   //Default Constructor
    {
        registerNo=6666;
        name="Vinothkumar Selvaarassan";
    }
    ConstructorWithArg(int r,String n)//Constructor With Arg
    {
        registerNo=r;
        name=n;
    }
    void getData()
    {
        System.out.println("Enter the Register Number " );
        registerNo=s.nextInt();
        System.out.println("Enter the Name ");
        name=s.next();
    }
    void printData()
    {
        System.out.println("Register Number is "+registerNo);
        System.out.println("Name is "+name);
    }

    public static void main(String[] args) {
        ConstructorWithArg cwa=new ConstructorWithArg();
        cwa.printData();
        cwa.getData();
        cwa.printData();
        ConstructorWithArg cwa1=new ConstructorWithArg(666,"roshan");
        cwa1.printData();
    }

}
