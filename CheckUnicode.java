package Demo;
import java.util.Scanner;
public class CheckUnicode {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		if(n>=65 && n<=90) {
			System.out.print("UpperCase");
		}else if(n>=97 && n<=122) {
			System.out.print("LowerCase");
		}else if(n>=48 && n<=57) {
			System.out.print("Numeric");
	
