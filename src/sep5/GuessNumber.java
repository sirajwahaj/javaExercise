package sep5;
import java.util.Arrays;
import java.util.Scanner;
/*
Skapa en array som innehåller 10 integers med värden mellan 0 och 100.
Du får själv bestämma hur du populerar din array.
Be sedan användaren skriva in ett nummer och kolla om det finns med i din array.
Informera sedan användaren om det fanns med och på vilket/vilka array index
som värdet finns på.
*/

public class GuessNumber {
    public static void main(String[] args) {
        // Array list
        int[] arr = new int[]{23,5,23,67,9,23,4,2,90,33};

        // Ask user to enter guessed number
        System.out.println("Enter your guessed number! ");
        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();

        //Call the function search guessed number
        searchGuessedNumber(arr, guess);
    }
    public static void searchGuessedNumber(int[] arr, int guess){
        boolean result = false;
        int i;
        for (i= 0; i<arr.length; i++){
            if(arr[i] == guess){
                result = true;
                break;
            }
        }
        if(result){
            System.out.println("Guessed number is exist in the list. It is on the index" + i);
        }
        else System.out.println("Wrong guessed!");
    }
}
