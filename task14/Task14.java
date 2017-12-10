package task14;

/**
 * Created by User on 10.12.2017.
 */
public class Task14 {
    public static void main(String[] args) {
        int[] marks = {2, 6, 8, 9};
        int index = -1;
        int max = -1;

        for (int i = 0; i < marks.length; i++) {
            if(max < marks[i]){
                max = marks[i];
                index = i;
            }
        }

        System.out.println(index);
    }
}
