import java.util.Scanner;
public class amstrong {

	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int l,t,s=0;
		l=in.nextInt();
		int m,c=0;
		m=l;
		while(m>0)
		{
			c++;
			 m=m/10;
			
		}
		int n=l;
		while(n>0)
		{
			t=n%10;
			s=s+(int)Math.pow(t,c);
			n=n/10;
			
			
		}
		if(l==s)
			System.out.println("the given no is armstrong number");
		else
			System.out.println("the given no is not  armstrong number");
		
	}

}
