package Day9classes;

import java.util.Scanner;
import java.util.Random;

public class largest_arr {
	
	public static void print(int [] arr) {
		
		for(int data:arr) {
			System.out.printf("%d ", data);
		}
		System.out.println();
	}
	
	public static void largest_ele_arr(int []arr) {
		
		int largest = Integer.MIN_VALUE;
		int arr_ind;
		
		for(arr_ind =0;arr_ind<arr.length;arr_ind++) {
			
			if(arr[arr_ind] > largest) {
				largest = arr[arr_ind];
			}
			
		}
		System.out.println(largest);
		
	}
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		
		int size = sc.nextInt();
		int [] arr = new int[size];
		int arr_ind;
		
		for(arr_ind=0;arr_ind <arr.length;arr_ind++) {
			arr[arr_ind] = rnd.nextInt(5);
			
		}
		
		print(arr);
		largest_ele_arr(arr);
		
		 
		}

}
