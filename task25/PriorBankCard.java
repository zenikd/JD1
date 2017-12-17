package task25;

/**
 * Created by User on 18.12.2017.
 */
public class PriorBankCard extends VisaCard {
    public void showMaxMoneyInCard(){
        System.out.println("Max money in card is 25000$");
    }

    public void showBankName(){
       super.showBankName("Prior Bank");
    }
}
