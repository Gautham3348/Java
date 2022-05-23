class swfun
{
    public static void main(String[] args)
    {
        int a =10, b=20;
        swapfun(a,b);
    }
    public static void swapfun(int a, int b)
    {
        System.out.println("Before swapping a = "+a+ " b = "+b);
        {
            int c = a;
            a = b;
            b = c;
            System.out.println("After swapping a = "+a+ " b = "+b);
        }
    }
}
