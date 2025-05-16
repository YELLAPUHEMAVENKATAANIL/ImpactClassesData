package day1classes;
import java.util.*;
public class WholeNumberSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int result =( ((num +2)* (num+1)) / 2);
		System.out.println("sum 3 Whole Numbers is :"+result);
		}

}
