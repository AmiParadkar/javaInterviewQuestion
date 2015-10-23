
public class Question4 {

	public void m1(String arg1){
		arg1="Hello! How are you?";
	}
	
	public static void main(String[] args) {
		Question4 test = new Question4();
		String str = "I am fine";
		test.m1(str);
		System.out.println(str);
	}

}
