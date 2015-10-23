import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Output Format
//
//Print T lines. In the ith line, print number of unique pairs you have after taking ith pair as input.
//
//Sample Input
//
//5
//john tom
//john mary
//john tom
//mary anna
//mary anna
//Sample Output
//
//1
//2
//2
//3
//3
//Explanation
//
//After taking the first input, you have only one pair: (john,tom)
//After taking the second input, you have two pairs: (john, tom) and (john, mary)
//After taking the third input, you still have two unique pairs.
//After taking the fourth input, you have three unique pairs: (john,tom), (john, mary) and (mary, anna)
//After taking the fifth input, you still have three unique pairs.

public class UniqueHashSet {

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		Set setMap = new HashSet();
		int t = s.nextInt();
		s.nextLine();
		
		for(int i = 0 ; i <t; i++){
			setMap.add(s.nextLine());
			System.out.println(setMap.size());
		}
		
		
		
	}
}
