package Overloading;

public class OverloadingObject {
	
	public void method2(String s)
	{
		System.out.println("String version");
	}
	
	public void method2(Object ob)
	{
		System.out.println("Object version");
	}
	
	public void method3(String s)
	{
		System.out.println("method-3 String");
	}
	public void method3(StringBuffer s)
	{
		System.out.println("method-3 StringBuffer");
	}
}
