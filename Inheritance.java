class A{
    public static int a=10;
    int alpha=20;
    public A()
    {
        System.out.println("I am a");
    }
    public A(int a)
    {
        System.out.println("I'm A of "+a);
    }
    public static void dog()
    {
        System.out.println("Bark");
    }
    public static void cat()
    {
        System.out.println("Meow");
    }
}
class B extends A
{
    public B()
    {
        super(10);
        System.out.println("I'm B");
    }
    public void cow()
    {
        System.out.println("Moh");
    }
    public void animal()
    {
        dog();
    }
}
class C extends B
{
    public C()
    {
        System.out.println("I'm C");
    }
    @Override
    public void animal()
    {
        cat();
    }

}
public class Inheritance{
public static void main(String[] args){
    // A a = new A();
    // B b = new B();
    C c = new C();
    c.animal();
    // c.cow();
    // c.animal();
    
    // b.animal();
    // b.cow();
}
}
