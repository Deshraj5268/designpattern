package behavioral.visitor.creditcardandoffers;

import behavioral.visitor.creditcardandoffers.creditcard.BronzeCreditCard;
import behavioral.visitor.creditcardandoffers.creditcard.CreditCard;
import behavioral.visitor.creditcardandoffers.creditcard.GoldCreditCard;
import behavioral.visitor.creditcardandoffers.offers.GasOfferVisitor;
import behavioral.visitor.creditcardandoffers.offers.HotelOfferVisitor;
import behavioral.visitor.creditcardandoffers.offers.OfferVisitor;

public class Driver {

    public static void main(String[] args) {

        OfferVisitor hotelOfferVisitor= new HotelOfferVisitor(); //operations

        OfferVisitor gasOfferVisitor= new GasOfferVisitor();

        CreditCard bronzeCreditCard = new BronzeCreditCard();
        CreditCard goldCreditCard = new GoldCreditCard(); // can used factor pattern

        bronzeCreditCard.accept(hotelOfferVisitor);
        goldCreditCard.accept(gasOfferVisitor);
    }
}
