package Demo;
import java.util.Scanner;
public class Array1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int[] age=new int[5];
		for(int i=0;i<5;i++) {
			System.out.println("Enter the studen age:"+ (i+1) );
			age[i]=sc.nextInt();
			}
		System.out.println("Enter the studen ages are:" );
		for(int i=0;i<5;i++) {
			System.out.print(age[i] + " ");
		}
	}
}

