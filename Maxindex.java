package Demo;
import java.util.Scanner;
public class Maxindex {
	public static int maxOfIndex(int[] ar) {
		int max=ar[0];
		int index=0;
		for(int i=0;i<ar.length;i++) {
			if(max<ar[i]) {
				max=ar[i];
				index=i;
			}	
		}
		return index;	
	
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<ar.length;i++) {
        	ar[i]=sc.nextInt();
        }
        int res = maxOfIndex(ar);
        System.out.print(res);
	}

}

