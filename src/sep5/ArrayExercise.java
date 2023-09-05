package sep5;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercise {
    /*
    Skriv ett program där användaren skriver in 5 integers, sparar dem i en array och sen:
a) Skriver ut värdena i en rad.
b) Skapa en metod som returnerar högsta värdet.
c) Skapar en metod som räknar ut summan av värden.
d) Skapa en metod som skriver ut medelvärdet av alla värden med decimaler.
     */
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 numbers! ");

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(numbers));



        boolean running= true;
        while (running){
            System.out.println("Press one for 1 for max number." +
                    "press 2 to collect all elements of array." +
                    "press 3 to pick up the average.");
            int choice = 0;
            choice = scanner.nextInt();

            switch (choice) {
                case 1: maxNumber(numbers);
                    break;
                case 2: sumNumbers(numbers);
                    break;
                case 3: avgNumber(numbers);
                    break;
                case 4: running = false;
                    break;
            }


        }
        scanner.close();

    }

    public static void maxNumber(int [] arr){
        int maxNum = Integer.MIN_VALUE;
        for (int j : arr) {
            if (maxNum < j) {
                maxNum = j;
            }
        }
        System.out.println("The max number is " + maxNum);
    }
    public static void sumNumbers(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("This is the sum of the numbers " + sum);
    }
    public static void avgNumber(int[] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int medIndex = arr.length/2;
        //int avgIndex = Math.ceil(medIndex);
        System.out.println(arr[medIndex]);


    }
}
