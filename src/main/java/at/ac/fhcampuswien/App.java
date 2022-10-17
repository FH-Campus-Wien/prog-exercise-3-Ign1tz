package at.ac.fhcampuswien;


import java.util.Random;
import java.util.Scanner;

public class App {
    public static void oneMonthCalendar(int numberOfDays, int firstDay){

    }

    public static long[] lcg(long seed){
        final long m = (long) Math.pow(2, 31);
        final int c = 12345;
        final int a = 1103515245;

        long[] results = new long[10];

        results[0] = (a * seed + c) % m;

        for(int i = 1; i < results.length; i++){
            results[i] = (a * results[i - 1] + c) % m;
        }

        return results;
    }

    public static void guessingGame(int numberToGuess){

    }

    public static  int randomNumberBetweenOneAndHundred(){
        int low = 1, high = 100, random = 1;
        for (int i = 1; i <= 10; i++){
            Random rand = new Random();
            random =  rand.nextInt(high) + low;
            //System.out.println(random);
        }

        return random;
    }

    public static boolean swapArrays(int[] array1, int[] array2){

        return false;
    }

    public static String camelCase(String input){

        return input;
    }

    // Implement all methods as public static
    public static int[] checkDigit(int[] digits){
        digits = new int[1];
        //System.out.print("a: ");
        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt(), place = 0, weigth, product, sum = 0, check;
        while (input >= 0 && input < 10){
            int[] temp_array = new int[digits.length+1];
            temp_array[place] = input;
            digits = temp_array;
            place++;
            //System.out.print("a: ");
            input = scan.nextInt();
        }
        while (place >= 0){
            weigth = place + 2;
            product = weigth * digits[place];
            sum = product + sum;
            place--;
        }
        //System.out.println(sum);
        check = 11- (sum%11);
        if(check == 10){
            check = 0;
        } else if (check == 11) {
            check = 5;
        }
        //System.out.println(check);
        return digits;
    }
    public static void main(String[] args) {
        // test your method implementations here
        // make method calls
        // print their results
        // etc.
        //int[] test = {1,2,3,4,5,6,7,8,9};
        //checkDigit(test);
        //lcg(long [seed]);
    }


}