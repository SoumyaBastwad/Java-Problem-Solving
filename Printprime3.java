package Demo;
import java.util.Scanner;
public class Printprime3 {

	  public static boolean checkprime(int n){
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void Printprime(int n1,int n2) {
		for (int i=n1; i<n2;i++) {
			if(checkprime(i)) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		Printprime(n1,n2);

	}

}

