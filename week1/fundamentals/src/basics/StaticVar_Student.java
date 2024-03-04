package basics;

public class StaticVar_Student {

	static int sid;
	static String sname;
	public StaticVar_Student() {
		super();
	}
	public int getSid() {
		return sid;
	}
	public String getName() {
		return sname;
	}
	public void setName(String name) {
		sname = name;
	}
	//public static 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVar_Student s1 = new StaticVar_Student();
		System.out.println(s1.sname);
		StaticVar_Student.sname = "palash";
		System.out.println(s1.sname);
		StaticVar_Student s2 = new StaticVar_Student();
		System.out.println(s2.getName());
		s2.setName("javeed"); 
		System.out.println(StaticVar_Student.sname);
		
	}

}
