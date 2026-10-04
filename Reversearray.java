package Demo;

import java.util.Scanner;

public class Reversearray {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
	    int[] ar=new int[n];
	    System.out.println("Enter the elements of array:");
	    for(int i=0;i<ar.length;i++) {
	    	   ar[i]=sc.nextInt();
	     }
	    System.out.println("reverse of the array elements:");
	    for(int i=ar.length-1;i>=0;i--) {
	    	
	    	  System.out.print(ar[i]+ " ");
	    	
	     }

	}

}

