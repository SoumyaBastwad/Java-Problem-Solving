package Demo;
import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the height: ");
		int height=sc.nextInt();
		System.out.println("Enter the base: ");
		int base=sc.nextInt();
		System.out.println("Enter the side: ");
		int side=sc.nextInt();
	    float area=0.5f*(base)*(height);
        float perimeter=side+base+side;
        System.out.println("area of triangle :" +area);
        System.out.println("perimeter of triangle :" +perimeter);
	}

}

