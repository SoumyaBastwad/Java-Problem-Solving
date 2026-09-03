package Demo;

import java.util.Scanner;

public class MultiplicationOf3 {

	public static void main(String[] args) {
		Scanner	sc= new  Scanner(System.in);
		System.out.print("Enter the number");
		int n=sc.nextInt();
		
		if(n%3==0) {
			System.out.print("Multiplication of 3");
			
		}
		else {
			System.out.print("not Multiplication of 3");
		}


	}

}

