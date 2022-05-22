class myarr
{
    public static void main(String[] args)
    {
        int a[] = new int[20];
        int b[] = new int[20];
        int c[] = new int[20];
        int num = 5;
        for (int i=0;i<5;i++)
        {
            a[i] = i;
            System.out.println("a is " +a[i]);
        }
        for(int i=0;i<5;i++)
        {
            b[i]=num;
            num = num+1;
            System.out.println("b is " +b[i]);
        }
        for(int i=0;i<5;i++)
        {
            c[i]=a[i]+b[i];
            System.out.println("c is "+c[i]);
        }

    }
}
