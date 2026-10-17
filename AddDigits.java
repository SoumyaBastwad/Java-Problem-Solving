package Demo;
import java.util.Scanner;

public class AddDigits {
          public static int addDigit(int n) {
        	  int sum=0;
        	  while(n!=0) {
        		  int rem=n%10;
        		  sum=sum+rem;
        		  n=n/10;
        	  }
        	  return sum;
          }
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		int res =addDigit(n);
		System.out.print(res);

	}

}
