package oopsConcepts;

public abstract class AbstractDemo { // Declaring class as abstract
         void m1() { // declaring 
        	 
         }
         void m2() {
        	 
         }
         abstract void m3();// Declaring  method as abstract directly end with semi-colon//
      abstract void m4() ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


abstract class AbstractDemo1 extends AbstractDemo {
	     void m1() {   // implementing
	     System.out.println("m1 method");
	    	 }
	      void m2() {
	    	  System.out.println("m2 method");
	      }
	      void m3() {
	    	  System.out.println("m3 method");
	      }
	      void m4() {
	    	  System.out.println("m4 method");
	      }
	      public static void main(String[] args) {
	    	  //AbstractDemo1 ad1= new AbstractDemo1();
	    	//ad1.m1(); ad1.m2(); ad1.m3();
	// AbstractDemo ad= new AbstractDemo1();// parent reference variable can hold child class object// 
	    //	  ad.m1(); ad.m2(); ad.m3(); ad.m4();
	    	
	    	 
		}
}

abstract class AbstractDemo2 extends AbstractDemo{
	void m1() {
		System.out.println("m1 method");
	}
	public static void main(String[] args) {
		
	}
	
}	
	
abstract class AbstractDemo3 extends AbstractDemo2{// declare the class as abstract if its incomplete declaration//
	void m2() {
		System.out.println("m2 method");
	}
   
}

class AbstractDemo4 extends AbstractDemo3{
	void m3() {
		System.out.println("m3 method");
	}
	void m4() {
		System.out.println("m4 method");
	}
	public static void main(String[] args) {
		AbstractDemo ad = new AbstractDemo4();
		ad.m1(); ad.m2(); ad.m3(); ad.m4();
	}
}

abstract class AbstractDemo5 {
	abstract int num(int a, int b) ;
	abstract String login(String uname, String pswd);
	
	public static void main(String[] args) {
		
	}
	
}

class AbstractDemo6 extends AbstractDemo5{
	int num(int a, int b) {
		return a;
	}
	String login(String username, String pswd) {
		return username ;
	}
	public static void main (String[] args) {
		AbstractDemo6 ad6= new AbstractDemo6();
		int print1=ad6.num(100, 1);
		System.out.println(print1);
		String print2=ad6.login("Bharath", "23456");
		System.out.println(print2);
	}
}













