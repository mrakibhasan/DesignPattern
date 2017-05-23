package structural.facadedesignpatter;

public class Samsung implements MobileShop {

	@Override
	public void modelNo() {
		System.out.println("ModelNO:Galaxy Note5");

	}

	@Override
	public void price() {
		System.out.println("Price: 799USD");

	}

}
