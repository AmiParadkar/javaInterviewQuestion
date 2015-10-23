import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class HM {

	Map<Integer, String> m = null; 
			
	public HM() {
		m = new HashMap<Integer, String>(10);
		m.put(new Integer(10), "A");
		m.put(new Integer(20), "B");
		m.put(new Integer(30), "C");
		m.put(new Integer(10), "D");
		m.put(new Integer(20), "E");	
		
		LinkedHashSet<Integer> m1 = new LinkedHashSet<Integer>();
		m1.add(10);
		m1.add(20);
		m1.add(10);
		
		for (Map.Entry<Integer, String> entry : m.entrySet()) {
		    Integer key = entry.getKey();
		    String value = entry.getValue();
		    
		    System.out.println(key + " " + value);
		}
		
		Iterator<Integer> i = m1.iterator();
		while(i.hasNext())
		    
		    System.out.println(i.next());
		}
	
	
	

	public static void main(String [] args) {
		new HM();
		
	}
}
