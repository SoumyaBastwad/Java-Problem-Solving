package startproject;
import java.util.Scanner;
public class revercesrting {

	public static void main(String[] args) {
		
         Scanner sc =new Scanner(System.in);
         System.out.print("Enter the string:");
         String str =sc.nextLine();
         String reverse ="";
         for(int i=str.length()-1;i>=0;i--) {
        	 reverse = reverse  + str.charAt(i);
         }
         System.out.println("Reverce string is:" + reverse);
         if (str.equals(reverse)) {
     		System.out.print("palindrome");
     	}else {
     		System.out.print("not palindrome");
     	}
	}
	
}
