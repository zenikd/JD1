package task24;

/**
 * Created by User on 17.12.2017.
 */
public class TV extends MonitorParam{
    public boolean isHaveAnten(){
        return false;
    }
    public void showSize()
    {
        super.showSize(2,3);
    }

    public void showWeight()
    {
        super.showWeight(1000);
    }

    public void on()
    {
        super.on("TV");
    }

    public void showDiagonalLong()
    {
        super.showDiagonalLong(21);
    }
}
