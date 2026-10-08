package Demo;
import java.util.Scanner;
public class Armstrong {
	public static int Countdigit(int n) {
		int count=0;
		while(n>0) {
			n=n/10;
			count++;
		}
		return count;
		
	}
    public static boolean isArmstrong(int n) {
    	int original =n;
    	int rem =0;
    	

