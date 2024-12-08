package ExceptionHandling;

public class ExceptionTwo {

	public static void main(String[] args) {

				int x=10;
				try
				{
					System.out.println(x/0);
				}
//				catch (Exception e)
//				{
//					System.out.println("Handled");// Note- If try with multiple catch blocks present then order of catch block is very important. We have to take child first and then parent. Otherwise we will get compile time error saying - Exception XXX already been caught.

//				}
				
				catch(ArithmeticException e)
				{	
					System.out.println("Exception -Arithmetic Exception");//Internally default exception handler will use print stack trace method to print exception information to the console
					e.printStackTrace();
					System.out.println(e.toString());
					System.out.println(e.getMessage());
				}
				
				catch(Exception e)
				{
					
				}
	}

}
