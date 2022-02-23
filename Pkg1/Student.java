package Pkg1;

public class Student {
    int roll=10;
    protected String name="subham";
    public char sec='B';
    protected static String ct;
    public Student()
    {
        System.out.println("Hello welcome");
        this.roll = 20;
        this.name = "Manisha";
        this.sec = 'D';
        this.ct ="ajay sir";
    }
    public Student(int roll,char sec,String name,String ct)
    {
        this.roll = roll;
        this.name = name;
        this.sec = sec; 
        this.ct = ct;
    }
    public Student(int roll,char sec,String name)
    {
        this.roll = roll;
        this.name = name;
        this.sec = sec; 
        this.ct = "Kamal";
    }

    public void setStudent(int roll,char sec,String name,String ct)
    {    
        this.roll = roll;
        this.name = name;
        this.sec = sec; 
        this.ct = ct;
    }
    public void getStudent()
    {
        System.out.println("Roll-> "+this.roll+" Name-> "+this.name+" Sec-> "+this.sec+ " Class teacher-> "+this.ct);
    }
}
