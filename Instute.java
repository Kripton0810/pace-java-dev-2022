class staff
{
    int code;
    String name;
    public void setStaff(int code,String name)
    {
        this.code = code;
        this.name = name;
    }
    public void getStaff()
    {
        System.out.println("Code : "+this.code+", Name: "+this.name);
    }
}
class Teacher extends staff
{
    String subject,publication;
    public void setTeacher(int code,String name,String subject,String publication)
    {
        setStaff(code, name);
        this.publication = publication;
        this.subject = subject;
    }
    public void getTeacher()
    {
        getStaff();
        System.out.println("Code : "+this.subject+", Name: "+this.publication);
    }
}

class Officer extends staff
{
    String grade;
    public void setOfficer(int code,String name,String grade)
    {
        setStaff(code, name);
        this.grade = grade;
    }
    public void getOfficer()
    {
        getStaff();
        System.out.println("Grade : "+this.grade);
    }
}

class Typist extends staff
{
    int speed;
    public void setTypist(int code,String name,int speed)
    {
        setStaff(code, name);
        this.speed = speed;
    }
    public void getTypist()
    {
        getStaff();
        System.out.println("Speed : "+this.speed);
    }
}

class RegularTypist extends Typist
{
    double remuneration;
    public void setRegularTypist(int code,String name,int speed,double remuneration)
    {
        setTypist(code, name,speed);
        this.remuneration = remuneration;
    }
    public void getRegularTypist()
    {
        getTypist();
        System.out.println("remuneration : "+this.remuneration);
    }
}

class CasualTypist extends Typist
{
    double dalywages;
    public void setCasualTypist(int code,String name,int speed,double dalywages)
    {
        setTypist(code, name,speed);
        this.dalywages = dalywages;
    }
    public void getCasualTypist()
    {
        getTypist();
        System.out.println("daly wages : "+this.dalywages);
    }
}

public class Instute {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setTeacher(101, "Prakash", "Hindi", "Kritika");
        Officer officer = new Officer();
        officer.setOfficer(105, "Anurag", "A+");
        RegularTypist regularTypist = new RegularTypist();
        regularTypist.setRegularTypist(563, "Ramesh", 45, 500);
        CasualTypist casualTypist = new CasualTypist();
        casualTypist.setCasualTypist(423, "Raj", 50, 200);

        teacher.getTeacher();
        officer.getOfficer();
        regularTypist.getRegularTypist();
        casualTypist.getCasualTypist();
    }    
}
