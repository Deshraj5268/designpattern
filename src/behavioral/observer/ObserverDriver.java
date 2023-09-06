package behavioral.observer;

import behavioral.observer.flipkartnotification.observablesubject.ConcreteObservableSubject;
import behavioral.observer.flipkartnotification.observer.EmailAlertObserver;
import behavioral.observer.flipkartnotification.observer.Observer;
import behavioral.observer.flipkartnotification.observer.UserInfo;

public class ObserverDriver {

    /*
    * Define a one-to-many dependency between objects so that when one object changes state,
    *  all its dependents are notified and updated automatically.
    * */


    public static void main(String[] args) {

        Observer observer1 = new EmailAlertObserver(new UserInfo("deshraj","raj@gamil.com"));
        Observer observer2 = new EmailAlertObserver(new UserInfo("chandraj","chandraj@gamil.com"));

        ConcreteObservableSubject observableSubject = new ConcreteObservableSubject("Redmi 6 Pro","Not available");
        observableSubject.register(observer1);
        observableSubject.register(observer2);

        observableSubject.notifyObserver();

        observableSubject.setProductAvailability("available");
        observableSubject.notifyObserver();
    }
}
