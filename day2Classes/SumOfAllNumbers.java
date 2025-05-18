package day2Classes;
import java.util.Scanner;
class SumOfAllNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int start;
        int sum =0;

        for(start =1;start<=number;start++){
            if (start %3 ==0 || start %5 ==0){
                sum += start;
            }
        }
        System.out.println("The sum of three numbers is:"+sum);
    }
    
}