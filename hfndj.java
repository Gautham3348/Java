interface Frontend
{
	default void frontend()
	{
		System.out.println("I can do front-end");
	}
}
interface Backend
{
	default void backend()
	{
		System.out.println("I can do  backend");
	}
}
class Fullstack implements Frontend, Backend
{
	public void fullstack()
	{
		System.out.println("FullStack developer = :O");
	}
}
public class hfndj
{
	public static void main(String[] args)
	{
		Fullstack obj = new Fullstack();
		obj.frontend();
		obj.backend();
		obj.fullstack();
		/*
		 * packages
		 * access modifiers
		 * exception handling
		 */
	}
}