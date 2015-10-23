import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class LetterConting {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		System.out.println("Please enter a string");
		in.close();
		Map<Character,Integer> cntMap = new HashMap<Character, Integer>();
		for (int i = 0; i < input.length();i++){
			Character c = input.charAt(i);
			if(cntMap.containsKey(c))
				cntMap.put(c, cntMap.get(c)+1);
			else
				cntMap.put(c,1);
		}
		Set<Character> keySet = new HashSet<Character>();
		keySet = cntMap.keySet();
		for (Character k:keySet){
			System.out.println("Character " +k + "   occured "+ cntMap.get(k));
		}
		Character c = returnFirstCharThatIsNotRepeated(input,cntMap);
		System.out.println("The first character to be unique is "+ c);

	}
	private static Character returnFirstCharThatIsNotRepeated(String str,Map<Character,Integer> mapCnt){
	
		for (int i = 0; i < str.length();i++){
			Character c1 = str.charAt(i);
			if(mapCnt.get(c1) == 1){
				return c1;
			}
				
		}
		return null;
	}

}
