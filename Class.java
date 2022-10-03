class Student 
{
	public int id;
	private String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void display()
	{
		System.out.println(this.id+this.name);
	}
	
	public void functionOne(int a)
	{
		int c= a*10;
		System.out.println(c);
	}
	
	public void functionTwo(Student obj)
	{
		obj.id=50;
	}
		
}
public class Class 
{	
	public static void main(String[] args)
	{
	Student st = new Student(12, "HI");
	Student st1 = new Student(13,"Hello");
	st.display();
	st.functionOne(st.id);
	st.display();
	st.functionTwo(st);
	st.display();
	}
}
