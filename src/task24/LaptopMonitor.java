package task24;

/**
 * Created by User on 17.12.2017.
 */
public class LaptopMonitor extends MonitorParam{
    public boolean isHaveSensor(){
        return false;
    }

    public void showSize()
    {
        super.showSize(2,2);
    }

    public void showWeight()
    {
        super.showWeight(200);
    }

    public void on()
    {
        super.on("LaptopMonitor");
    }

    public void showDiagonalLong()
    {
        super.showDiagonalLong(19);
    }
}
