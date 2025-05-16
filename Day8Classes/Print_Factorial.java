package Day8Classes;
import java.util.*;

public class Print_Factorial {
	
	
	private static int print_factorial_helper(int num) {
		
		if (num == 0 || num == 1) {
			return num;
		}
		return num * print_factorial_helper(num-1);
		
	}
	
	public static void print_factorial(int num) {
		
		if ( num == 0) {
			System.out.println(1);
			return ;
		}
		
		else if (num == 1) {
			System.out.println(num);
			return ;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		print_factorial(num);
		
		
	}

}
