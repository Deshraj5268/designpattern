package behavioral.visitor.creditcardandoffers.creditcard;

import behavioral.visitor.creditcardandoffers.offers.OfferVisitor;

public class GoldCreditCard implements CreditCard {
    @Override
    public String getName() {
        return "GoldCreditCard";
    }

    @Override
    public void accept(OfferVisitor visitor) {
        visitor.visit(this);
    }
}
