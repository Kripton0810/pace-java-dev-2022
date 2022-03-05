class Employee
{

    String name;
    static String ceo;
    public void makeEmp(String nm,String eo)
    {
        name = nm;
        ceo = eo;
    }
    public void showEmp()
    {
        System.out.println("The emp name is "+name+" the ceo is "+ceo);
    }
}
class Values
{
    public int a=15,b=30;
    // public Values()
    // {
    //     System.out.println("Hello i am constructor");
    // }
    // public Values(int a,int b)
    // {
    //     this.a = a;
    //     this.b = b;
    // }
    // void callMe(int c,int d)
    // {
    //     System.out.println("I am 1");
    // }
    // void callMe(long c,int d)
    // {
    //     System.out.println("I am 2");
    // }
    // void callMe(long c,long d)
    // {
    //     System.out.println("I am 3");
    // }

    void callMe(long c,int d)
    {
        System.out.println("I am 1");
    }
    void callMe(int c,long d)
    {
        System.out.println("I am 2");
    }
    // void show(int a)
    // {
    //     System.out.println(a);
    //     System.out.println(this.a);
    // }
}
public class Polymor {
    public static void main(String[] args) {

        // Polymor obj = new Polymor();
        // obj.sum();
        // // int k =  ;
        Values val = new Values();
        // val.callMe(10, 20);
        // val.show(10);
        // val.a = 10;
        // val.b = 20;
        // int a = 10;
        // int b = 20;
        
        // System.out.println("The val of a is "+val.a+" the value of b is "+val.b);
        // System.out.println("The val is "+sub(20, 10));
        // swap(val);
        // sum();
        // int c = a;
        // a=b;
        // b=c;
        
        // System.out.println("The val of a is "+val.a+" the value of b is "+val.b);
        // Employee ram = new Employee();
        // ram.makeEmp("Ram", "Arjun");
        // Employee varun = new Employee();
        // varun.makeEmp("Varun", "Bheem");
        // Employee kalam = new Employee();
        // kalam.makeEmp("kalam", "Bidyut");
        // ram.showEmp();
        // varun.showEmp();
        // kalam.showEmp();
        // System.out.println("After varun says");
        // ram.showEmp();
        // varun.showEmp();
        
    }
    // static void sum()
    // {
    //     System.out.println("Hello sum");
    // }
    // static int sub(int a,int b)
    // {
    //     return a-b;
    // }
    // static void swap(Values obj)
    // {
    //     int c = obj.a;
    //     obj.a=obj.b;
    //     obj.b=c;
    //     System.out.println("The val of a is "+obj.a+" the value of b is "+obj.b);
    // }
}
