

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        Date todayDate = new Date();
        System.out.println(todayDate);
        String name = "Salman Khan";
        String lowname = name.replace("Khan","Bhaijaan");
        System.out.println(lowname);
        int []numbers = new int[5];
        numbers[0] = 90;
        numbers[4] = 99;
        System.out.println(Arrays.toString(numbers));
        int [][] twoDArray = {{3,4,5},{6,7,8}};
        System.out.println(Arrays.deepToString(twoDArray));
        String result = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name:");
        String yourname = scanner.nextLine().trim();
        System.out.print("Age:");
        int yourage = scanner.nextByte();
        System.out.println("You are "+ yourname+" you are "+yourage+" old !");


        // Logical Operators

        boolean hasHighIncome = true;
        boolean hasHighCredit = true;
        boolean hasCriminalrecord = true;
        boolean isEligible = (hasHighIncome || hasHighCredit) && (!hasCriminalrecord);
        System.out.println(isEligible);


        //if condition in simple way , for storing boolen value

        int money = 20000;
        boolean rich = money > 10000;
        System.out.println(rich);

        //ternary operator in java

        String flightticket = rich ? "First class ticket":"Economy Ticket";
        System.out.println(flightticket);

        //Switch case in Java

        String position = "admin";

        switch (position) {
            case "moderator": {
                System.out.println("You're a Moderator");
                break;
            }
            case "admin": {
                System.out.println("You're an admin");
                break;
            }
            default: {
                System.out.println("You're a Guest");
            }
        }

        //Fizzbuzz

        System.out.print("Enter Number: ");
        int number = scanner.nextByte();

        if(number%5 == 0 && number%3 ==0){
            System.out.println("FizzBuzz");
        }else if(number%5 == 0){
            System.out.println("Fizz");
        }else if(number % 3 == 0){
            System.out.println("Buzz");
        }else{
            System.out.println("Not belong to anyone");
        }

        //by using Ternary Operators

        String resultfizzbuzz = (number % 5 == 0 && number % 3 == 0)? "FizzBuzz": (number % 5 ==0 )? "Fizz":(number % 3 == 0)?"Buzz":"Not Belong to anyone";
        System.out.println(resultfizzbuzz);

        //while Loops

        String input = "";
        while(true){
            System.out.println("Enter Input: ");
            input = scanner.nextLine().toLowerCase();
            if(input.equals("quit"));
            System.out.println(input);
        }

        //foreach loop example


    }
}
