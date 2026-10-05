package Demo;
import java.util.Scanner;
public class Occuranceofk {
	public static int occuranceOfK(int[] ar,int k) {
		int count=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==k) {
				count++;
			}
			
		}
		return count;
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
        
        int res = occuranceOfK(ar,k);
        System.out.print(res);
	

	}

}

