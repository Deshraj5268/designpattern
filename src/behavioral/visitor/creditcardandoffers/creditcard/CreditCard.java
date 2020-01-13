package behavioral.visitor.creditcardandoffers.creditcard;

import behavioral.visitor.creditcardandoffers.offers.OfferVisitor;

public interface CreditCard {

    String getName();
    void accept(OfferVisitor visitor);
}
