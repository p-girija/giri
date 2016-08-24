import java.util.Scanner;
public class alp{

	public static void main(String[] args)throws java.io.IOException {
		Scanner in=new Scanner(System.in);
		char n;
		n=(char)System.in.read();
		if(Character.isLetter(n))
			System.out.println(n+"character is alpha");
		else
			System.out.println(n+"not alpha");
	}

}
