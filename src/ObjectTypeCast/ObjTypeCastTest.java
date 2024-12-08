package ObjectTypeCast;

public class ObjTypeCastTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjTypeCastParent Obj1 = new ObjTypeCastChild();
		
		ObjTypeCastChild obj2 = (ObjTypeCastChild)Obj1;// Downcasting
		
		ObjTypeCastChild obj3= new ObjTypeCastChild();
		ObjTypeCastParent obj4=obj3;//UPcasting
		
		
	}

}
