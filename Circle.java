package Demo;
import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the radius of circle:" );
	  float radius = sc.nextFloat();
	  float area = 3.142f*radius*radius;
	  float perimeter=2*3.142f*radius;
	  System.out.println("Area of circle: " +area);
	  System.out.println("perimeter of circle: " +perimeter);

	}

}
