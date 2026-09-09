package Demo;
import java.util.Scanner;
public class Endingwith0 {

	public static void main(String[] args) {
	   Scanner 	sc=new Scanner(System.in);
        int n =sc.nextInt();
        if(n%10==0) {
        	System.out.print("yes");
        }
        else {
        	System.out.print("no");
        }
	}

}

