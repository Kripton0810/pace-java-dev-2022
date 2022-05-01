package Pkg1;

/**
 * Interfas
 */
public interface Interfas {

    int getNumber();
    default String getString()
    {
        return "Hello";
    }
    static int getDefNums()
    {
        return 0;
    }
}
/**
 * InnerInterfas
 */
class InnerInterfas implements Interfas{
    public int getNumber()
    {
        return 100;
    }    
    public String getString()
    {
        return "World";
    }    
}
/**
 * datas
 */
class datas {
public static void main(String[] args) {
    InnerInterfas in = new InnerInterfas();
    
    System.out.println(in.getNumber());
    int st = Interfas.getDefNums();
    System.out.println(st);
}
    
}