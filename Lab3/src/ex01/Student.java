package ex01;

public class Student {
	
	private String name;
	private int ditno;
	private String address;
	
	Student(String na,int itno, String add){
		na = name;
		itno = ditno;
		add = address;
		
		
	}
	
	Student(){
		System.out.println("Student constructor");
	}
	
	public void print(String n,int i,String a) {
		System.out.println("Name : "+n);
		System.out.println("DIT No : "+i);
		System.out.println("Address : "+a);
	}

	
}
