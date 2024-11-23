package Overloading;

public class OverloadingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingPrimitive overloadingPrimitive = new OverloadingPrimitive();
		overloadingPrimitive.method1(1);
		overloadingPrimitive.method1(10.5f);
		overloadingPrimitive.method1('a');
		overloadingPrimitive.method1(10l);
		//overloadingPrimitive.method1(10.5);//The method method1(int) in the type OverloadingPrimitive is not applicable for the arguments (double)
		
		OverloadingObject overloadingObject = new OverloadingObject();
		overloadingObject.method2("Amrit");
		overloadingObject.method2(new Object());
		overloadingObject.method2(null);
		
		overloadingObject.method3("Chanda");
		overloadingObject.method3(new StringBuffer("Tubai"));
		//overloadingObject.method3(null); Ambiguous-null can be assigned to both a String and a StringBuffer variable because null is a special literal that represents the absence of a reference to any object. It does not represent any specific data type but rather indicates that the variable does not currently point to any object or instance. 
		/*
		  While resolving overloaded methods, compiler will gives the preference for child type argument than compared with parent type argument.

		*/
		
		OverloadingTest t = new OverloadingTest();
		OverloadingResolution_Animal animal = new OverloadingResolution_Animal();
		OverloadingResolution_Monkey monkey = new OverloadingResolution_Monkey();
		OverloadingResolution_Animal animal_monkey = new OverloadingResolution_Monkey();
		t.m4(animal);
		t.m4(monkey);
		t.m4(animal_monkey);
		/*
		 In overloading method resolution always takes care by based on reference type . In overloading, run-time object dont play any role.
		*/
		
		
	}
	
	public void m4(OverloadingResolution_Animal a)
	{
		System.out.println("Animal-version");
	}
	public void m4(OverloadingResolution_Monkey a)
	{
		System.out.println("Monkey-version");
	}
}


/*
  byte-short
  			\
  			int-long-float-double
  	   char/	

Automatic promotion in overloading. While resolving overloaded methods, if exact match is no available , then we wont get any compile time error immediately. First it will promote argument to next level and check whether matched method is available or not. If matched method is available then it will be considered. If matched method is not available, Then compiler promotes argument to next level.
This process will be continued until all possible promotions. Still if the matched method is not available then we will get compile time error. 
*/
