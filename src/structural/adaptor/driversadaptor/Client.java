package structural.adaptor.driversadaptor;

public class Client {

    public static void main(String[] args) {

        WebDriver fireFox = new FirefoxDriver();
        fireFox.getDriver();
        fireFox.clickDriver();

        IEDriverAdaptee ieDriverAdaptee = new IEDriverAdaptee();
        ieDriverAdaptee.findDriver();
        ieDriverAdaptee.startDriver();

        WebDriver webDriverAdaptor = new WebDriverAdaptor(ieDriverAdaptee);
        webDriverAdaptor.getDriver();
        webDriverAdaptor.clickDriver();

    }
}
