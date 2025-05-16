package Day9classes;
import java.util.Scanner;
import java.util.Random;

public class smallest_ele_arr {
	
	public static void print(int [] arr) {
		for(int data : arr) {
			System.out.printf("%d  ",data);
		}
		System.out.println();
	}
	
	public static void Smallest_ele_arr(int [] arr) {
		int smallest = Integer.MAX_VALUE;
		int arr_ind;
		
		for(arr_ind=0;arr_ind<arr.length;arr_ind++) {
			if(arr[arr_ind] < smallest) {
				smallest = arr[arr_ind];
			}
		}
		System.out.println("The smallest element in arr:"+smallest);
		
	}
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		
		int size = sc.nextInt();
		int [] arr = new int[size];
		int arr_ind;
		
		for(arr_ind=0;arr_ind<arr.length;arr_ind++) {
//			arr[arr_ind] = rnd.nextInt(20);
			arr[arr_ind] = sc.nextInt();
		}
		
		print(arr);
		Smallest_ele_arr(arr);
		
		
	}

}
