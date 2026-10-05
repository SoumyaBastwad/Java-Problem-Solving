package Demo;

import java.util.Scanner;

public class Secondlargestarray {
	public static int secondArray(int[] ar) {
		int max=0;
		int large=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>max) {
				large=max;
				max=ar[i];
			}
			else if(ar[i]>large  && ar[i]!=max ) {
				large=ar[i];
			}
			
		}
		return large;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
       
        for(int i=0;i<ar.length;i++) {
        	ar[i]=sc.nextInt();
        }
       int res= secondArray(ar);
       System.out.print(res);
	}

}

