package Demo;

import java.util.Scanner;

public class GCD3 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a =sc.nextInt();
		int b =sc.nextInt();
		
		while(a!=0 && b!=0) {
			if(a>b) {
				a=a%b;
			}
			else {
				b=b%a;
			}
			
		}
		System.out.print(b==0?a:b);

	}

}

