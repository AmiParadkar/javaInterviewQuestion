import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepetativeChar {

	public static void main(String[] args) {
		System.out.println("Please enter the input string");
		Scanner in = new Scanner(System.in);
		String s = in.next();
		char c = firstNonRepeatedChar(s);
		System.out.println("The first char is "+c);
	}
	public static char firstNonRepeatedChar(String s){
		Character c;
		HashMap<Character,Integer> charHashMap= new HashMap<Character, Integer>();
		
		for (int i=0; i <s.length();i++){
			c = s.charAt(i);
			{
				if(charHashMap.containsKey(c))
					charHashMap.put(c, charHashMap.get(c)+1);
				else
					charHashMap.put(c,1);
			}
		}
		for(int i = 0; i <s.length();i++){
			c = s.charAt(i);
			if(charHashMap.get(c)==1)
				return c;
		}
		return (Character) null;
	}
}