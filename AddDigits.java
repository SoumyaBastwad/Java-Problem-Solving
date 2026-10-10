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
	

