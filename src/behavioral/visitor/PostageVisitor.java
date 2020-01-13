package behavioral.visitor;

public class PostageVisitor implements Visitor {

    public double totalPostageForCart;

    @Override
    public void visit(Book book) {

        if(book.getPrice() < 10.2){
            totalPostageForCart += book.getWeight() * 2;
        }
    }

    public double getTotalPostageForCart() {
        return totalPostageForCart;
    }
}
