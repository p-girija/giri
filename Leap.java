
import java.util.Scanner;


public class leapornot {

	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int y;
		y=in.nextInt();
		if((y%4==0)&&(y%100!=0 )|| (y%400==0))
			System.out.println(y+"is leap year");
		else
			System.out.println(y+"is not leap year");
			
	}

}
