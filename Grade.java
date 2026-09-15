package Demo;
import java.util.Scanner;
public class Grade {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		if(n>=91 && n<=100) {
			System.out.print("A+");
		}else if(n>=81 && n<=90) {
			System.out.print("A");
		}else if(n>= 71&& n<=80) {
			System.out.print("B+");
		}else if(n>=61 && n<=70) {
			System.out.print("B");
		}else if(n>=51 && n<=60) {
			System.out.print("C+");
		}else if(n>=35 && n<=50) {
			System.out.print("C");
		}else if(n>=0 && n<=34) {
			System.out.print("Fail");
		}else {
			System.out.print("Invalid");
		}
	}

}

