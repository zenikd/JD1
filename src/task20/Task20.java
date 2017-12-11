package task20;

/**
 * Created by User on 10.12.2017.
 */
public class Task20 {
    public static void main(String[] args) {
        String str = "sla  ad a  alsd   asdds";
        String str1 = str + " ";
        String strNew = str1.replaceAll(" +", " ");

        String out = "";
        int p = 0;
        while(p != -1){
            p = strNew.indexOf(' ', p);
            if(p != -1){
                out += strNew.charAt(p - 1);
                p++;
            }
        }
        System.out.println(out);
    }
}
