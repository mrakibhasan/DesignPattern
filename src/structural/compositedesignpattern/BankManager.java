package structural.compositedesignpattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BankManager implements Employee {

	private int id;
	private String name;
	private String salary;
	
	
	public BankManager(int id, String name, String salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	List<Employee> employees=new ArrayList<>();
	
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
	public void add(Employee employee) {
		employees.add(employee);
		
	}

	@Override
	public void remove(Employee employee) {
		employees.remove(employee);
		
	}

	@Override
	public Employee getChild(int i) {
		
		return employees.get(i);
	}
	@Override  
    public void print() {  
     System.out.println("===========Manager===============");  
     System.out.println("Id ="+getId());  
     System.out.println("Name ="+getName());  
     System.out.println("Salary ="+getSalary());  
     System.out.println("==========================");  
       
    /* Iterator<Employee> it = employees.iterator();  
       
         while(it.hasNext())  {  
           Employee employee = it.next();  
           employee.print();  
        } */ 
         for(Employee emp:employees){
        	 emp.print();
         }
    }  

}
