package task16;

/**
 * Created by User on 10.12.2017.
 */
import java.util.Random;

public class Task16 {
    public static void main(String[] args) {
        int[] array = new int[4];
        Random rand = new Random();

        for(int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(10);
            System.out.println(array[i] + " ");
        }

        System.out.println("Swap array: ");

        int swap;
        for(int i = 0; i < array.length / 2; i++){
            swap = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = swap;
        }

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i] + " ");
        }
    }
}
