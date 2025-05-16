package day1classes;

import java.util.*;
public class Two_Power_validalation {
	
	public static boolean  two_power_valid(int num) {
		
		return num > 0 && (num &(num-1)) ==0; 
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		boolean result = two_power_valid(number);
		
		if(result) {
			System.out.println(number +" is Two Power.");
		}
		else {
			System.out.println(number +" is not Two Power.");
		}
		
	}

}
