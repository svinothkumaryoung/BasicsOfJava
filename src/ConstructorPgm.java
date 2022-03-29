import java.util.Scanner;
public class ConstructorPgm {
    int registerNo;
    Scanner s1=new Scanner(System.in);
    ConstructorPgm()//Default Constructor
    {
        registerNo=6666;
    }
    void printData()
    {
        System.out.println("Register Number is "+registerNo);
    }
    public static void main(String[] args) {
        ConstructorPgm cp=new ConstructorPgm();
        cp.printData();
    }
}
