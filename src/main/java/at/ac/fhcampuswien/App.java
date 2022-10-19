package at.ac.fhcampuswien;


import java.util.Random;
import java.util.Scanner;

public class App {
    public static void oneMonthCalendar(int numberOfDays, int firstDay){

    }

    public static long[] lcg(long seed){
        final long m = (long) Math.pow(2, 31);
        final int c = 12345, a = 1103515245;

        long[] results = new long[10];

        results[0] = (a * seed + c) % m;

        for(int i = 1; i < results.length; i++){
            results[i] = (a * results[i - 1] + c) % m;
        }

        return results;
    }

    public static void guessingGame(int numberToGuess){
        System.out.print("Guess number 1: ");
        Scanner scan = new Scanner(System.in);
        //numberToGuess = randomNumberBetweenOneAndHundred();
        int guessedNumber = scan.nextInt(), count = 1;
        while(guessedNumber != numberToGuess && count < 10){
            if (guessedNumber > numberToGuess){
                System.out.println("The number AI picked is lower than your guess.");
            } else {
                System.out.println("The number AI picked is higher than your guess.");
            }
            count++;
            System.out.print("Guess number " + count + ": ");
            guessedNumber = scan.nextInt();

        }
        if (count == 10){
            System.out.println("You lost! Have you ever heard of divide & conquer?");
        }else {
            System.out.println("You won wisenheimer!");
        }
    }

    public static int randomNumberBetweenOneAndHundred(){
        int low = 1, high = 100, random;
            Random rand = new Random();
            random =  rand.nextInt(high) + low;
            //System.out.println(random);

        return random;
    }

    public static boolean swapArrays(int[] array1, int[] array2){

        return false;
    }

    public static String camelCase(String input){
        char[] in = input.toCharArray();
        char cha;

        StringBuilder out = new StringBuilder();

        if (in[0] < 65 || in[0] > 90) {
            if (in[0] >= 96 && in[0] <= 122) {
                cha = (char) ((int) in[0] - 32); // characters between lower case and uppercase 32
                out.append(cha);
            }
        }

        for(int i = 1; i < in.length; i++){
            if(in[i] >= 65 && in[i] <= 90){
                if(in[i-1] != ' '){
                    cha = (char) ((int) in[i] + 32);
                    out.append(cha);
                }else{
                    out.append(in[i]);
                }
            } else if(in[i] >= 97 && in[i] <= 122){
                if(in[i-1] == ' '){
                    cha = (char) ((int) in[i] - 32);
                    out.append(cha);
                }else  {
                    out.append(in[i]);
                }
            }
        }

        input = out.toString();
        return input;
    }

    // Implement all methods as public static
    public static int checkDigit(int[] code){
        int sum = 0, mod, check;
        for(int place = 0; place < code.length; place++){
            sum += code[place] * (place + 2);
        }
        mod = sum % 11;
        check = 11 - mod;
        if(check == 11){
            return 5;
        } else if(check == 10){
            return 0;
        }
        return check;
    }
    public static void main(String[] args) {
        // test your method implementations here
        // make method calls
        // print their results
        // etc.
        int numberToGuess = randomNumberBetweenOneAndHundred();
        //guessingGame(numberToGuess);
        int[] digits = new int[1];
        checkDigit(digits);
        Scanner scan = new Scanner(System.in);
        System.out.print(": ");
        String input = scan.nextLine();
        camelCase(input);
    }




}