package structural.facadedesignpatter;

import java.util.Scanner;

public class MobileShopDemo {
	public static void main(String[] args){
		int selection;
		ShopKeeper shopKeeper=new ShopKeeper();
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("+====Mobile Shop===========");
		System.out.println("Select your phone to See the details");
		System.out.println("Press 1 for Samsung");
		System.out.println("Press 2 for iphone");
		System.out.println("press 0 for exit");
		System.out.println("=============================");
		
		do{
			selection=scanner.nextInt();
			switch(selection){
			case 1: if(selection==1){
				System.out.println("You choose IPhone: And Details are: ");
				shopKeeper.iphoenSell();
				break;
			}
			case 2:if (selection==2){
				shopKeeper.samsungSell();
				break;
			}
			default: System.out.println("Sorry to got");
			return;
			}
			System.out.println("continue or not? press 0 for exit");
		}
		while(selection!=0);

	}


}
