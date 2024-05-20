 package oopsConcepts;

import java.util.ArrayList;

/*  1) Wrapper class is a class whose object contains or wraps primitive data types.
 2)SINCE Java is object oriented, primitive datatypes doesnot support object. 
 There are total 8 primitive data types and and for this we have to create 8 java  wrapper classes. 
 Objects are needed if we wish to modify arguments passed into a method.primitive data types are passed by a value.
 EXAMPLE:             Data Types         Wrapper classes            Constructors for corresponding wrapper classes.
                        int,                Integer                   int,String
                        char,               Character                  char
                        boolean,            Boolean                    boolean,String
                       flaot,               Float                     float,double,String             
                      double                Double                     double,String 
                       byte,                Byte                        byte,String
                        long,               Long                        long,String
                         String	            String
 
(OBSERVE  Wrapper CLASS WITH CAPITAL LETTER) wrapper classes present in JAVA.LANG.PACKAGE. 
They are IMMUTABLE.
        
        
  4 METHODS IN WRAPPPER CLASS: toString(),valueOf(),parseXxx(),xxxValue().
  
  If you want to represent any object as a string, toString() method comes into existence.
  toString():By overriding tostring() method of Object class we can return values of Object (Polymorphism: parent---Child: Integer---String)
  
  There are 2 Ways to create Wrapper Object.a) Using Constructor approach
                                            b) valueOf() method.(it's  STATIC METHOD) 
                                            
 3) Data structures in the Collection framework, such as ArrayList and Vector, store only objects (reference types) and not primitive types.
 4) An object is needed to support synchronization in multithreading.
 5) java.util package handles only objects and hence wrapper classes help in this case also.
 
 6) Autoboxing: Automatic conversion of primitive types to the object of their corresponding wrapper classes is known as autoboxing.
   For example – conversion of int to Integer, long to Long, double to Double etc.
 


There are 2 Ways to create Wrapper Object.a) Using Constructor approach 
                                          b) valueOf() method.(it's  STATIC METHOD) 
                                        		 
 */

// a) Using Constructor approach ---- primitive data,String data//       

public class WrapperClass{
	
	public static void main(String[] args) {
		Integer i= new Integer(100);
		System.out.println(i);
		
		Integer i1= new Integer("100");
		System.out.println(i1);
		
		//Integer i2= new Integer("hundred"); // java.lang.NumberFormatException
		//System.out.println(i2);
		
		WrapperClass wc= new WrapperClass();
		System.out.println(wc);            //  oopsConcepts.WrapperClass@2c7b84de 
		System.out.println(wc.toString()); //  oopsConcepts.WrapperClass@2c7b84de 
		
		Integer i3= new Integer(100);
		System.out.println(i3);
		System.out.println(i3.toString());//100 //  Integer class is overriding toString() to return contents of String Object
		
	}
}
//There are 2 Ways to create Wrapper Object. or Wrappper Object----Primitive
//a) Using Constructor approach 
// b) valueOf() method.(it's  STATIC METHOD) 
 class WrapperClass1 {

	public static void main(String[] args) {

	// 1- way---Constructor approach//
		
		// to create  Integer Object----  we have 2 constructors  i,e int,string
		 Integer i1=new Integer(100);
		 Integer i2=new Integer("100");
		 
	// to create float object we have 3 constructors  i,e    double,float,String
		
	Float f=new Float(10.2);   // double constructor
	Float f1=new Float(10.1f);  // float constructor
	Float f2= new Float("10.2");  // 	String condtructor


	// b)2- way-------- valueOf() method.(it's  STATIC METHOD)  // no new keyword

		Integer i3= Integer.valueOf(10);
		Integer i4=Integer.valueOf("10");
		
		Float f3= Float.valueOf((float) 100.0);
		Float f4=Float.valueOf(100.0f);
		Float f5= Float.valueOf("100");
		
		Character ch= Character.valueOf('a');
		
		
		String s3= String.valueOf("20");
		String s4= String.valueOf("30");
		System.out.println(s3+s4); // 2030
	}
	
}
// EXAMPLE:1 Primitive OR String --------> Wrapper Object //
		
	class WrapperClass2{
	   
		public static void main(String[] args) {
		
		// constructor//
		Integer i5=new Integer(10);
		Integer i6= new Integer("10");
		System.out.println(i5+i6); // 20
		
		//valueOf()//
		Integer x= Integer.valueOf(25);
		Integer y= Integer.valueOf("30");
		System.out.println(x+y);
		
	}

   }
		
/* EXAMPLE : 2  wrapper object---------> PRIMITIVE DATA :
 *                                         wrapper------>primitive---approach----xxxValue() 
 *                                         Wrapper------> String----approach----toString()
 */
		class WrapperClass3{
			public static void main(String[] args) {
				Integer i1=new Integer(100);
				Integer i2=new Integer((int) 100.0);
			
				
				
// how to convert from wrapper object to primitive data   :  using xxxValue()   xxx=all datatypes int,double,float
				int a=i1.intValue();//100
				double b=i2.doubleValue();//100.0
				float fL= i1.floatValue();//100.0f
				//System.out.println(a+b+fL);// 
				
				// wrapper object to String data	 : toString();
			   String s1= i1.toString();// 100
			   String s2=i2.toString(); // 100.0
			   System.out.println(s1+s2); // concatination
			}
		}
	
/* EXAMPLE : 3 how to convert from primitive------>String and  String------>  primitive//
 *                                    Primitive----->String---approach-----valueof()
 *                                    String------>primitive---approach-----parsexxx()
*/
class WrapperClass4{
	public static void main(String[] args) {
		int a=10; int b=20;
		
		// primitive int ------> String         using valueof()
		String s1=String.valueOf(b);
		String s2=String.valueOf(a);
		System.out.println(s1+s2); //2010
		
		// convert String------> primitive using parsexxx()    xxx= anydata type //
		// Imagine we have a entry form in string and age is int. HOW TO CONVERT STRING TO INT// 
		String str="10.2f";
		 String str1="25";
		
		 int x= Integer.parseInt(str1); //usinG parseXxx();
		 float y=Float.parseFloat(str);// since xxx=all data type of parse.
		 
		 System.out.println(x+y); //35.2
		
	}
	
}
// example//

class WrapperClass5{
	public static void main(String[] args) {
		// Run Configuration---pass arguments
		System.out.println(args.length);// 2 4 8 9 1
		
             System.out.println(args[0]);//2
             System.out.println(args[1]);//4
            System.out.println(args[0]+args[1]);//24 concat
            
            int x=Integer.parseInt(args[0]);//2
            float f= Float.parseFloat(args[1]);//4.0 
	   	System.out.println(x+f);//int+float=6.0
	}
}
 















