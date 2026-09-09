package Demo;
import java.util.Scanner;

public class Check2digitnumber {

	public static void main(String[] args) {
		 Scanner 	sc=new Scanner(System.in);
	        int n =sc.nextInt();
	        if(9 <n && n>100) {
	        	System.out.print("yes");
	        }
	        else {
	        	System.out.print("no");
	        }

	}

}

