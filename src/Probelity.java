import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Probelity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arrList = new ArrayList<Integer>(5);
		Probelity p = new Probelity();
		int rollNum = 10;
		Map<Integer,Integer> probMap = new HashMap<Integer,Integer>();
		p.resetMap(probMap);
		p.printMap(probMap);
		System.out.println("##########################");
		for(int i = 0 ; i < rollNum; i++)
		{
			p.probFun(probMap);
			p.printMap(probMap);
			
			
			if(p.checkAllValuesZero(probMap) != true)
				p.resetMap(probMap);
			
		}
	}
	public void printMap(Map<Integer,Integer> probMap){
		for(int i =1 ; i <=6; i++)
		{
			System.out.println(probMap.get(i));
		}
	}
	public boolean checkAllValuesZero(Map<Integer,Integer> probMap )
	{
		boolean found =false;
		Probelity p = new Probelity();
		for(int i =1 ; i <=6; i++)
		{
//			System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
//			p.printMap(probMap);
//			System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
			if(probMap.get(i) != 0)
			{
				found = true;
				break;
			}
		}
		if(found == true)
			return true;
		return false;
	}
	public Map<Integer,Integer> resetMap(Map<Integer,Integer> probMap){
		System.out.println("Inside reset");
		for(int i =1 ; i <=6; i++)
		{
			if(i != 6)
				probMap.put(i, 1);
			else
				probMap.put(i, 5);
		}
		return probMap;
	}
	public Map<Integer,Integer> probFun(Map<Integer,Integer> probMap) {
//		int numDice = 1;
//		double result = (double)numDice/6;
//		System.out.println(result);
		Probelity p = new Probelity();
		for(int i =1 ; i <=6; i++)
		{
//			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
//			p.printMap(probMap);
//			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println("i is "+i+" value in map for i is"+probMap.get(i));
			if(probMap.get(i) != 0)
			{
				probMap.replace(i, probMap.get(i)-1);
				break;
			}
			else
				continue;
		}
		return probMap;
		
	}

}
