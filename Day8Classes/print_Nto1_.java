package Day8Classes;
import java.util.*;
public class print_Nto1_ {
	
	private static void print_Nto1_helper(int num) {
		
		if (num >0) {
			System.out.printf("%d  ",num);
			print_Nto1_helper(num-1);
		}
		
	}

	public static void print_Nto1_numbers(int num) {
		if (num ==1) {
			System.out.println(num);
			return;
		}
		print_Nto1_helper(num);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		print_Nto1_numbers(num);
		
	}

}
