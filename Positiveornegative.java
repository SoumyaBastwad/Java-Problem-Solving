package startproject;
import java.util.Scanner;
public class Positiveornegative {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number");
		int n=sc.nextInt();
		if (n>0) {
			System.out.print("The given number is positive number");
		}else {
			System.out.print("The given number is negative number");
		}
	}

}
		
