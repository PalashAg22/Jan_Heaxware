package basics;

import java.util.Objects;

public class Student {
	int sid;
	String sname;
	public int getSid() {
		return sid;
	}
	public Student() {
		super();
	}
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(sid, sname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return sid == other.sid && Objects.equals(sname, other.sname);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		int amount ;
		//System.out.println(amount);
		System.out.println(s1);
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.getSid());
	}

}
