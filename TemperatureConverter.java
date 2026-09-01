package Demo;
import java.util.Scanner;
public class TemperatureConverter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the temperature in celsius: ");
		int c =sc.nextInt();
		float fahreheit = (c*9.0f/5)+32;
	       System.out.println("in fahreheit: " +fahreheit);
	}

}

