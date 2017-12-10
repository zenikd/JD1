package task15;

/**
 * Created by User on 10.12.2017.
 */
public class Task15 {
    public static void main(String[] args) {
        int[] marks = {2, 6, 8, 1, 9};
        int indexMax = 0;
        int indexMin = 0;
        int max = marks[0];
        int min = marks[0];

        for(int i = 1; i < marks.length; i++){
            if(max < marks[i]){
                max = marks[i];
                indexMax = i;
            }

            if(min > marks[i]){
                min = marks[i];
                indexMin = i;
            }
        }

        int start, finish;

        if(indexMax > indexMin){
            start = indexMin;
            finish = indexMax;
        }
        else{
            start = indexMin;
            finish = indexMax;
        }

        int Sum = 0;

        for(int i = start;i <= finish; i++){
            Sum += marks[i];
        }

        System.out.println(Sum);
    }
}