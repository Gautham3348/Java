# Java
public class Inheritance
{
  public static void main(String[] args)
  {
    Dog golden = new Dog();
    golden.show();
    golden.display();
  }
}
class Animal
{
  public void show()
  {
    System.out.println("I can eat");
  }
}
class Dog extends Animal
{
  public void display()
  {
    System.out.println("My name is Doggo");
  }
}
