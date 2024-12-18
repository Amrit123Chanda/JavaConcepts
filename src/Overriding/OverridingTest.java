package Overriding;

public class OverridingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverridingParent overridingParent = new OverridingParent();
		OverridingParent overridingParent2 = new OverridingChild();
		OverridingChild overridingChild = new OverridingChild();
		
		
		overridingParent.parentMethod1();
		overridingParent.parentMethod2();
		overridingChild.parentMethod1();
		overridingChild.parentMethod2();
		
		overridingParent2.parentMethod1();
		overridingParent2.parentMethod2();//child class method gets called
		
		varResolutionParent p= new varResolutionParent();
		varResolutionChild c = new varResolutionChild();
		varResolutionParent pc = new varResolutionChild();
		System.out.println(p.x);
		System.out.println(c.x);System.out.println(pc.x);//Variable resolution always takes care based on reference type irrespective of whether the variable is static or non static (overriding concept applicable only for methods and not for variables)

		
	}

}
/*
 Parent class private methods not available to the child and hence overriding concept not applicable for private methods.
 We cannot override parent class final method In child class. if we are trying to override, we will get compile time error.
 We can override non abstract method as abstract-The main advantage of the approach is- we can stop the availability of parent method implementation to next level child classes
 In overriding, method resolution always takes care JVM based based on run-time object and hence overriding also considered as run-time polymorphism, dynamic polymorphism or late binding
 While overriding, we cannot reduce the scope of access modifier of method but we can increase scope
 Rules for overriding- In overriding , method names and arg types must be matched,That is method signature must be same. In overriding, return type must be same but this rule is applicable until 1.4 version only.From 1.5 versions covariant return types. According to this child class method return type need not be same as parent method return type. Its child type also allowed.
 Method m5 of OverridingChild and OverridingParent is example of co-variant return types. But only applicable for object types not primitive types(like m6 method is error).Example below
 (Parent method)Object-(Child method)Object/String/StringBuffer
 (Parent method)Number-(Child method)Number/Integer
 (Parent method)String-(Child method)Object-NOT ALLOWED
 
 If a child class method throws any checked exception compulsory parent class method should throw the same checked exception or its parent otherwise we will get compile time error.But there are no restrictions for unchecked exceptions.
 We cannot override a static method as non static method. Otherwise we will get compile time error.
 If both parent and child class method are static then we wont get any compile time error .It seems overriding concept applicable for static method but it is not overriding and it is method hiding.
 
 Static vs. Non-static:Overriding is for instance methods (non-static), where the method call is resolved at runtime based on the actual object type.
Method Hiding is for static methods, where the method call is resolved at compile-time based on the reference type.
 */

