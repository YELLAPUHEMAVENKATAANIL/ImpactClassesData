package Day8Classes;
import java.util.*;

public class print_1to_n {
	
	private static void print_1toN_helper(int num ,int n) {
		if (num >n) {
			return;
		}
		
		System.out.printf("%d  ",num);
		print_1toN_helper(num+1,n);
	}
	
	public  static void print_1toN_Numbers(int num) {
		if (num == 1) {
			System.out.println(num);
			return ;
		}
		print_1toN_helper(1,num);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		print_1toN_Numbers(num);
		

	}

}
