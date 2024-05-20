package oopsConcepts;


public class Child extends Parent {
		
		void m3() { System.out.println("m3 method");}
		void m4() { System.out.println("m4 method");}
		
		public static void main(String[] args) {
			Child  id1= new Child();
			id1.m1();
			id1.m2();
			id1.m3();
			id1.m4();
		
	        }
			
		}

class Child1 extends Parent1{
	int x=100;
	int y=200;
	
	void addDemo(int i, int J) {
		System.out.println(super.a+super.b);//
		System.out.println(this.x+this.y);//300
		System.out.println(i+J);//30
	
	}
	public static void main (String[] args) {
		Child1 c= new Child1();
		c.addDemo(10, 20);
	
	}
}


// accessing parent, local variables using this and super keywords. or super class variables//
/*  class InheritanceDemo1  extends InheritanceDemo{
	int a=1000;
	int b=2000;
	void addDemo(int a, int b) {
		System.out.println(a+b);// 300
		System.out.println(this.a+this.b);// 3000
		System.out.println(super.a+super.b);	// 30000
	}
	public static void main(String[] args) {
		InheritanceDemo1 id1 =new InheritanceDemo1();
		id1.addDemo(100, 200);
		
	}
}
*/

// parent methods//

class Child2 extends Parent{
	void m3() {
		System.out.println("m3 method");
	}
	public static void main(String[] args) {
		Child2 id1=new Child2();
		id1.m3();
		id1.m2();
		id1.m1();
	
	}
	
}
// if parent and child class has same method name//
 class Child3 extends Parent  {
	 void m1() {
		 System.out.println("child m1 method");
	 }
	 void m2() {
		 System.out.println("child m2 method");
	 }
	 void m3() {
		 this.m1();
		 this.m2();
		 super.m1();
		 super.m2();
	 }
	 public static void main(String[] args) {
		 Child3 c =new Child3();
		 c.m3(); 
	}
 }
	

// parent class constructors//
 
class Child4 extends Parent2{
	Child4 () {

		System.out.println("child m1 method");
	}
	Child4(int a){
		System.out.println("child m2 method");
	}
	 public static void main(String[] args) {
		new Child4(); new Child4(10);
		
		 
	 }
 }

class Child9  extends Parent2{
	Child9 () {
		this(10);
		//Constructor call must be the first statement in a constructor
		System.out.println("child m1 method");
	}
	Child9(int a){
		super();// parent  0-arg const
		System.out.println("child m2 method");
	}
	 public static void main(String[] args) {
		 new Child9();
		
		 
	 }
	
}

class Child5 extends Parent2{
	Child5 () {
		super();
	//	this(10);// Constructor call must be the first statement in a constructor
		//Constructor call must be the first statement in a constructor
		System.out.println("child m1 method");
	}
	Child5(int a){
		
		System.out.println("child m2 method");
	//	super();// Constructor call must be the first statement in a constructor
	}
	 public static void main(String[] args) {
		 new Child5();
		
		 
	 }
}

/*
class Child6 extends Parent3 {
	Child6(){
		super(10);
		System.out.println("Child m1 method");
	}
	 
	
	public static void main(String[] args) {
         new Child6();	
      
	}
}

*/
class Child7 {
	Child7(){
		System.out.println("child m1 method");
	}
	Child7(int a){
		System.out.println("child m2 method");	
	}
	Child7(int a, int b){
		System.out.println("Child m3 method");
	}
	public static void main(String[] args) {
		new Child7();
		new Child7(500);
		new Child7(1000,20000);
	}
}

class Child8 extends Parent2{
	// NO CONSTRUCTOR MENTIONED//
	/*Child6(){
		
	}
	*/
	public static void main(String[] args) {
		
		
	}
}
























