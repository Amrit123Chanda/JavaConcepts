package ExceptionHandling;

public class ExceptionOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		try
		{
			System.out.println(x/0);
		}
		catch(ArithmeticException e)
		{	
			System.out.println("Exception -Arithmetic Exception");//Internally default exception handler will use print stack trace method to print exception information to the console
			e.printStackTrace();
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
		

	}

}
/*
 Exception hierarchy - Throwable class acts as root for Java exception hierarchy. Throwable class defines two child classes - Exception And error.
 In our program if there is a chance of rising checked exception then compulsory we should handle the checked exception either by Try-catch or throws keyword, other wise we will get compile time error. 
 The exceptions which are not checked by compiler whether programmer handling or not ,such type of exceptions are unchecked exceptions.

Whether It is checked or unchecked, every exception occurs at runtime only.There is no chance of occurring any exception at compile time. 
Runtime exceptions and its child classes, error and its child classes are unchecked. Except this remaining are checked. 
Fully checked VS partially checked- A checked exception is said to be fully checked iff all its child class also checked. E.g- IOexception, interruptedException..  A checked exception is said to be partially checked iff some of its child classes are unchecked. 
Note- The only possible partially checked exceptions in java are 1)exceptions 2)Throwable



*/
