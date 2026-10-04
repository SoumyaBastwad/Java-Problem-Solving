package Demo;

import java.util.Scanner;

public class Largestofarray {

		public static int largeOfArray(int[] ar) {
			  int max=0;
			    for(int i=0;i<ar.length;i++ ) {
			    	if(max<ar[i]) {
			    	 max=ar[i];
			    	}
			     }
			    return max;
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
			    System.out.println("the maximum element of array:");
			    int res=largeOfArray(ar);
			    System.out.print(res);
		}
	}



