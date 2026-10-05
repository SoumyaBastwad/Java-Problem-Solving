package Demo;

import java.util.Scanner;
     
  public class Productofarraymissing {
	 public static int[] productOfArray(int[] ar) {
		 int prod=1;
		 for(int i=0;i<ar.length;i++) {
			 if(ar[i]!=0) {
	     	prod=prod*ar[i];
			 }
	     }
		 int[] res=new int[ar.length];
		 for(int i=0;i<ar.length;i++) {
			 if(ar[i]!=0) {
	       	   res[i]=prod/ar[i];
			 }
	        }
		 return res;
	 }
		 

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
       
        for(int i=0;i<ar.length;i++) {
        	ar[i]=sc.nextInt();
        }
        
        int[] result=productOfArray(ar);
        for(int i=0;i<ar.length;i++) {
            System.out.print(result[i]+" ");
        }
	}

}

