package Day9classes;
import java.util.Scanner;
import java.util.Random;

public class Second_larget_ele_arr {
	
	public static void print(int[]arr) {
		
		for(int data:arr) {
			System.out.printf("%d  ",data);
		}
		System.out.println();
	}
	

	public static void Second_largest_ele(int [] arr) {
		int largest = Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;
		int arr_ind;
		
		for(arr_ind=0;arr_ind<arr.length;arr_ind++) {
			
			if(arr[arr_ind] >largest) {
				secondlargest = largest;
				largest = arr[arr_ind];
			}
			else if (arr[arr_ind] > secondlargest && largest !=secondlargest) {
				secondlargest = arr[arr_ind];
			}
		}
		System.out.println("largest element in arr:"+largest);
		System.out.println("Second largest element in arr: "+secondlargest);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		
//		int [] arr = {10,20,30,40,50};       defined array
		
		int size = sc.nextInt();
		int [] arr = new int[size];
		int arr_ind;
		
		for(arr_ind =0;arr_ind<arr.length;arr_ind++) {
			arr[arr_ind] = rnd.nextInt(10);       // random array elements generated
//			arr[arr_ind] = sc.nextInt();      user enter array element          
		}
		
		print(arr);
		Second_largest_ele(arr);
		
	}

}
