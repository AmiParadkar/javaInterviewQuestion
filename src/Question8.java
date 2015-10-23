
public class Question8 {

	public static void main(String[] args) {
		javahungrymehtod();
	}
	public static int javahungrymehtod(){
		try{
			System.out.println("try");
			
			return 10;
		}
		catch(Exception e)
		{
			System.out.println("catch");
		}
		finally
		{
			System.out.println("finally");
			return 88;
		}
	}
}