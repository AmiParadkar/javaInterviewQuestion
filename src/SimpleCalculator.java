import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long num1 , num2 = 0;
		char operator;
		
		System.out.println("Please enter the first number");
		num1 = in.nextLong();
		System.out.println("Please enter the second number");
		num2 = in.nextLong();
		System.out.println("Please enter the operator from the following list(+, - , * , /)");
		operator = in.next().charAt(0);
		in.close();
		SimpleCalculator sc = new SimpleCalculator();
		double result = sc.getResult(num1,num2,operator);
		System.out.println("Result = "+ result);
	}
	private double getResult(long num1, long num2, char operator){
		double ans = 0;
		switch (operator){
			case '+' : ans = Math.addExact(num1,num2);
				break;
			case '-' : ans = Math.subtractExact(num1, num2);
				break;
			case '*' : ans = Math.multiplyExact(num1,num2);
				break;
			case '/' : ans = Math.floorDiv(num1,num2);
				break;
			default : System.out.println("Invalid operator"+ operator +" Please use one of the following (+, - , * , /" );
				break;
		}
		return ans;
	}
	

}
