package behavioral.observerdesignpattern;

public class HexaObserver extends Observer{

	public HexaObserver(Subject subject){
		this.subject = subject;
		this.subject.attach(this);
		//System.out.println(this.toString());
	}

	@Override
	public void update() {
		System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() ); 
	}
}