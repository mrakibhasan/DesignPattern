package structural.compositedesignpattern;

public class Accountant implements Employee{
	private int id;
	private String name;
	private String salary;
	

	public Accountant(int id, String name, String salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int getId() {
		
		return id;
	}

	@Override
	public String getName() {
		
		return name;
	}

	@Override
	public String getSalary() {
		
		return salary;
	}

	@Override
	public void print() {
		
		 System.out.println("=============Accountant=============");  
         System.out.println("Id ="+getId());  
         System.out.println("Name ="+getName());  
         System.out.println("Salary ="+getSalary());  
         System.out.println("==========================");  
	}

	@Override
	public void add(Employee employee) {
		
		
	}

	@Override
	public void remove(Employee employee) {
		
		
	}

	@Override
	public Employee getChild(int i) {
		
		return null;
	}

}
