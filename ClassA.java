package oopsConcepts;

public class ClassA {
    static {
    	System.out.println("static 1 method");
    }
    public static void main(String[] args) {
		 
	}
}

 class ClassB extends ClassA{
	static {
		System.out.println("Static 2 method");
	}
}
 
 class ClassC extends ClassB{
	 static {
		 System.out.println("Static 3 method");
	 }
	 
 }