package structural.facadedesignpatter;

public class Iphone implements MobileShop{

	@Override
	public void modelNo() {
		System.out.println("ModelNo:iphone 7");
		
	}

	@Override
	public void price() {
		System.out.println("Price: 899");
		
	}

}
