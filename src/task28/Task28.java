package task28;

/**
 * Created by User on 18.12.2017.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class Task28 {

    static List<Integer> arrayMarks = new ArrayList<Integer>();

    public static void main(String[] args) {
        int size = 10;

        getRandMarks(size);
        ListIterator<Integer> array = arrayMarks.listIterator();

        int max = 0;

        while(array.hasNext()){
            int currentValue = array.next();
            if(max < currentValue){
                max = currentValue;
            }
        }

        System.out.println(max);

    }

    private static void getRandMarks(int size){

        Random rand = new Random();

        for(int i = 0; i< size ; i++){
            arrayMarks.add(rand.nextInt(10));
        }

    }

}
