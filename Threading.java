class Bark extends Thread
{
    @Override
    public void run()
    {
        int i=1;
        while (i<=20) {
            System.out.println("I am in bark 1 : "+i);
            i++;
        }
    }
}
class Bark2 extends Thread
{
    @Override
    public void run()
    {
        int i=1;
        while (i<=20) {
            System.out.println("I am in bark 2 : "+i);
            i++;
        }
    }
}
public class Threading {
    public static void main(String[] args) {
        Bark obj = new Bark();
        Bark2 obj2 = new Bark2();
        // System.out.println(obj.getState());
        obj.setPriority(Thread.MIN_PRIORITY);
        obj2.setPriority(Thread.MAX_PRIORITY);
        // System.out.println(obj.getPriority());
        // System.out.println(obj2.getPriority());
        obj.setName("Monty");
        obj2.setName("Binod");
        obj.start();
        obj2.start();
        // System.out.println("I am subhankar");
        // System.out.println("I am subho");
        // System.out.println("I am aman");
        // System.out.println("I am ankita");
        // System.out.println("I am aditya");
        // System.out.println("I am palak");
        // System.out.println("I am binod");
        // System.out.println("I am arjun");
        // System.out.println(obj.isAlive());
        // System.out.println(obj2.isAlive());
        // System.out.println(obj.getName());
        // System.out.println(obj2.getName());
        // System.out.println(obj.getState());
        try {
            Thread.sleep(1);
            System.out.println("obj 1 "+obj.getState());
            System.out.println("obj 2 "+obj2.getState());
            System.out.println("working obj 1"+obj.isAlive());
            System.out.println("working obj 2"+obj2.isAlive());
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
