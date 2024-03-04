package parentchild;

import java.time.Instant;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildClass c = new ChildClass(101,"palash");
		 c.display();
		 c.show();
		 c.print();
		 
		 String str1 = "Hello";
		 String str3 = "Hello";
		 System.out.println("str1==str3 "+(str1==str3));
		 String str2 = new String(str1);
		 System.out.println(str1 + " equals " + str2 + " -> " + 
		 str1.equals(str2));
		 System.out.println(str1 + " == " + str2 + " -> " + (str1 ==str2));

		 Instant ct = Instant.now();
		 System.out.println(ct);
	}
}
