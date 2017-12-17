package task24;

/**
 * Created by User on 17.12.2017.
 */
public class ComonParam {
    public void showSize(int lenght, int height){
        System.out.println(String.format("My lenght is %s and my height id %s", lenght, height) );
    }

    public void showWeight(int weight){
        System.out.println("My weight is " + weight);
    }

    public void on(String typeElectronic){
        System.out.println(String.format("The %s is on", typeElectronic));
    }

}
