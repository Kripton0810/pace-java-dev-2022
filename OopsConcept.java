// package ;
import java.util.ArrayList;
import java.util.List;

public class OopsConcept {
    static int n;
    static String name;
    static boolean bool;
    public static void main(String[] args) {
        // Student obj1 = new Student();
        // obj1.setStudent(1, 'A', "Arjun","Prinkya");
        // obj1.getStudent();
        // Student obj2 = new Student();
        // obj2.setStudent(2, 'A', "Binod","Bipin");
        // obj2.getStudent();
        // System.out.println("-------------------------------");
        
        // obj1.getStudent();
        // obj2.getStudent();
        // List<Student> list = new ArrayList<>();
        // Student st = new Student();
        // st.setStudent(1,'A',"Subhankar Dutta","Bipin Sir");
        // list.add(st);
        // st = new Student();
        // st.setStudent(2,'A',"Ankit Punit","Animaka Mam");
        // list.add(st);
        // st = new Student();
        // st.setStudent(3,'A',"Aman Gupta","Animaka Mam");
        // list.add(st);
        // st = new Student();
        // st.setStudent(4,'A',"Binita Sen","Animaka Mam");
        // list.add(st);
        // for (Student student : list) {
        //     student.getStudent();
        // }
        // List<String> list = new ArrayList<>();
        // list.add("A");
        // list.add("B");
        // list.add("c");
        // list.add("D");
        // list.add("E");
        // list.add("f");
        // show(10,"a","b","c","d","f","g","h","i","j");
        // System.out.println(bool);
        Student st = new Student();
        st.name = "Ankit";
        st.getStudent();
    }
    public static void show(int n,String... list)
    {
        for (String str : list) {
            System.out.println(str);
        }
    }
}
class Student
{
    protected int roll=10;
    protected String name="subham";
    protected char sec='B';
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