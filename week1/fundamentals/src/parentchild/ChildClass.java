package parentchild;

public class ChildClass extends ParentClass {

	private int cid;
	private String cname;
	
	public ChildClass() {
		
		System.out.println("default");
	}

	public ChildClass(int cid, String cname) {
		
		this.cid = cid;
		this.cname = cname;
		System.out.println("parameterised");
	}

	public void print() {
		System.out.println("child print mthd clld");
	}
}
