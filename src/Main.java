import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        PaymentMethod alior = new AliorMastercard(20, "Alior", "Mastercard");
        PaymentMethod millenium = new MilleniumVisa(8, "Millenium", "Visa");
        PaymentMethod mBank = new mBankMastercard(5.5, "mBank", "Mastercard");
        PaymentMethod gift = new GiftCard(3.5);
        PaymentMethod blik = new BlikIng(10);
        PaymentMethod cash = new CashPayment(3);
//        PaymentMethod b = new PaymentMethod();


        alior.paymentDetails();
        millenium.paymentDetails();
        mBank.paymentDetails();
        gift.paymentDetails();
        blik.paymentDetails();
        cash.paymentDetails();


//        PaymentMethod[] board1 = new PaymentMethod[10];
//        board1[0] = alior;
//        board1[1] = millenium;
//        board1[2] = mBank;
//        board1[3] = gift;
//        board1[4] = blik;
//        board1[5] = cash;
//
//        for (int i = 0; i < board1.length; i++) {
//            System.out.println(board1[i]);
//        }
//
//        for (PaymentMethod tablica: board1) {
//            System.out.println(tablica);
//        }
//
//
//        Object objectsArray[];
//        objectsArray = new Object[6];
//
//                ArrayList<PaymentMethod> board = new ArrayList<PaymentMethod>();
//                board.add(alior);
//                board.add(millenium);
//                board.add(mBank);
//                board.add(gift);
//                board.add(blik);
//                board.add(cash);
//
//                int ilosc = board.size();
//
//
//                for (int i = 0; i < board.lenght; i++) {
//                    System.out.println();
//                }


    }
}