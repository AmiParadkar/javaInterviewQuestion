
public class Question2 {

	public static void JavaHungry(Exception e){
		System.out.println("Exception");
	}
	public static void JavaHungry(ArithmeticException ae){
		System.out.println("ArithmeticException");
	}
	public static void JavaHungry(Object o){
		System.out.println("Object");
	}
	
	public static void main(String[] args) {
		JavaHungry(null);
	}

}
