package behavioral.visitor.creditcardandoffers.creditcard;

import behavioral.visitor.creditcardandoffers.offers.OfferVisitor;

public class BronzeCreditCard implements CreditCard {

    @Override
    public String getName() {
        return "BronzeCreditCard";
    }

    @Override
    public void accept(OfferVisitor visitor) {
        visitor.visit(this);
    }
}
