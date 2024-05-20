package oopsConcepts;
/*  Mehtod overlaoding,
 * Constructor overloading
 * Operator Overloading
 * 
 * */
// OVERLOADED METHOD//
public class PolymorphismDemo {
  void m1(int a) {
	  System.out.println("int m1 method");
  }
  void m1(int a, int b) {
	  System.out.println("int a,int b method");
	  
	
  }
  void m1(char ch) {
	  System.out.println("char m1 method");
  }
	public static void main(String[] args) {
		PolymorphismDemo pd = new PolymorphismDemo();
		pd.m1(1000);
		pd.m1(40, 0);
		pd.m1('A');
	
	}

}
// Constructor overloading//
class PolymorphismDemo1{
	PolymorphismDemo1(int a){
		System.out.println("1-arg Constructor overloading");
	}
	PolymorphismDemo1(int a, int b){
		System.out.println("2-arg constructor overloading");
	}
	PolymorphismDemo1(char ch){
		System.out.println("Char constructor overlaoding");
	}
	public static void main(String[] args) {
		new PolymorphismDemo1(10);
		new PolymorphismDemo1(100,200);
		new PolymorphismDemo1('A');
	}
}









