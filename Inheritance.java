// abstract class Bank
// {
//     abstract int roi();
    
// }

interface City
{
    String mycity();
}

interface Bank 
{
    int roi();

}

class SBI implements Bank
{
    @Override
    public int roi()
    {
        return 8;
    }
    public String mycity()
    {
        return "Jamshedpur";
    }
}
class RBI extends SBI
{

}
class PNB implements Bank
{
    @Override
    public int roi()
    {
        return 10;
    }
}
class HDFC implements Bank
{
    @Override
    public int roi()
    {
        return 7;
    }
}
class AXIS implements Bank
{
    @Override
    public int roi()
    {
        return 9;
    }
}
public class Inheritance{
public static void main(String[] args){
    Bank sbi = new SBI();
    Bank hdfc = new HDFC();
    Bank pnb = new PNB();
    Bank axis = new AXIS();
    RBI rbi = new RBI();
    rbi.mycity();
    System.out.println(sbi.roi());
    System.out.println(hdfc.roi());
    System.out.println(pnb.roi());
    System.out.println(axis.roi());
}
}
