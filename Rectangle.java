package Demo;
import java.util.Scanner;
public class Rectangle {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the length: ");
	 int length=sc.nextInt();
	 System.out.println("Enter the width: ");
	 int width=sc.nextInt();
	 
	 int area=length+width;
	 int perimeter=2*(length+width);
	 System.out.println("area of rectangle " + area);
	 System.out.println("perimeter of rectangle " + perimeter);

	}

}

