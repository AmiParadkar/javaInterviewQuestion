
public class Question5 {

	public static void main(String[] args) {
		short s = 0;
		int x = 07;
		int y = 08;
		int z = 123456;
		s+=z;
		System.out.println(""+x+y+s);
	}

}
/* Compilation error as number starting with 0 is an octal number*/