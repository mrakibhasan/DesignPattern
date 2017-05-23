package creational.factorydesignpattern.anotherexample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShapeFactoryDemo {
	public static void main(String[] args) throws IOException{
	ShapeFactory shapeFactory=new ShapeFactory();
	System.out.println("Enter the name of shape");
	BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
	String shapeName=reader.readLine();
	Shape shape=shapeFactory.getShape(shapeName);
	shape.draw();
	
	}

}
