package basic5;

public class sumEvenNumWithoutIF {

	public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int number = 2; 

        while (count < 10) {
            sum += number;
            number += 2; 
            count++;
        }

        System.out.println("The sum of the first 10 even numbers is: " + sum);
    }

}
