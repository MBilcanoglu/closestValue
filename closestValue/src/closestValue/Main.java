package closestValue;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] numbers={15,12,788,1,-1,-778,2,0};
		int value,min=0,max=0;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Sayı giriniz: ");
		value=scan.nextInt();
		
		Arrays.sort(numbers);
		min=numbers[0];
		max=numbers[numbers.length-1];
		
		for(int number:numbers) {
			if (number < max && number > value) {
                max = number;
            }
            if (number > min && number < value) {
                min = number;
            }
		}
		
		System.out.println("Girilen sayıdan küçük en yakın sayı :"+min);
		System.out.println("Girilen sayıdan büyük en yakın sayı :"+max);
	}

}
