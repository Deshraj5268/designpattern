package behavioral.observer.flipkartnotification.observablesubject;

import behavioral.observer.flipkartnotification.observer.Observer;

public interface ObservableSubject {

     boolean register(Observer observer);
     boolean unregister(Observer observer);
     void notifyObserver();


}