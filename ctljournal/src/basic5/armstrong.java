package basic5;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		int num1,i=0,num2,count, rem;
		
		System.out.println("Enter a number: ");
		num1=scan.nextInt();
		num2=num1;
		
		for(count=0;num2>0;num2/=10) {
			count++;
		}
		num2=num1;
		while(num2>0) {
			rem=num2%10;
			i+=(Math.pow(rem,count));
			num2/=10;
		}
		if(i==num1) {
			System.out.println(num1+" is a armstrong number.");
		} else {
			System.out.println(num1+" is not a armstrong number.");
		}
		
	}

}
