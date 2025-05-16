package Day9classes;

import java.util.*;
public class update_Sum_right {
	
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
		
		for(arr_ind=arr.length-1;arr_ind >=0;arr_ind--) {
			sum += arr[arr_ind];
			arr[arr_ind] = sum - arr[arr_ind];
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		
		int size = sc.nextInt();
//		int arr[] = {6,9,1,2,4,7};
		
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
