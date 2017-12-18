package task26;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by User on 18.12.2017.
 */
public class Task26 {

    static List<Integer> arrayMarks = new ArrayList<Integer>();

    public static void main(String[] args) {
        int size = 10;

        getRandMarks(size);
        getArrayGoodMarks();

        System.out.println(arrayMarks);
    }

    private static void getRandMarks(int size){

        Random rand = new Random();

        for(int i = 0; i< size ; i++){
            arrayMarks.add(rand.nextInt(10));
        }

    }

    private static void getArrayGoodMarks() {
        for (int i = 0; i < arrayMarks.size(); i++){

            if(arrayMarks.get(i) < 4 ){
                arrayMarks.remove(i);
                i--;
            }
        }
    }




}
