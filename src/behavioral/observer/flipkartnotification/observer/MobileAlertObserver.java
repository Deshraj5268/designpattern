package behavioral.observer.flipkartnotification.observer;

public class MobileAlertObserver implements Observer {

    private UserInfo userInfo;

    public MobileAlertObserver(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public void update() {
        System.out.println(this.userInfo.getName() +" is notified on "+this.userInfo.getEmail());
    }
}
