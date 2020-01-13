package behavioral.visitor.creditcardandoffers.creditcard;

import behavioral.visitor.creditcardandoffers.offers.OfferVisitor;

public class SilverCreditCard implements CreditCard {
    @Override
    public String getName() {
        return "SilverCreditCard";
    }

    @Override
    public void accept(OfferVisitor visitor) {
        visitor.visit(this);
    }
}
