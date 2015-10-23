
public class ReturnFromFinally {

	public static void main(String[] args) {
		try{
			System.out.println("Inside try");
			//return;
			System.exit(0);
		}catch(Exception e){
			System.out.println("Inside catch");
			return;
			
			
		}finally{
			System.out.println("Inside finally");
		}

	}

}
