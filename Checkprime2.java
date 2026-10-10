package Demo;
import java.util.Scanner;
public class Checkprime2 {
     public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
		        int n=sc.nextInt();
		        int count=0;
		        for (int i=2;i<=n/2;i++) {
		        	if(n%i==0) {
		        		count++;
		        	}
		        }
		        if(count==0) {
		        System.out.print("prime");
		        }
		        else {
		        	System.out.print("not prime");
		        }
			}

}

