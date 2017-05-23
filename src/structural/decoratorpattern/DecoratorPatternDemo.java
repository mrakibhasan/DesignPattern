package structural.decoratorpattern;

public class DecoratorPatternDemo {
	   public static void main(String[] args) {

	      Shape circle = new Circle();
	      System.out.println("Circle with normal border");
	      circle.draw();
	      
	      Circle c=new Circle();
	      Shape redCircle = new RedShapeDecorator(c);
	      System.out.println("\nCircle of red border");
	      redCircle.draw();
  
	      Rectangle r=new Rectangle();
	      Shape redRectangle = new RedShapeDecorator(r);
	      System.out.println("\nRectangle of red border");
	      redRectangle.draw();
	   }
	}