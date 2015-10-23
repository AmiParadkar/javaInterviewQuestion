import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//3
//11 2 4
//4 5 6
//10 8 -12
//Sample Output
//
//15
//Explanation
//
//The first diagonal of the matrix is:
//
//11
//    5
//        -12
//Sum across the first diagonal: 11 + 5 - 12 = 4
//
//The second diagonal of the matrix is:
//
//        4
//    5
//10
//Sum across the second diagonal: 4 + 5 + 10 = 19 
//Difference: |4 - 19| = 15
//

public class DiagnaolSq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Integer[][] intNums;
		intNums = new Integer[n][n];
		s.nextLine();
		for(int i = 0; i <n;i++){
			String[] nums = s.nextLine().split(" ");
			
			for(int j = 0; j <nums.length ;j++){
				//System.out.println(nums[j]);
				intNums[i][j] = Integer.parseInt(nums[j]);
				
			}
		}
		s.close();
		int resultL2R = 0;
		for(int i = 0; i <n ;i++){
			//System.out.println(intNums[i][i]);
			resultL2R= resultL2R + (intNums[i][i]);
			
			
		}
		//System.out.println(resultL2R);
		int resultR2L = 0;
		int j = 0;
		//System.out.println(n);
		for(int i = n; i >0 ;i--){
			//System.out.println(i);
			//System.out.println(intNums[j][i-1]);
			resultR2L= resultR2L+(intNums[j][i-1]);
			j++;
			continue;
			
		}
		//System.out.println(resultL2R);
		//System.out.println(resultR2L);
		System.out.println(Math.abs(resultR2L-resultL2R));
	}

}
