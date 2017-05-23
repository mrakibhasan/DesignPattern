package structural.facadedesignpatter;

public class ShopKeeper {
	public Samsung samsung;
	public Iphone iphone;
	
	public ShopKeeper(){
		samsung=new Samsung();
		iphone=new Iphone();
	}
	public void iphoenSell(){
		iphone.modelNo();
		iphone.price();
	}
	public void samsungSell(){
		samsung.modelNo();
		samsung.price();
	}

}
