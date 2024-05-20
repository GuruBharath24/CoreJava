package oopsConcepts;

 public class EmpBean {

	
	public static void main(String[] args) {
		EncapsulationDemo ed =new EncapsulationDemo();
		ed.setEmpid(111);
		ed.setEname("bharath");
		int num=ed.getEmpid();
		String str=ed.getEname();
		System.out.println(num);
		System.out.println(str);
	
		EncapsulationDemo ed1= new EncapsulationDemo();
		ed1.setEmpid(222);
		ed1.setEname("anand");
		System.out.println(ed1.getEmpid());
		System.out.println(ed1.getEname());
		
		
		

	}

}
