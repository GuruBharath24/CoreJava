package oopsConcepts;
/* Instance Method
 * Static Mehtod 
 1) RETURN TYPE IS MANADATORY IN A METHOD.
 2) TWO METHODS WITH SAME SIGNATURE IS NOT POSSIBLE.
 3) TO REPRESENT INSTANCE VARIABLES USE THIS KEYWORD.INSIDE STATIC METHOD THIS KEYWORD NOT ALLOWED.
4) OPERATOR OVERLAODING AND EXAMPLES
5) RETURN TYPE AND EXAMPLES
6) CLASS AND OBJECT NAME SAME
7) RETURN VARIABLE
 */

public class MethodDemo {
	void m1() {
		System.out.println("print m1 method");
	}
	static void m2() {  // Static method
		System.out.println("PRINT M2 METHOD");
	}
	public static void main(String[] args) {
	  MethodDemo md =new MethodDemo();
	  md.m1();
	  MethodDemo.m2();

	}

}
class MethodDemo1{	
	void m1(int a, char b) {
		System.out.println(a);
		System.out.println(b);
	}
	static void m2(double d, String str) {// Static method
		System.out.println(d);
		System.out.println(str);
	}
    public static void main(String[] args) {
    	MethodDemo1 md= new MethodDemo1();
    	md.m1(100, 'A');
    	MethodDemo1.m2(1000.0, "ANAND");
    }
}

// passing an Object in parameters place instead of int,char,string//
class X{}
class Emp{}
class Y{}
class Student{}
class MethodDemo2{
	void m1(X x, Emp e) { // passing object as parameter
    	System.out.println("print m1 method");
    }
	static void m2(Y y, Student s) {
		System.out.println("print m2 method");
	}
	public static void main(String[] args) {
        		MethodDemo2 md=new MethodDemo2();
        		X x= new X();
        		Emp e = new Emp();
        		md.m1(x,e);
        		md.m1(new X(),new Emp());// alternative way for calling
        		
        		Y y =new Y();
        		Student s= new Student();
        	    MethodDemo2.m2(y, s);
        		MethodDemo2.m2(new Y(),new Student()); // alternative way for calling
        		   		
	}
}

/*In a class Two methods with same  signature is not allowed//

class MethodDemo3{
	void m1() {
		System.out.println("m1 method");
	}
	void m1() {
		System.out.println("m2 method");
	}
	public static void main(String[] args) {
		MethodDemo3 md = new MethodDemo3();
		md.m1();
	}
}
*/

// 
class MethodDemo4{
	void m1() {
		m2();
	   System.out.println("print m1 method");
	}
	void m2() {
		m3(10);
		System.out.println("print m2 method");
	}
	void m3(int a) {
		System.out.println("print m3 method");
	}
	public static void main(String[] args) {
		MethodDemo4 md=new MethodDemo4();
		md.m1();
		
	}
}

// To represent instance variables use THIS keyword//

class MethodDemo5{
	 int x=20; // Instance variables
	 int y=200;
	  
	 void m1(int x, int y) { // local variables 
		 System.out.println(this.x+this.y);// instance
		 System.out.println(x+y);
	 }
	
	
	public static void main(String[] args) {
		MethodDemo5 md=new MethodDemo5();
		md.m1(200, 2000);
	}
}
// OPERATOR OVERLAODING//
class MethodDemo6{
	void m1(int a, String b) {
		System.out.println(a+b);
		
	}
	
	public static void main(String[] args) {
		MethodDemo6 md=new MethodDemo6();
		md.m1(10, "BHARATH");
	}
}

//RETURN TYPE AND EXAMPLES//
 // primitive values as return type//
class MethodDemo7{
	int m1() {
		System.out.println("print m1 method");
		return 10;
	}
	float m2() {
       System.out.println("print m2 method");
       return 20.5f;
	}
	String m3() {
		System.out.println("print m3 method");
		return ("bharath");
	}
	
	
	public static void main(String[] args) {
		MethodDemo7 md=new MethodDemo7();
		int x=md.m1();
		System.out.println(x);
		float y=md.m2();
		System.out.println(y);
		 
		String str=md.m3();
		System.out.println(str);
	}
}

// OBJECT AS RETURN TYPE//
class Test{}
class Bean{}
class MethodDemo8{
	
	Test m1() {
		System.out.println("print m1 method");
		Test t = new Test();
		return t;
	}
	Bean m2() {
		System.out.println("print m2 method");
		Bean b= new Bean();
		return b;
	}
	static String m3() {
		return "bharath";
	}
	
	public static void main(String[] args) {
		MethodDemo8 md= new MethodDemo8();
		Test t1=md.m1();
		//System.out.println(t1);
		  Bean b2=md.m2();
		  //System.out.println(b2);
		  String s= MethodDemo8.m3();
		  System.out.println(s);
		  
		
	}
}

// CLASS AND OBJECT NAME SAME//

class MethodDemo9{
	
	MethodDemo9 m1() {
		System.out.println("print m1 method");
		MethodDemo9 md= new MethodDemo9();
		return md;
	}
	 MethodDemo9 m2() {
		 System.out.println("print m2 method");
		 MethodDemo9 md1=new  MethodDemo9();
		 return md1;
	 }
	 MethodDemo9 m3() {
		 System.out.println("print m3 method");
		 return this;
	 }
	public static void main(String[] args) {
		 MethodDemo9 md2= new  MethodDemo9();
		 md2.m1();
		md2.m2();
		 md2.m3();
		
	}
}

//  RETURN VARIABLES AND PRIORITY//

class MethodDemo10{
	 int a=100;
	 int m1(int a) {
		 System.out.println("print m1 method");
		 return a; // priority to local variable
	 }
	public static void main(String[] args) {
		MethodDemo10 md= new MethodDemo10();
		int x=md.m1(1000);
		System.out.println("Return method value ="+ x);
	}
}

class MethodDemo11{
	int a=100;
	int  m1(){ // parameter not provided
		System.out.println("print m1 method");
		return a;// priority to innstance variable
	}
	public static void main(String[] args) {
		MethodDemo11 md= new MethodDemo11();
		int x=md.m1();
		System.out.println("Return method value ="+ x);
	}
}

class MethodDemo12{
	int a=100;
	int m1(int a) {
		System.out.println("print m1 method");
		return this.a; // priority is given to Instance using THIS
	}
           public static void main(String[] args) {
        	   MethodDemo12 md=new MethodDemo12();
        	  int x= md.m1(10);// declaring nd calling int a value in m1 method .
        	  System.out.println("Return method value ="+x);
		}	
}











