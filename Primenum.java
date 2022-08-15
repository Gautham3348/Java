# Java
public class Prime {
    public static void main(String[] args) {
      int n = 11;
      boolean flag = true;
      for(int i=2;i<=n/2;i++)
      {
        if(n%i==0)
        {
          flag = true;
          break;
        }
      }
      if(flag)
      {
        System.out.println("The num is Not a prime num");
      }
      else{
        System.out.println("The num is prime");
      }
  }
}
