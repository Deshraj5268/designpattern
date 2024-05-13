package behavioral.visitor.creditcardandoffers.offers;

import behavioral.visitor.creditcardandoffers.creditcard.BronzeCreditCard;
import behavioral.visitor.creditcardandoffers.creditcard.CreditCard;
import behavioral.visitor.creditcardandoffers.creditcard.GoldCreditCard;
import behavioral.visitor.creditcardandoffers.creditcard.SilverCreditCard;

public interface OfferVisitor {

   /* void visit(BronzeCreditCard bronzeCreditCard);
    void visit(SilverCreditCard silverCreditCard);
    void visit(GoldCreditCard goldCreditCard);*/

    void visit(CreditCard creditCard);
}
