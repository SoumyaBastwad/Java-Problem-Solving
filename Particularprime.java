package Demo;

import java.util.Scanner;

public class Particularprime {
        public static boolean checkprime(int n){
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					return false;
				}
			}
			return true;
		}
		public static void Printprime(int n) {
			int count=0;
			int particularprime=0;
			for (int i=2; count<n;i++) {
				if(checkprime(i)) {
					
					
					particularprime=i;
					count++;
				}
			}
			System.out.print(particularprime);
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n=sc.nextInt();
			Printprime(n);

		}

	}


