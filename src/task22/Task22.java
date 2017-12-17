package task22;

/**
 * Created by User on 17.12.2017.
 */
public class Task22 {
    public static void main(String[] args) {
        Time time1 = new Time(45);
        time1.showCountSec();

        Time time2 = new Time(45, 2, 0);
        time2.showCountSec();

        System.out.println(time1.compareTo(time2));

    }
}
