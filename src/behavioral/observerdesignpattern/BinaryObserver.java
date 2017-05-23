package behavioral.observerdesignpattern;

public class BinaryObserver extends Observer{

	public BinaryObserver(Subject subject){
		this.subject = subject;
		this.subject.attach(this);// add the observer to the subject
	}

	@Override
	public void update() {
		System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) ); 
	}
}