package Day9classes;
import java.util.Scanner;
import java.util.Random;

public class Rotate_arr {
	
	public static void print(int [] arr) {
		
		for(int data: arr) {
			System.out.printf("%d  ",data);
		}
		
		System.out.println();
		
	}
	
	public static void rotate_arr(int [] arr) {
		
		int temp ;
		int arr_ind;
		
		temp = arr[arr.length-1];
		
		for(arr_ind = arr.length-2;arr_ind>=0;arr_ind--) {
			
			arr[arr_ind+1] = arr[arr_ind];
		}
		arr[0] = temp;
	}
	
	
	
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd  = new Random();
		
		int size = sc.nextInt();
		int [] arr = new int[size];
		int arr_ind;
		
		for(arr_ind =0;arr_ind<arr.length;arr_ind++) {
			arr[arr_ind] = rnd.nextInt(20);
		}
		
		print(arr);
		
		rotate_arr(arr);
		print(arr);
	}

}
