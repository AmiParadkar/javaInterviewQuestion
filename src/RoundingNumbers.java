import java.util.Scanner;

public class RoundingNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the first number");
		float num1 = in.nextFloat();
		in.close();
		
		System.out.println("Num "+ num1 +" is rounded to "+ Math.round(num1));
		System.exit(1);
	}

}
