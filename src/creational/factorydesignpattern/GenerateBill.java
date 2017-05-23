package creational.factorydesignpattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {

	public static void main(String[] args) throws IOException {
		PlanFactory planFacotry=new PlanFactory();
		System.out.println("Enter The Bill Name to Generate the Bill");
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String billName=reader.readLine();
		System.out.println("Enter the Billing Units: ");
		int unit=Integer.parseInt(reader.readLine());
		Plan p=planFacotry.getPlan(billName);
		System.out.println("Bill Amount for "+billName+ "  and for units: "+unit);
		p.getRate();
		p.calculateBill(unit);

	}

}
