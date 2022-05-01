interface Vehicle
{
    int id=0;
    String name = null;
    int lnum = 0;
    void getData();
}
class TwoWheeler implements Vehicle
{
    int id,lnum,sterringhandel;
    String name;
    public TwoWheeler(int id,int lnum,int sterringhandel,String name)
    {
        this.id = id;
        this.lnum = lnum;
        this.name = name;
        this.sterringhandel = sterringhandel;
    }
    @Override 
    public void getData()
    {
       System.out.println("id -> "+id); 
       System.out.println("name -> "+name); 
       System.out.println("licence number -> "+lnum); 
       System.out.println("sterringhandel -> "+sterringhandel); 
    }
}
class FourWheeler implements Vehicle
{
    int id,lnum,sterringwheel;
    String name;
    public FourWheeler(int id,int lnum,int sterringwheel,String name)
    {
        this.id = id;
        this.lnum = lnum;
        this.name = name;
        this.sterringwheel = sterringwheel;
    }
    @Override 
    public void getData()
    {
       System.out.println("id -> "+id); 
       System.out.println("name -> "+name); 
       System.out.println("licence number -> "+lnum); 
       System.out.println("sterringwheel -> "+sterringwheel); 
    }
}

public class Wheels {
    public static void main(String[] args) {
        Vehicle ob = new TwoWheeler(1, 9000122, 10, "Honda");
        Vehicle obj = new FourWheeler(1, 897087, 15, "Maruti");
        ob.getData();
        obj.getData();
    }
}
