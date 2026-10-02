package Demo;

import java.util.Scanner;

public class RevDigit {
     public static int revDigit(int n) {
    	 int rev=0;
    	 while(n!=0) {
    		 int last=n%10;
    		 rev=(rev*10)+last;
    		 n=n/10;
    	 }
    	 return rev;
     }
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		int res =revDigit(n);
		System.out.print(res);

	}

}

