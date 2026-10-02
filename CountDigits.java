package Demo;
import java.util.Scanner;
public class CountDigits {
	public static int Countdigit(int n) {
		int count=0;
		for( ; n>0; ) {
			n=n/10;
			count++;
		}
		return count;
		
	}

	public static void main(String[] args) {
	   Scanner	sc=new Scanner(System.in);
       int n =sc.nextInt();
       int res= Countdigit(n);
       
       System.out.print(res);
	}

}

