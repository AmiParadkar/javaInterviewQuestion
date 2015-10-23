import java.util.Scanner;

// a+20b,a+20b+21b,......,a+20b+21b+...+2n−1b
//Input Format
//
//The first line will contain the number of testcases t. Each of the next t lines will have three integers, a, b, and n.
//
//Constraints:
//
//0≤a,b≤50
//1≤n≤15
//Output Format
//
//Print the answer to each test case in separate lines.
//
//Sample Input
//
//2
//0 2 10
//5 3 5
//Sample Output
//
//2 6 14 30 62 126 254 510 1022 2046
//8 14 26 50 98
//Explanation
//
//In the first case:
//
//1st term=0+1*2=2
//2nd term=0+1*2+2*2=6
//3rd term=0+1*2+2*2+4*2=14
public class NumSeries {
	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);
		 int t=s.nextInt() ;
//		System.out.println("Enter the value for a");
//		int a = s.nextInt();
//		System.out.println("Enter the value for b");
//		int b = s.nextInt();
//		System.out.println("Enter the value for n from 1 - 15");
//		int n = s.nextInt();
		
		 for(int z=1;z<=t;z++)
	        {   
	           int  a=s.nextInt();
	            int b=s.nextInt();
	            int n=s.nextInt();
	           
		//a+2^0b,a+2^0b+2^1b,......,a+20b+21b+...+2n−1b
//		0+(1*2) = 2
//		0+(1*2)+0+(2*2) = 6
//		0+(1*2)+(2*2)+(4*2)= 14
//		0+(1*2)+(2*2)+(4*2)+(8*2)=30
//		5+(1*3) = 8
//		5+(1*3)+5+(2*3) = 	
	    int result = a;
		for (int i=0; i <n; i++){
			
			//for(int y = 0; y <=i ;y++)
			//{
				//System.out.println("i = "+ i +"y = "+ y);
				//System.out.println("2^y = "+ Math.pow(2, y));
				//result =  result + (a+(2^y*b));
				result = result + (int)(Math.pow(2, i)*b);
				//System.out.println("Inside loop result = "+ result);
			//}
			System.out.print(result +" ");
		}
		
		
	}
	}

}
