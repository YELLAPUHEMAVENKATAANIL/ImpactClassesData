package Day5Classes;

import java.util.*;
public class Problem1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		long number = sc.nextLong();
		int sod = 0;
		int digit_s =0;
		
 		while(number !=0) {
 			digit_s = (int) (number%10);
 			sod +=digit_s;
 			
 			number /=10;
 			
		}
			System.out.println(sod);	
		
	}

}
