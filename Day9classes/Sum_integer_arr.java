package Day9classes;

import java.util.*;

public class Sum_integer_arr {
	
	public static void print_sum(int arr[]) {
		int sum ;
		sum =0;
		int ind_arr;
		for(ind_arr=0; ind_arr <arr.length;ind_arr++) {
			sum += arr[ind_arr];
		}
		System.out.println("The sum of two Numbers is :"+sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		int [] arr = new int[size];
		int arr_ind;
		for(arr_ind=0;arr_ind<arr.length;arr_ind++) {
			arr[arr_ind] = sc.nextInt();
		}
		
		print_sum(arr);

	}

}
