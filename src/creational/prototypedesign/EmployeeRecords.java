package creational.prototypedesign;

public class EmployeeRecords implements Protoype{
	private int id;
	private String name;
	private String designation;
	private double salary;
	private String address;
	
	public  EmployeeRecords() {
		 
	}

	
	public EmployeeRecords(int id, String name, String designation, double salary, String address) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.address = address;
	}
public void showRecords(){
	System.out.println("Employee recods of Oracle corporation");
	System.out.println("--------------------------------------");
	System.out.println("Eid"+"\t"+"name"+"\t"+"Designation"+"\t"+"salary"+"\t"+"address");
	System.out.println(id+"\t"+name+"\t"+designation+"\t"+salary+"\t"+address);
}
 
	@Override
	public Protoype getCloned() {
		
		return new EmployeeRecords(id, name, designation, salary, address);
	}

}
