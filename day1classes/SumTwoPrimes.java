package day1classes;
import java.util.*;
public class SumTwoPrimes {
	
	public static boolean isPrime(int num )
	{
		if(num <=1) {
			return false;
		}
		else if (num == 2) {
			return true;
		}
		else if (num%2 == 0) {
			return false;
		}
		for( int j =2;j<Math.sqrt(num);j++) {
			if(num %j== 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		boolean found = false;
		
		
		for(int i =2;i<num/2;i++) 
			
		{
			int val = num -i;
			if(isPrime(i) && isPrime(val)) {
				
				System.out.println("Yes");
				System.out.println(num + "=" + i + "+"+val);
				
				found = true;
				break;
			}
			
		}
		if(!found)
		{
			System.out.println("No");
		}
	}

} 

