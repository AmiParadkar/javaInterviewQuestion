import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = s.nextInt();
		s.close();
		int list[] = new int[num];
		list[0]= 0;
		list[1]=1;
		System.out.print(list[0]+",");
		System.out.print(list[1]+",");
		for(int i = 2 ; i < num; i++){
			System.out.print(fib(i,list)+",");
		}

	}
	private static int  fib(int i,int[]list){
		
		list[i] = list[i-1]+list[i-2];
		return list[i];
	}

}
