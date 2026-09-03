package Demo;

import java.util.Scanner;

public class Divisibleby2and3and7 {

	public static void main(String[] args) {
		Scanner	sc= new  Scanner(System.in);
		System.out.print("Enter the number");
		int n=sc.nextInt();
		
		if(n%2==0 && n%3==0 && n%7==0) {
			System.out.print("yes");
			
		}
		else {
			System.out.print("no");
		}

	}

}

