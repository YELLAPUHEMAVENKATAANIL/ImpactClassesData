package Day3Classes;

import java.util.Scanner;

public class date {

    public static boolean isLeapYear(int year){
        if((year%4 ==0 && year %100 !=0) || year%400 ==0){
            return true;
        }
        return false;
    }


    public static boolean validate_Date(int date,int month,int year){

        int maxDays ;
        if(year <1){
            return false;
        }

        if (month <0 && month >12){
            return false;
        }

        if (month == 2){
            if(isLeapYear(year)){
                maxDays = 29;
            }
            else{
                maxDays = 28;
            }
        }
        else if(month == 4 || month == 6|| month == 9|| month == 11 ){
            maxDays = 30;
        }
        else {
            maxDays = 31;
        }

        if (date <1 || date > maxDays){
            return false;
        }
        return true;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int date = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();


        boolean result =validate_Date(date,month,year);

        if(result){
            System.out.printf("The Entered date is %d - %d - %d  is valid",date,month,year);
        }
        else{
            System.out.printf("The Entered date is %d - %d - %d  is Notvalid",date,month,year);
        }

    }
    
}
