package Modifiers;

public class MyClass {
	int x;
	static int y;
	
	static void methodOne()
	{
		//System.out.println(x);We cannot access instance members directly from static area but we can access from instance area directly.
		System.out.println(y);
	}
	void methodTwo()
	{
		System.out.println(x);
		System.out.println(y);
	}
	
}


/*
We cannot access instance members directly from static area but we can access from instance area directly. We can access static members from instance and static areas directly. 
*/