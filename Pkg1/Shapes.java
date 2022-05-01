package Pkg1;


interface Color
{
    void setColor(String name);
    String getColor();
    
}
interface Shape extends Color
{
    void setAngle(String name);
    String getShape();
}
class Rectriangle implements Shape
{
    String name,color;
    @Override
    public void setAngle(String name)
    {
        this.name = name;
    }
    @Override
    public String getShape()
    {
        return this.name;
    }
    @Override
    public void setColor(String color)
    {
        this.color = color;
    }
    @Override
    public String getColor()
    {
        return this.color;
    }

}

public class Shapes {

    public static void main(String[] args) {
        // Shape obj = new Rectriangle();
        // obj.setAngle("Rectriangle");
        // Shapes s = new Shapes();
        // System.out.println(s.hashCode());
        // s = null;
        // System.out.println(obj.getShape());
        // System.gc();
        String str = "I love my india";
        StringBuffer bfr = new StringBuffer(str);
        bfr.insert(10, "country ");
        System.out.println(bfr);
    }
    
    @Override
    protected void finalize(){
        
        System.out.println("Program ends");
    }
}