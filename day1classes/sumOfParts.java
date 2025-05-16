package day1classes;

import java.util.*;
public class sumOfParts {

	
	public static int MaximumProduct(int num) {
		int product = 1;
		if(num ==1) {
			return 1;
		}
		else if (num == 2) {
			return 2;
		}
		else if (num ==3) {
			return 3;
		}
		
		while(num >4) {
			product *=3;
			num -=3; 
		}
		
		product *=num;
		
		return product;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int result = MaximumProduct(num);
		
		System.out.println("Maximum Product of split number are:"+result);
		
	}

}
