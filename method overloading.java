class methover
{
    public static void main(String[] args)
    {
        int a=10,b=20,c=30;
        area(a,b);
        area(c);
    }
    public static void area(int a, int b)
    {
        int c = a*b;
        System.out.println("The area of rectangle is : "+c);
    }
    public static void area(float c)
    {
        c =3.14f*c*c;
        System.out.println("The area of circle is : "+c);
    }
}
