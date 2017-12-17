package task22;

/**
 * Created by User on 17.12.2017.
 */
public class Time {
    private int sec;
    private int min;
    private int hour;

    public Time(int sec){
        this.sec = sec;
    }

    public Time(int sec, int min, int hour){
        this.sec = sec;
        this.min = min;
        this.hour = hour;
    }

    public int getCountSec(){
        int allSec = sec + min*60 + hour*3600;
        return allSec;
    }

    public void showCountSec(){
        System.out.println(getCountSec());
    }

    public boolean compareTo(Time time2){
        int allSec1 = getCountSec();
        int allSec2 = time2.getCountSec();
        return allSec1 > allSec2;
    }

}
