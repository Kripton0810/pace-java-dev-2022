import java.util.*;
class IllegalArgumentException extends Exception //error message creation
{
    public IllegalArgumentException(String msg)
    {
        super(msg);
    }
}
public class Exceps {
    public void checkAge(long num) throws IllegalArgumentException
    {
       if (num<0) {
           throw new IllegalArgumentException("Value of x must be positive");
       }
       else if (num>20) {
        throw new IllegalArgumentException("Result will over flow");           
       }
       else
       {
           long f=1;
           for (int i = 1; i <= num; i++) {

             f *= i;
           }
           System.out.println(f);
       }
    }
  public static void main(String[] args) {
      Exceps obj = new Exceps();
      try {
        obj.checkAge(30);
    } catch (IllegalArgumentException e) {
        // TODO Auto-generated catch block
        System.out.println("Error is "+e.getMessage());
    }
    //   System.out.println("hello");
    //   int arr[] = new int[10];
    //   Scanner in = new Scanner(System.in);
    //   try {
    //     int data = in.nextInt();
    //     try {
    //         arr[11] = 20;
            
    //     } catch (Exception e) {
    //         //TODO: handle exception
        //   System.out.println("Error in nested is "+e.getMessage());
    //     }

    //   } catch (Exception e) {
    //       //TODO: handle exception
    //       System.out.println("Error is "+e.getMessage());
    //   }finally{
    //       System.out.println("Thank you for your patients");
    //   }

    //   System.out.println("brian");
  }  
}
