package Demo;

import java.util.Scanner;

public class Productofarray {
	public static int productOfArray(int[] ar) {
		  int prod=1;
		    for(int i=0;i<ar.length;i++ ) {
		    	prod=prod*ar[i];
		    	  
		    	
		     }
		    return prod;
	}

	public static void main(String[] args) {
		
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter the size of array:");
			int n=sc.nextInt();
		    int[] ar=new int[n];
		    System.out.println("Enter the elements of array:");
		    for(int i=0;i<ar.length;i++) {
		    	   ar[i]=sc.nextInt();
		     }
		    System.out.println("the product of array:");
		    int res=productOfArray(ar);
		    System.out.print(res);
	}

}

