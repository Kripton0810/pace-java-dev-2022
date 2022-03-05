import java.util.ArrayList;
import java.util.List;

public class Pattern2 {
    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
        System.out.println("I am closing");
    }
    public static void main(String[] args) {
        int a=10,b=25;
        int c = b<<2;
        System.out.println(c);
        
    }   
}