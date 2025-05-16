package Day9classes;

import java.util.*;

public class Average_3decimal {
	
	public static void print_Average(int arr[]) {
		int sum ;
		sum =0;
		int ind_arr;
		double average;
		
		for(ind_arr=0; ind_arr <arr.length;ind_arr++) {
			sum += arr[ind_arr];
		}
		
		average = (double) sum / arr.length;
		
		System.out.println("The average is:"+average);
		System.out.printf("The average is:%.3f",average);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		int [] arr = new int[size];
		int arr_ind;
		for(arr_ind=0;arr_ind<arr.length;arr_ind++) {
			arr[arr_ind] = sc.nextInt();
		}
		
		print_Average(arr);

	}

}
