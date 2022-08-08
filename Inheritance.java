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
class Animal                             //super class
{
  public void show()
  {
    System.out.println("I can eat");
  }
}
class Dog extends Animal                //super class
{
  public void display()
  {
    System.out.println("My name is Doggo");
  }
}
