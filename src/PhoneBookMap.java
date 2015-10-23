import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBookMap {
	public static void main(String []argh)
	   {
		
	      Scanner in = new Scanner(System.in);
	       Map<String,Integer> phoneMap = new HashMap();
	      int n=in.nextInt();
	      in.nextLine();
	      for(int i=0;i<n;i++)
	      {
	         String name=in.nextLine();
	         int phone=in.nextInt();
	          phoneMap.put(name,phone);
	         in.nextLine();
	      }
	      while(in.hasNext())
	      {
	         String s=in.nextLine();
	         if(!phoneMap.containsKey(s))
	        	 System.out.println("Not found");
	         else
	         {
	        	 Integer phone = phoneMap.get(s);
	        	 System.out.println(s+"="+phone);
	         }
	      }
	   }
}
