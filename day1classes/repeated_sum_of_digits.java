package day1classes;

import java.util.*;

public class repeated_sum_of_digits {
	
	public static void repeted_sum_of_digit(int number) {
		
		int rem;
	while(number >=10) {
		int sum =0;
		while(number >0) {
			rem = number%10;
			sum += rem;
			number /=10;
			
		}
		
		number= sum;
	}
		System.out.println(number);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		repeted_sum_of_digit(number);

	}

}
