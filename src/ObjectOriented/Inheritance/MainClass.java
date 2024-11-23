package ObjectOriented.Inheritance;

public class MainClass {

	public static void main(String[] args) {
		
		InheritenceA objA = new InheritenceA();
		
		InheritenceB objB = new InheritenceB();
		
		InheritenceA objAB = new InheritenceB();
		
		//InheritenceB objBA = new InheritenceA(); error: child reference cannot be used to hold parent object

		objAB.methodA();
		//objAB.methodB(); error:Parent reference can be used to hold child objects but by using that reference we cannot call child specific methods but we can call the methods present in parent class 
		objB.methodA();
		objB.methodB();
		
		objA.methodA();
		//objA.methodB(); error:2)Whatever methods child has by default not available to the parent and hence on the parent reference we cannot call child specific methods  
	}

}
/*
 Conclusions-
1)Whatever methods parent has be default available to the child and hence on the child reference we can call both parent and child class methods
2)Whatever methods child has by default not available to the parent and hence on the parent reference we cannot call child specific methods
3)Parent reference can be used to hold child objects but by using that reference we cannot call child specific methods but we can call the methods present in parent class
4)Parent reference can be used to hold child objects but child reference cannot be used to hold parent objects. 

Java won't provide support for multiple inheritance- There may be a chance ambiguity problem.Hence Java won't provide support for multiple inheritance.
Interface can extend any number of interfaces simultaneously hence java provide support for multiple inheritance with respect to interfaces.

 */
