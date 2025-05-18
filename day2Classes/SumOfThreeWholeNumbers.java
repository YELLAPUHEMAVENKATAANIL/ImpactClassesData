package day2Classes;

import java.util.Scanner;

public class SumOfThreeWholeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int result = ((number+2) *(number+1) / 2);
        System.out.println("The number of ways sum of 3 whole numbers is:"+result);

    }
}
