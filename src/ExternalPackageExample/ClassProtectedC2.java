package ExternalPackageExample;
import Modifiers.*;
public class ClassProtectedC2 extends ClassProtectedC{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassProtectedC2 c=new ClassProtectedC2();
		c.m1();
		
		ClassProtectedC c1 = new ClassProtectedC();
		//c1.m1();
		
		ClassProtectedC c5 =new ClassProtectedC2();
		//c5.m1();
	}

}
