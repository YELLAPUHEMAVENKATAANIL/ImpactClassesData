package  day2Classes;
import java.util.Scanner;
public class NextDivisibleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = ((num1/num2)+1)*num2;

        System.out.println("The next largest number is:"+result);

    }
    
}
