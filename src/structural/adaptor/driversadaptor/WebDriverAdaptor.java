package structural.adaptor.driversadaptor;

public class WebDriverAdaptor implements WebDriver {

    private IEDriverAdaptee ieDriverAdaptee;

    public WebDriverAdaptor(IEDriverAdaptee ieDriverAdaptee) {
        this.ieDriverAdaptee = ieDriverAdaptee;
    }

    @Override
    public String getDriver() {
        return ieDriverAdaptee.findDriver();
    }

    @Override
    public void clickDriver() {
        ieDriverAdaptee.startDriver();
    }
}
