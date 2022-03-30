public class ThisKeyword {
    int registerNo;
    String name;
    ThisKeyword()
    {
        registerNo=666;
        name="Vinothkumar Selvaarasan";
        this.printdata();
    }
    ThisKeyword(int registerNo,String name)
    {
        this(); //It will be going to call constructor with no argument
        this.registerNo=registerNo;
        this.name=name;
        this.printdata();
    }
    void printdata()
    {
        System.out.println("Register No "+registerNo);
        System.out.println("Name is "+name);
    }

    public static void main(String[] args) {
        ThisKeyword tk=new ThisKeyword(6667,"Ashokkumar Selvaarasan");

    }

}
