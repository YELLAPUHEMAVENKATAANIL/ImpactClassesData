package day2Classes;
import java.util.*;

public class ContinuogousNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number:");
		
		int num = sc.nextInt();
		
		long begin = System.currentTimeMillis();
		
		if((num-1)%2 !=0) {
			System.out.println("Invalid input");
			
		}
		else {
			int x = (num-1)/2;
			System.out.println(x +" "+ (x+1));
		}
		
		long stop = System.currentTimeMillis();
		
		double duration = (stop-begin)/1000.0;
		System.out.printf("duration = %.3f",duration);
		

	}

}
