package behavioral.observer.flipkartnotification.observablesubject;

import behavioral.observer.flipkartnotification.observer.Observer;

import java.util.LinkedList;
import java.util.List;

public class ConcreteObservableSubject implements ObservableSubject {

    private List<Observer> listOfObserver = new LinkedList<>(); // we can use CopyOnWriteArrayList in Multithreaded evmHashmap
    private String productName;
    private String availability; // should be some cleared availability think about newsPaper

    public ConcreteObservableSubject(String productName, String availability) {
        this.productName = productName;
        this.availability = availability;
    }

    @Override
    public boolean register(Observer observer) {
        listOfObserver.add(observer);
        return true;
    }

    @Override
    public boolean unregister(Observer observer) {
        listOfObserver.remove(observer);
        return true;
    }

    @Override
    public void notifyObserver() {
        if(availability.equals("available")) {
            listOfObserver.stream().forEach(o -> {
                o.update();
            });
        }else {
            System.out.println("product is not available now ... once "+productName+" is available will notify ");
        }
    }

    public void setProductAvailability(String availability){
        this.availability = availability;
    }
}
