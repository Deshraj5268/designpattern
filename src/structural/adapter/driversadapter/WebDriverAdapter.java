package structural.adapter.driversadapter;

public class WebDriverAdapter implements WebDriver {

    private IEDriverAdaptee ieDriverAdaptee;

    public WebDriverAdapter(IEDriverAdaptee ieDriverAdaptee) {
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
