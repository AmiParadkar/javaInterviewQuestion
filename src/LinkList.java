import java.util.LinkedList;
import java.util.List;

public class LinkList {
	
	public  static void  main(String args[]){
		List <String> strList = new LinkedList();
		strList.add("a");
		strList.add("b");
		strList.add("c");
		//LinkList.printLinkList(strList);
		
	}
	public  static void printLinkList(List<String> strList){
		for(String str : strList)
			System.out.println(str); 
	}
}
