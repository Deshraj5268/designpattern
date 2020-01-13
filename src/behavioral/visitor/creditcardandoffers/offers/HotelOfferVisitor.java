package behavioral.visitor.creditcardandoffers.offers;

import behavioral.visitor.creditcardandoffers.creditcard.BronzeCreditCard;
import behavioral.visitor.creditcardandoffers.creditcard.GoldCreditCard;
import behavioral.visitor.creditcardandoffers.creditcard.SilverCreditCard;

public class HotelOfferVisitor implements OfferVisitor {

    @Override
    public void visit(BronzeCreditCard bronzeCreditCard) {
        System.out.println(bronzeCreditCard.getName() + " is interacting with HotelOfferVisitor");
    }

    @Override
    public void visit(SilverCreditCard silverCreditCard) {
        System.out.println(silverCreditCard.getName() + " is interacting with HotelOfferVisitor");
    }

    @Override
    public void visit(GoldCreditCard goldCreditCard) {
        System.out.println(goldCreditCard.getName() + " is interacting with HotelOfferVisitor");
    }
}
