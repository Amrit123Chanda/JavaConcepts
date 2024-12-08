package Modifiers;

public class ClassProtectedC1 extends ClassProtectedC{
	public static void main(String[] args) {
		
		ClassProtectedC pc= new ClassProtectedC();
		pc.m1();
		ClassProtectedC1 pc1=new ClassProtectedC1();
		pc1.m1();
		ClassProtectedC pc2 = new ClassProtectedC1();
		pc2.m1();

	}

}
/*
Protected members- The most misunderstood modifier in java. If a member declared as protected then we can access that member anywhere within current package but only in child classes of outside package. Protected= default+kids.
We can access protected members within the current package anywhere either by using parent reference or by using child reference. But we can access protected members in outside package only in child classes and we should use child reference only i.e parent reference cannot be used to access protected members from outside package

*/