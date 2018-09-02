import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Choose a number: ");
        int number = scan.nextInt();
        int[] array = readIntegers(number);
        System.out.println("Minimum value: " + findMin(array));

    }
    public static int[] readIntegers(int count){
        System.out.println("Enter " + count + " numbers");
        int[] returnArray = new int[count];
        for (int i=0; i<returnArray.length; i++){
            returnArray[i] = scan.nextInt();
        }

        return returnArray;
    }

    public static int findMin(int[] array){
        int minimum = array[0];
        for (int i=0; i<array.length; i++){
            if (minimum > array[i]){
                minimum = array[i];
            }
        }
        return minimum;
    }
}
