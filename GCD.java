package Demo;
import java.util.Scanner;
public class GCD {
     public static void commonFactor(int n1,int n2) {
    	 for (int i=n1;i>=1;i--) {
    		 if(n1%i==0 && n2%i==0) {
    			 System.out.println(i);
    		     break;
    		 }
    	 }
     }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		commonFactor(n1,n2);

	}

}

