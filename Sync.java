class Printer
{
    void printing(int k)
    {
        synchronized(this)
        {
            for (int i = 1; i <= 20; i++) {
                System.out.println("i am a part of number "+k+"="+i*k);
                try {
                    Thread.sleep(50);
                } catch (Exception e) {
                    //TODO: handle exception
                }
            }
        }
    }
}
class Thread1 extends Thread
{
    Printer obj;
    public Thread1(Printer ob)
    {
        obj = ob;
    }
    @Override
    public void run()
    {
        
        obj.printing(5);
    }
}
class Thread2 extends Thread
{
    Printer obj;
    public Thread2(Printer ob)
    {
        obj = ob;
    }
    @Override
    public void run()
    {
        
        obj.printing(10);
    }
}
public class Sync {
    public static void main(String[] args) {
        Printer obj = new Printer();
        Thread1 t1 = new Thread1(obj);
        Thread2 t2 = new Thread2(obj);
        t1.start();
        try {
            t1.wait(500);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("----------------");
        t2.start();
    }
}
