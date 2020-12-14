package behavioral.observer.flipkartnotification.observer;

public class CustomerOneObserver implements Observer {

    private UserInfo userInfo;

    public CustomerOneObserver(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public void update() {
        System.out.println(this.userInfo.getName() +" is notified on "+this.userInfo.getEmail());
    }
}
