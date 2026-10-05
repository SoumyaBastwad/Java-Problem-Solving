package Demo;

import java.util.Scanner;

public class Kvalueindex {
	public static int KvalueIndex(int[] ar,int k) {
		for(int i=0;i<ar.length;i++) {
			
			if(ar[i]==k) {
				return i;
			}
	    }
		   return -1;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
       
        for(int i=0;i<ar.length;i++) {
        	ar[i]=sc.nextInt();
        }
        System.out.print("Enter K value:");
        int k=sc.nextInt();
        
        int res = KvalueIndex(ar,k);
        System.out.print(res);
	

	}

}

