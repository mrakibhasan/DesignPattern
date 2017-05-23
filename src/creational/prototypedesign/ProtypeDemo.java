package creational.prototypedesign;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProtypeDemo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter EMployee id: ");
		int id=Integer.parseInt(br.readLine());

		
		System.out.println("Enter EMployee Name: ");
		String name=br.readLine();
		
		
		System.out.println("Enter EMployee Designation: ");
		String designation=br.readLine();
		
		
		System.out.println("Enter EMployee Salary: ");
		Double salary=Double.parseDouble(br.readLine());
		
		
	
		
		System.out.println("Enter EMployee Address: ");
		String address=br.readLine();
		
		
		EmployeeRecords e1=new EmployeeRecords(id, name, designation, salary, address); 
		e1.showRecords();
		EmployeeRecords e2= (EmployeeRecords)e1.getCloned();
		e2.showRecords();

	}

}
