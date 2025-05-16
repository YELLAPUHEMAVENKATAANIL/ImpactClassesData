package Day8Classes;
import java.util.*;
public class Number_of_digits_recusive {
	
	private static int number_of_digits_helper(int num) {
		
		if (num == 0) return 0;
		
		return 1 + number_of_digits_helper(num/10);
		
		
	}
	
	public static int number_of_digits(int num) {
		
		if (num <10 && num >0) return 1;
		if (num >-10 && num<-1) return 1;
		
		return number_of_digits_helper(num);
		
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int res =number_of_digits(num);
		System.out.println(res);

	}

}
