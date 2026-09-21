package Demo;
import java.util.Scanner;
public class Array2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int[][] age=new int[2][5];
		for(int i=0;i<2;i++) {
			for(int j=0;j<5;j++) {
			System.out.println("Enter the studen age:class"+ (i+1)+"student"+(j+1) );
			age[i][j]=sc.nextInt();
			}
		}
		System.out.println("The ages are:");
		for(int i=0;i<2;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(age[i][j]+ " ");
			
			}
			System.out.println();
		}
   }
}

