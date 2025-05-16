package day2Classes;
import java.util.*;
public class ConsecutiveNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		
		int num = sc.nextInt();
		long begin = System.currentTimeMillis();
		
		if (num %3 == 0) {
			int x = (num-3)/3;
			System.out.println(x +" " +(x+1) +" "+(x+2));
		}
		else {
			System.out.println("Enter a valid number..");
		}
		
		long end = System.currentTimeMillis();
		double duration = (end - begin)/1000.0;
		
		System.out.printf("Duration : %.3f",duration);

	}

}
