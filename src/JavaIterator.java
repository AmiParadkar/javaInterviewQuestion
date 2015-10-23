//In this problem you need to complete a function func. The function takes an ArrayList as input. In that ArrayList there is one or more integer numbers, then there is a special string "###", after that there are one or more other strings. A sample ArrayList may look like this:
//
//element[0]=>42
//element[1]=>10
//element[2]=>"###"
//element[3]=>"Hello"
//element[4]=>"Java"
//You have to modify the func function by editing at most 2 lines so that the code only prints the elements after the special string "###". For the sample above the output will be:
//
//Hello
//Java
//To restore the original code in the editor, click the top left icon on the editor and create a new buffer.


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class JavaIterator {

	static Iterator func(ArrayList mylist) {
		Iterator it = mylist.iterator();
		while (it.hasNext()) {
			Object element = it.next();
			//System.out.println("element =="+ element);
			System.out.println("element.getClass() =="+ element.getClass());
			
//			if (element.getClass() != String.class) {
//				it.remove();
//				continue;
//			} else if (element.getClass() == String.class && element.toString().startsWith("#")) {
//				it.remove();
//				break;
//			}
//			if(element.getClass() != String.class || (element.toString().startsWith("#")))
//			{
//				it.remove();
//				break;
//			}
			
			//int a = mylist.indexOf());
			//System.out.println(a);
			
		/*
			if (element.getClass().getName() != String.class.getName()){
				//System.out.println("element =="+ element.toString());
				it.remove();
				break;
			}
		*/
		}
		/*
		while (it.hasNext()) {
			Object element = it.next();
			//System.out.println("element =="+ element);
			//System.out.println((String) element);
		
		}*/
		return it;

	}

	public static void main(String[] argh) {
		ArrayList mylist = new ArrayList();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		for (int i = 0; i < n; i++) {
			mylist.add(sc.nextInt());
		}
		mylist.add("###");
		for (int i = 0; i < m; i++) {
			mylist.add(sc.next());
		}

		Iterator it = func(mylist);
		while (it.hasNext()) {
			Object element = it.next();
			System.out.println((String) element);
		}

	}
}
