package presentation;

import java.util.List;
import java.util.Scanner;

import dao.IDept;
import dao.IDeptImp;
import entity.Dept;

public class Client {

	static int temp=0;
	static Scanner scn = new Scanner(System.in);
	static IDept dep = new IDeptImp();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("****WQELCOME*****");
		boolean flag = true;
		while(flag) {
			System.out.println("1. Insert new");
			System.out.println("2. Update existing");
			System.out.println("3. Delete Existing");
			System.out.println("4. Delete All");
			System.out.println("5. Select One");
			System.out.println("6. Select All");
			System.out.println("7. exit");
			int choice = scn.nextInt();
			switch(choice) {
				case 1:
					Dept dept = readData();
					int count = dep.insert(dept);
					System.out.println(count+ " record entered successfully");
					break;
				case 2:
					Dept dept2 = readData();
					int count2 = dep.update(dept2);
					System.out.println(count2+ " record updated successfully");
					break;
				case 3:
					System.out.println("enter username ");
					String uname = scn.nextLine();
					System.out.println("enter password");
					String pss = scn.nextLine();
					int count3 = dep.deleteOne(uname,pss);
					System.out.println(count3+" record deleted");
					break;
				case 4:
					break;
				case 5:
					System.out.println("enter username");
					String uname2 = scn.nextLine();
					scn.nextLine();
					Dept dept5 = dep.selectOne(uname2);
					System.out.println(dept5);
					break;
				case 6:
					List<Dept> list = dep.selectAll();
					list.stream().forEach(System.out::println);
					break;
				case 7:
					flag = false;
					break;
				default:
					System.out.println("invalid entry");
					break;
			}
		}
	}
	private static Dept readData() {
		System.out.println("enter your name");
		String name = scn.next();
		scn.nextLine();
		System.out.println("enter user username");
		String uname = scn.nextLine();
		//scn.nextLine();
		System.out.println("enter user password");
		String pss = scn.nextLine();
		//scn.nextLine();
		System.out.println("enter address");
		String ad = scn.nextLine();
		//scn.nextLine();
		System.out.println("enter your state");
		String st = scn.nextLine();
		//scn.nextLine();
		System.out.println("enter your country");
		String cou = scn.nextLine();
		//scn.nextLine();
		System.out.println("enter your email");
		String em = scn.nextLine();
		//scn.nextLine();
		System.out.println("enter your role");
		String role = scn.nextLine();
		//scn.nextLine();
		
		Dept d = new Dept(name,uname,pss,ad,st,cou,em,role);
		return d;
	}

}
