import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("Please enter the string to reverse");
		Scanner in = new Scanner (System.in);
		String str = in.nextLine();
		in.close();
		ReverseString rs = new ReverseString();
		String reverse = rs.manuallyReverseString(str);
		System.out.println("The reverse string is "+ reverse);
		reverse = rs.reverseStringWithInBuildFunction(str);
		System.out.println("The reverse string is "+ reverse);
		String s[] = {"1arr","2arr","3arr","4arr"};
		String[] r = rs.reverseArraryList(s);
		for(int i = 0; i < r.length;i++)
			System.out.println("The reverse string is "+ r[i]);
	}
	private String manuallyReverseString(String str){
		//String str = "AmiMehtaParadkar";
		StringBuffer sb = new StringBuffer();
		for (int i = (str.length() - 1); i >= 0 ; i --){
			
			sb.append(str.charAt(i));
		}
		
		return sb.toString();
	}
	private String reverseStringWithInBuildFunction(String str){
		StringBuilder sb = new StringBuilder(str);
		return sb.reverse().toString() ;
	}
	private String[] reverseArraryList(String[] strArr){
		String r[] = new String[strArr.length];
		int c = 0;
		for(int i = (strArr.length-1); i>=0; i--){
			r[c] = strArr[i];
			c++;
		}
		return r;
	
	}

}
