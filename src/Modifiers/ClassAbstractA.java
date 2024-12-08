package Modifiers;

public abstract class ClassAbstractA {

	abstract void method1();//abstract method declaration should ends with semicolon.
	

}
/*
Abstract method never talks about implementation.If any modifier talks about implementation then it forms illegal combination with abstract modifier.

Abstract class VS abstract method- If a class contains at least one abstract method then compulsory we should declare class as abstract otherwise we will get compile time error. If a class contains at least one abstract method then implementation is not complete and hence it is not recommended to create object.So to restrict object instantiation compulsory we should declare class abstract.
Even though Class doesn't contain any abstract method still we can declare class as abstract if we don't want instantiation i.e abstract class can contain 0 abstract method also

If we are extending abstract class then for each and abstract method of parent class we should provide implementation otherwise we have to declare child class as abstract . In this case  next level child class is responsible to provide implementation.

Abstract class can contain final method whereas final class cannot contain abstract method.

Before checking member visibility we have to check class visibility- if both class and method are public then only we can access that method from outside package

Default members- If a member declared as default, then we can access that member only within the current package i.e from outside of package we cant access.Hence default access is also known as package level access.
If a member is private then we can access that member only within the class.Outside of the class we cant access. Abstract methods should be available to the child classes to provide implementation whereas private methods are not available to the child classes> Hence private abstract combination is illegal for methods.


*/