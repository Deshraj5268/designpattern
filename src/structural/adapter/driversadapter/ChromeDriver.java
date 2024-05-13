package structural.adapter.driversadapter;

public class ChromeDriver implements WebDriver {
    @Override
    public String getDriver() {
        System.out.println("ChromeDriver");
        return "ChromeDriver";
    }

    @Override
    public void clickDriver() {
        System.out.println("Chrome Driver is clicking ");
    }
}
