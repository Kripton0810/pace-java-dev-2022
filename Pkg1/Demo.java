package Pkg1;
abstract class Employee{
    private int empNo,salary;
    private String name,grade;
    //counstrouctor
    public Employee()
    {

    }
    public Employee(int empNo,int salary,String name,String grade)
    {
        this.empNo = empNo;
        this.grade = grade;
        this.name = name;
        this.salary = salary;        
    }
    //getter and setter
    //setter
    public abstract void setEmpNo();
    //getter
    public int getEmpNo()
    {
        return this.empNo;
    }
    public void setSalary(int salary)
    {
        this.salary = salary;
    }
    //getter
    public int getSalary()
    {
        return this.salary;
    }
    public void setName(String name)
    {
        //checker
        if(name.equals("1234"))
        {
            System.out.println("This name is not possible");
        }
        else
        {
            this.name = name;
        }
    }
    //getter
    public String getName()
    {
        return this.name;
    }
    public void setGrade(String grade)
    {
        this.grade = grade;
    }
    //getter
    public String getGrade()
    {
        return this.grade;
    }
}

public class Demo extends Employee {
    public static void main(String[] args) {
        
    }
    @Override
    public void setEmpNo()
    {

    }
}
