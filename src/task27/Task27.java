package task27;

/**
 * Created by User on 18.12.2017.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by User on 18.12.2017.
 */
public class Task27 {

    static List<Integer> arrayMarks = new ArrayList<Integer>();

    public static void main(String[] args) {
        int size = 10;

        getRandMarks(size);
        deleteRepeatElement();

        System.out.println(arrayMarks);
    }

    private static void getRandMarks(int size){

        Random rand = new Random();

        for(int i = 0; i< size ; i++){
            arrayMarks.add(rand.nextInt(10));
        }

    }

    private static void deleteRepeatElement(){
        for(int a = 0; a < arrayMarks.size(); a++){
            for(int b = a + 1; b < arrayMarks.size(); b++){
                if(arrayMarks.get(a) == arrayMarks.get(b)){
                    arrayMarks.remove(b);
                    b--;
                }
            }
        }
    }

}
