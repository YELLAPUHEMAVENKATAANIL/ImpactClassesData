package Day9classes;

import java.util.*;
public class Update_Sum_all {
	
	public static void print_arr(int [] arr) {
		
		for(int data: arr) {
			System.out.print(" "+data);
		}
		System.out.println();
	}
	
	public static void sum_all_ele(int [] arr) {
		
		int arr_ind;
		int sum ;
		sum  =0;
		
		for(arr_ind=0;arr_ind<arr.length;arr_ind++) {
			sum += arr[arr_ind];
		}
		
		for(arr_ind =0;arr_ind<arr.length;arr_ind++) {
			arr[arr_ind] = sum - arr[arr_ind];
		}
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		
		int size = sc.nextInt();
		
		int [] arr = new int[size];
		int arr_ind;
		for(arr_ind=0;arr_ind<arr.length;arr_ind++) {
			arr[arr_ind] = rnd.nextInt(10);
//			arr[arr_ind] = sc.nextInt();
		}
		
		print_arr(arr);
		
		sum_all_ele(arr);
		print_arr(arr);
		
		

	}

}
