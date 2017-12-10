package task13;

/**
 * Created by User on 10.12.2017.
 */
public class Task13 {
    public static void main(String[] args) {
        int a = 7;
        int i;
        for(i = 2; i < a; i++) {
            if(a%i == 0) {
                break;
            }
        }
        if (i == a) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}