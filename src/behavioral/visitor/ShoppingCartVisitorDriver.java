package behavioral.visitor;

import java.util.LinkedList;
import java.util.List;

public class ShoppingCartVisitorDriver {

    public static double calculatePostage(List<Visitable> items){
        PostageVisitor visitor = new PostageVisitor();
        if(items != null){
            for (Visitable visitable:items){
                visitable.accept(visitor);
            }
        }
       return visitor.getTotalPostageForCart();
    }


    public static void main(String[] args) {
        List<Visitable> items = new LinkedList<>();
        items.add(new Book(3.5,6.8));
        System.out.println(calculatePostage(items));
    }
}
