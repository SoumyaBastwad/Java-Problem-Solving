package Demo;
import java.util.Scanner;
public class Raggedarray {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("welcome to the Datacemter");
		int[][] ar=new int[2][];
		ar[0]=new int[3];
		ar[1]=new int[5];
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				System.out.println("Enter the school "+ (i+1)+" the student of "+ (j+1) +" age:");
				ar[i][j]=sc.nextInt();
			}
		}
		System.out.println(" The student ages:");
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				System.out.print(ar[i][j] + " ");
				
			}
			System.out.println();
		}
	}

}

