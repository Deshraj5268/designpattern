package creational.factory.currecnyexmpl;

public class CurrencyFactory {

    public static Currency getCurrency(String country){
        if(country.equalsIgnoreCase("India")){
            return new Rupee();
        }else if(country.equalsIgnoreCase("Singapore")){
            return new SGDDollar();
        }else{
            throw new IllegalArgumentException("No such currency");
        }
    }

    public static void main(String[] args) {

        try {
            Currency rupee = getCurrency("India");
            System.out.println(rupee.getSymbol());
        }catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }
}
