package Pkg1;

class Job1 extends Thread
{ 
    public void run()
    {
        for (int i = 0; i < 50; i++) {
            System.out.println("job 1: "+i);

        }
    }
}
class Job2 extends Thread
{ 
    public void run()
    {
        for (int i = 0; i < 50; i++) {
            System.out.println("job 2: "+i);
            if (i==20) {
                while(true)
                {
                    notifyAll();
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

public class Thrmedse {
   public static void main(String[] args) {
       Job1 obj = new Job1();
       obj.setPriority(Thread.MIN_PRIORITY);
       Job2 obj2 = new Job2();
       obj2.setPriority(Thread.MAX_PRIORITY);
       obj.setName("clac thread");
       obj.start();
       obj2.start();
       try {
        Thread.sleep(5);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
       System.out.println("Job1 alive "+obj.currentThread());
       System.out.println("Job2 alive "+obj2.getState());
   } 
}
