class Bark extends Thread
{
    String name;
    public Bark(String name)
    {
        this.name = name;
    }

    @Override
    public void run()
    {
        int i=1;
        while (i<=20) {
            // try {
            //     Thread.sleep(500);
            // } catch (Exception e) {
            //     //TODO: handle exception
            // }
            System.out.println("I am in with "+name);
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
        Bark obj = new Bark("Subhankar");
        Bark2 obj2 = new Bark2();
        // System.out.println(obj.getState());
        // obj.setPriority(Thread.MIN_PRIORITY);
        // obj2.setPriority(Thread.MAX_PRIORITY);
        // System.out.println(obj.getPriority());
        // System.out.println(obj2.getPriority());
        // obj.setName("Monty");
        // obj2.setName("Binod");
        obj2.start();
        obj.start();
        // try {
        //     obj.join();
        // } catch (Exception e) {
        //     //TODO: handle exception
        // }
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
        // try {
        //     Thread.sleep(1);
        //     System.out.println("obj 1 "+obj.getState());
        //     System.out.println("obj 2 "+obj2.getState());
        //     System.out.println("working obj 1"+obj.isAlive());
        //     System.out.println("working obj 2"+obj2.isAlive());
        // } catch (InterruptedException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }
    }
}
