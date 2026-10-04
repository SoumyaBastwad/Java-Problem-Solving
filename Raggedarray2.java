package Demo;
import java.util.Scanner;
public class Raggedarray2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("welcome to the Datacemter");
		int[][][] ar=new int[2][][];
		ar[0]=new int[3][];
		ar[1]=new int[2][];
		ar[0][0]=new int[2];
		ar[0][1]=new int[3];
		ar[0][2]=new int[3];
		ar[1][0]=new int[2];
		ar[1][1]=new int[3];
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				for(int k=0;k<ar[i][j].length;k++) {
				System.out.println("Enter the school "+ (i+1)+" the class of "+ (j+1) +"the student of " +(k+1)+ " age: ");
				ar[i][j][k]=sc.nextInt();
				}
			}
		}
		System.out.println(" The student ages:");
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				for(int k=0;k<ar[i][j].length;k++) {
				System.out.print(ar[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}

