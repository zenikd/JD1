package task12;

import java.util.Arrays;
/**
 * Created by User on 10.12.2017.
 */
public class Task12 {
    public static void main(String[] args) {
        int b = 3242354;

        int i = 1;
        while(i*1000 < b){
            i *=1000;
        }

        int a;
        for(i = i;i != 0; i /= 1000){

            a = b / i;
            b -= a * i;
            System.out.println(a + " ");
        }
    }
}
