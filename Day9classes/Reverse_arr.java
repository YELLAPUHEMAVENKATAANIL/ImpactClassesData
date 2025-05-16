package Day9classes;

import java.util.Scanner;
import java.util.Random;


public class Reverse_arr {

	public static void print(int [] arr) {
		
		for(int data: arr) {
			System.out.printf("%d  " ,data);
		}
		System.out.println();
	}
	
	private static void swap(int [] arr, int start, int end) {
		
//		int temp;
//		
//		temp = arr[start];
//		
//		arr[start] = arr[end];
//		arr[end] = arr[start];
//		
		
		arr[start] = arr[start] + arr[end];
		arr[end] = arr[start] - arr[end];
		arr[start] = arr[start ] - arr[end];
		
		
	}
	
	

	public static void  reverse_arr(int [] arr) {
		
		int start;
		int end;
		int arr_ind;
		
		for(start =0, end = arr.length-1;start <end;start++,end-- ) {
			swap(arr,start,end);
			
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		
		int size = sc.nextInt();
		
		int [] arr = new int [size];
		
		int arr_ind;
		
		for(arr_ind =0;arr_ind<arr.length;arr_ind++) {
			arr[arr_ind] = rnd.nextInt(20);
		}
		
//		int [] arr = {10,20,30,40,50};
		
		print(arr);
		reverse_arr(arr);
		print(arr);

	}

	

}
