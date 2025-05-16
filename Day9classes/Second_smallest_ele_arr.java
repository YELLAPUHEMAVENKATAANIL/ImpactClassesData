package Day9classes;
import java.util.Scanner;
import java.util.Random;

public class Second_smallest_ele_arr {
	
	public static void print(int[] arr)
	{
		for(int data: arr) {
			System.out.printf("%d  ",data);
		}
		System.out.println();
	}
	
	public static void second_smallest_arr(int [] arr)
	{
		int smallest  = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		int arr_ind;
		
		
		for(arr_ind =0;arr_ind<arr.length;arr_ind++) {
			
			if(arr[arr_ind] <smallest)
			{
				secondSmallest = smallest;
				smallest = arr[arr_ind];
				
			}
			
			else if(arr[arr_ind] <secondSmallest && smallest != secondSmallest) 
			{
				secondSmallest = arr[arr_ind];
			}
			
		}
		System.out.println("The smallest ele in arr:"+smallest);
		System.out.println("The Secondsmallest ele in arr:" +secondSmallest);
		
	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		int size = sc.nextInt();
		
		int [] arr = new int[size];
		int arr_ind;
		
		for(arr_ind=0;arr_ind<arr.length;arr_ind++)
		{
//			arr[arr_ind] = rnd.nextInt(10);
			
			arr[arr_ind] = sc.nextInt();
		}
		print(arr);
		second_smallest_arr(arr);
		
 	}

}
