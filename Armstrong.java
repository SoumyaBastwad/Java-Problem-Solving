package Demo;
import java.util.Scanner;
public class Armstrong {
	public static int Countdigit(int n) {
		int count=0;
		while(n>0) {
			n=n/10;
			count++;
		}
		return count;
		
	}
    public static boolean isArmstrong(int n) {
    	int original =n;
    	int rem =0;
    	int count =Countdigit(n);
    	while(n>0) {
    		int last=n%10;
    		rem=rem+(int)Math.pow(last, count);
    		n=n/10;
    	}
    	return original==rem;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean res=isArmstrong(n);
		System.out.print(res);

	}

}

