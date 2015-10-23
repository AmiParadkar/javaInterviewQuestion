
public class FuzzBuzz {
	private  static final String mod3 = "Fuzz";
	private  static final String mod7 = "Buzz";
	private  static final String mod3_7 = "FuzzBuzz";
	
	
	public static void main(String[] args) {
		int max = 100;
		for (int i = 0; i < max; i ++)
		{
			if(i%3 == 0 && i%7 == 0){
				System.out.println("i == "+i + " " + mod3_7);
			}
			else if(i % 3 == 0){
				System.out.println("i == "+i + " " + mod3);
			}
			else if(i%7 == 0){
				System.out.println("i == "+i + " " + mod7);
			}
		}
		
	}

}
