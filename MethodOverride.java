package oopsConcepts;
//Method OVERRIDING//

// Rule-1: method OVERRIDEN AND OVERRIDING method name and parameters or signature must be same//
public class MethodOverride extends Parent3 {
	void m1() { // OVERRIDING METHOD
		System.out.println("child m1 method");
	}
	public static void main(String[] args) {
		new MethodOverride().m1();

	}
}

//Rule-2: overridden return type and overriding method return type must be same at primitive level//

/*class MethodOverride1 extends Parent4 {
	int m1() {
		System.out.println("print m1 method");
		return 10;
	}
	public static void main(String[] args) {
		
	}
}
*/ 
//Rule-3:using coveriant return type//
//Rule-3:If overridden method is FINAL we can't override method in child class//