package basic5;

import java.util.Scanner;

public class factorial {
	
	public static int fact(int num) {
		if(num==1) {
			return 1;
		}else {
			return num*fact(num-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enetr a number: ");
		int num=scan.nextInt();
		
		System.out.println("Fatorial of "+num+" is "+fact(num));
	}

}
