class returnf
{
    public static void main(String[] args)
    {
        returnf obj = new returnf();
        int a=10, b=20;
        int result = obj.add(a,b);
        System.out.println(result);
    }
    public int add(int a,int b)
    {
        int result=a+b;
        return result;
    }
}
