package Overriding;

public class OverridingChild extends OverridingParent {
	
	public void parentMethod2()
	{
		System.out.println("Method2 of parent is modified");
	}
	
	public String m5()
	{
		return "returnString";
	}
	
	public String m6()
	{
		return "returnString";
	}
}
