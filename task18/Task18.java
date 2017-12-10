package task18;

/**
 * Created by User on 10.12.2017.
 */
public class Task18 {
    public static void main(String[] args) {
        char[] array = {',', ':', '-', '.', '?', '!'};
        String str = "Wsd, dfx?-. ? gfdg";
        int n = 0;

        for (int i = 0; i < array.length; i++){
            int p = 0;

            while(p != -1){
                p = str.indexOf(array[i], p);
                if(p != -1){
                    p++;
                    n++;
                }
            }
        }

        System.out.println(n);
    }
}
