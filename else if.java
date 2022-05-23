class elseifs
{
    public static void main(String[] args)

    {
        int marks = 69;
        if(marks <35)
        {
            System.out.println("Fail");
        }
        else if(marks >35 && marks <40)
        {
            System.out.println("Grade 'D' ");
        }
        else if(marks >=40 && marks <50)
        {
            System.out.println("Grade 'C' ");
        }
        else if(marks >=50 && marks <60)
        {
            System.out.println("Grade 'B' ");
        }
        else if(marks >=60 && marks <70)
        {
            System.out.println("Grade 'A' ");
        }
        else if(marks >=70 && marks <80)
        {
            System.out.println("Grade 'A+' ");
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}
