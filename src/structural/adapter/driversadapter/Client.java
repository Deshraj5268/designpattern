package structural.adapter.driversadapter;

public class Client {

    public static void main(String[] args) {

        WebDriver fireFox = new FirefoxDriver();
        fireFox.getDriver();
        fireFox.clickDriver();

        IEDriverAdaptee ieDriverAdaptee = new IEDriverAdaptee();
        ieDriverAdaptee.findDriver();
        ieDriverAdaptee.startDriver();

        WebDriver webDriverAdapter = new WebDriverAdapter(ieDriverAdaptee);
        webDriverAdapter.getDriver();
        webDriverAdapter.clickDriver();

    }
}
