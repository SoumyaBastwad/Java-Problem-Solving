package Demo;
import java.util.Scanner;
public class Unicodeofuppercase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		if(n>=65 && n<=90) {
			System.out.print("yes");
			
		}
		else {
			System.out.print("no");
		}

	}

}

