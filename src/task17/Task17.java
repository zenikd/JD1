package task17;

import java.util.Random;

/**
 * Created by User on 10.12.2017.
 */
public class Task17 {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        for(int a = 0; a <= array[0].length /2; a++){
            for(int b = 0; b < array[0].length; b++){
                if(a <= b && b <= array[0].length - a){
                    array[a][b] = 1;
                }
                else{
                    array[a][b] = 0;
                }
            }
        }

        for(int a = array[0].length /2 + 1; a < array[0].length; a++){
            for(int b = 0; b < array[0].length; b++){
                if(a >= b && b <= array[0].length - a){
                    array[a][b] = 1;
                }
                else{
                    array[a][b] = 0;
                }
            }
        }

        for(int a = 0; a < array[0].length; a++){
            for(int b = 0; b < array[0].length; b++){
                System.out.println(array[a][b]);
            }
        }
    }
}
