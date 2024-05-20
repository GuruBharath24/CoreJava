package oopsConcepts;

public class ConstructorsDemo {
          
	void m1() {
		System.out.println("print m1 method");
	}
	ConstructorsDemo(){ // user defined constr//
		System.out.println("0-args constructor");
	}
	ConstructorsDemo(int a){ 
		System.out.println("1-arg constructor");
	}
	
	public static void main(String[] args) {
		ConstructorsDemo cd=new ConstructorsDemo();
		ConstructorsDemo cd1=new ConstructorsDemo(10);
		cd1.m1();
		cd.m1();

	}

}
