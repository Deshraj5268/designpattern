package structural.adaptor.driversadaptor;

public class FirefoxDriver implements WebDriver {
    @Override
    public String getDriver() {
        System.out.println("FirefoxDriver");
        return "FirefoxDriver";
    }

    @Override
    public void clickDriver() {
        System.out.println("Firefox Driver is clicking ");
    }
}
