package Pkg1;
class RBI{
    public void me()
    {
        System.out.println("I am main bank");
    }
}
abstract class MainBank extends RBI
{
    public abstract int rateOfIntrest();
    String bank_name;
    public void setBank(String bank_name)
    {
        this.bank_name = bank_name;
    }    
    public String getBankName()
    {
        return this.bank_name;
    }
}
class SBI extends MainBank
{
    @Override
    public int rateOfIntrest()
    {
        return 8;
    }
    public SBI()
    {
        setBank("State Bank Of India");
    }    
}

class PNB extends MainBank
{
    @Override
    public int rateOfIntrest()
    {
        return 6;
    }
    public PNB()
    {
        setBank("Punjab National Bank");
    }    
}


public class Bank {
    public static void main(String[] args) {
        MainBank obj = new PNB();
        MainBank obj2 = new SBI();
        System.out.println(obj.getBankName()+":: ROI "+obj.rateOfIntrest());
        System.out.println(obj2.getBankName()+":: ROI "+obj2.rateOfIntrest());
    }
}
