package behavioral.observer;

import behavioral.observer.flipkartnotification.observablesubject.ConcreteObservableSubject;
import behavioral.observer.flipkartnotification.observer.CustomerOneObserver;
import behavioral.observer.flipkartnotification.observer.Observer;
import behavioral.observer.flipkartnotification.observer.UserInfo;

public class ObserverDriver {

    public static void main(String[] args) {

        Observer customerOneObserver = new CustomerOneObserver(new UserInfo("deshraj","raj@gamil.com"));
        Observer customerTwoObserver = new CustomerOneObserver(new UserInfo("chandraj","chandraj@gamil.com"));

        ConcreteObservableSubject observableSubject = new ConcreteObservableSubject("Redmi 6 Pro","Not available");
        observableSubject.register(customerOneObserver);
        observableSubject.register(customerTwoObserver);

        observableSubject.notifyObserver();

        observableSubject.setProductAvailability("available");
        observableSubject.notifyObserver();
    }
}
