package Demo;
import java.util.Scanner;
public class LCM1 {
    public static int commonMul(int n1,int n2) {
    	for(int i=n1;i>=1;i--) {
    		if(n1%i==0 && n2%i==0) {
    		 return i;
    		}
    		}
    	return 1;
    }
	public static void main(String[] args) {
	Scanner sc=	new Scanner(System.in);
     int n1=sc.nextInt();
     int n2=sc.nextInt();
     int res=commonMul(n1,n2);
     int lcm=(n1*n2)/res;
     System.out.print(lcm);
	}

}

