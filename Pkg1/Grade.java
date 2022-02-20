package Pkg1;

public class Grade {
    char grade;
    int marks;
    public Grade(int marks)
    {
        this.marks = marks;
    }
    public char letterGrade()
    {
        int marks = this.marks;
        if ((marks>100)||(marks<0)) 
        {
            System.out.println("Invalid marks");
            return '\0';
        }
        else
        {
            if (marks>=90) {
                return 'O';
            } else if (marks>=80) {
                return 'E';                
            }else if (marks>=70) {
                return 'A';                
            }else if (marks>=60) {
                return 'B';                
            }else if (marks>=50) {
                return 'C';                
            }
            else
            {
                return 'F';
            }
        }
    }
}
