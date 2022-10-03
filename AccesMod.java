/*
 * Access modifiers :-
 * public 
 * private
 * protected
 * default
 * we can use public, final, abstract in the class
 * we cannot use private and protected in the class
 * if we do not mention any modifiers it will be treated as default
 */
/*
 * public :
 * if we use public, it can be accessed within in the same class or different 
 * class or same package or different package
 * private :
 * if we use private it can be accessed only within the same class only
 * protected :
 * if we use protected it can be used within class or different class of same 
 * package, it can also be accessed by another package by extending the class 
 * of one package from another package.
 * default : 
 * if we use default it can be accessed within class or different class of same
 * package
 */
public class AccesMod 
{
	public String bankaccountname = "SBI";//public 
	private int accountno = 405113935;//private
	protected int phno = 73864817;//protected
	String accounttype = "Savings";//defaultn
}
