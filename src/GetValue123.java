import java.util.Scanner;

public class GetValue123 {
    int registerNo;
    String name;
    Scanner s=new Scanner(System.in);
    void getData()
    {
        System.out.println("Enter your Register Number ");
        registerNo=s.nextInt();
        System.out.println("Enter your Name ");
        name=s.next();
    }
    void printData()
    {
        System.out.println("Register No "+registerNo);
        System.out.println("Name  "+name);
    }

    public static void main(String[] args) {
        GetValue123 gv=new GetValue123();
        gv.getData();
        gv.printData();
    }

}
