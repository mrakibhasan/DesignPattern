package creational.singletondesignpattern;

public class SingleObjectDemo {

	public static void main(String[] args) {
		SingleObject instance=SingleObject.getInstance();
		instance.showMessage();
	}

}
