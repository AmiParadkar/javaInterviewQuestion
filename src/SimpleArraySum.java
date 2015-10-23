
import java.util.Scanner;

public class SimpleArraySum {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.nextLine();
		String[] nums = s.nextLine().split(" ");
		s.close();
		int result = 0;
		for(int i = 0; i <n ;i++){
			result+= Integer.parseInt(nums[i]);
			
		}
		System.out.println(result);
	}
}
