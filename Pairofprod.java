package Demo;

import java.util.Scanner;

public class Pairofprod {
	public static int secondArray(int[] ar) {
		int max=0;
		int secondlarge=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>max) {
				secondlarge=max;
				max=ar[i];
			}
			else if(ar[i]>secondlarge && ar[i]!=max) {
				secondlarge=ar[i];
			}
			
		}
		return secondlarge*max;
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

