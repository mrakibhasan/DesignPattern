package creational.singletondesignpattern;

public class SingleObject {
	
	
	private static SingleObject instance=new SingleObject();;
	
	private SingleObject(){
	}
	public static SingleObject getInstance(){
		
		return instance;
	}
	public void showMessage(){
		System.out.println("from single Design pattern");
	}
}
