package Demo;

import java.util.Scanner;

public class Minarray {

	public static int minOfArray(int[] ar) {
		  int min=ar[0];
		    for(int i=0;i<ar.length;i++ ) {
		    	if(ar[i]<min) {
		    	 min=ar[i];
		    	}
		     }
		    return min;
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
		    System.out.println("the minimum element of array:");
		    int res=minOfArray(ar);
		    System.out.print(res);

	}

}

