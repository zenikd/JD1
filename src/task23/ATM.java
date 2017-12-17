package task23;

/**
 * Created by User on 17.12.2017.
 */
public class ATM {
    private static int count20 = 10;
    private static int count50 = 8;
    private static int count100 = 8;

    static void getMoney(int money){

        int[][] arrayOptinsMoney = getArrrayOptionsMoney(money);

        if(arrayOptinsMoney[money][0] != 1)
        {
            System.out.println("ATM don't can get money");
            return;
        }

        showNecessaryNotes(arrayOptinsMoney, money);



    }

    private static int[][] getArrayNull(int money){
        int[][] arrayOptinsMoney = new int[10000][2];

        for(int a=1; a <= money; a++){
            arrayOptinsMoney[a][0] = 0;
        }

        return arrayOptinsMoney;

    }

    private static int[] getArrayNotes(){
        int[] arrayNotes = new int[1000];

        int a = 0;

        while(a < count20){

            arrayNotes[a] = 20;
            a++;
        }

        while(a < count20 + count50){

            arrayNotes[a] = 50;
            a++;
        }

        while(a < count20 + count50 + count100){

            arrayNotes[a] = 100;
            a++;
        }
        return arrayNotes;

    }

    private static int getCountNotes(){
        int countNotes = count20 + count50 + count100;
        return countNotes;
    }

    private static int[][] getArrrayOptionsMoney(int money ){

        int[][] arrayOptinsMoney = getArrayNull(money);
        arrayOptinsMoney[0][0] = 1;

        int[] arrayNotes = getArrayNotes();
        int countNotes = getCountNotes();


        for(int a = 0; a < countNotes; a++){
            for (int b = money; b >= 0; b--){
                if(arrayOptinsMoney[b][0] == 1){
                    arrayOptinsMoney[b + arrayNotes[a]][0] = 1;
                    arrayOptinsMoney[b + arrayNotes[a]][1] = arrayNotes[a];
                }
            }
        }
        return arrayOptinsMoney;
    }

    private static void showNecessaryNotes(int[][] arrayOptinsMoney, int money ){

        int currentPosition = money;
        while(currentPosition > 0){
            System.out.println(arrayOptinsMoney[currentPosition][1] + " ");
            currentPosition -= arrayOptinsMoney[currentPosition][1];
        }
    }
}
