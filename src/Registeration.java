import java.util.Scanner;

public class Registeration {
    int registerNumber;
    String name;
    void assignData()
    {
        registerNumber=1001;
        name="Vinothkumar Selvaarasan";
    }
    void printData()
    {
        System.out.println("Register Number is "+registerNumber);
        System.out.println("Name is "+name);
    }

    public static void main(String[] args) {
        Registeration regi=new Registeration();
        regi.assignData();
        regi.printData();
    }


}
