public class CoinTester
{
    public static void main(String[] args) {

       // Create your program here
       Coins wallet = new Coins(3,2,1,4);
       wallet.bankValue();
       wallet.addQuarter();
       wallet.addDime();
       wallet.addQuarter();
       wallet.addPenny();
       wallet.addPenny();
       wallet.addPenny();
       wallet.bankCount();
       wallet.bankValue();
    }
}
