# Java
class MethodOverLoad
{
    public static void hello(int i, int j)
    {
        System.out.println(i+j);
    }
    public static void hello(int i, int j,int k)
    {
        System.out.println(i+j+k);
    }
    public static void main(String[] args)
    {
        MethodOverLoad obj = new MethodOverLoad();
        obj.hello(10,20);
        obj.hello(10,20,30);
    }
}
