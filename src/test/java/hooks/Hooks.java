package hooks;

import base.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setup() {

        DriverManager.getDriver();
    }

    @After
    public void tearDown(Scenario scenario) {

        try {

            if (scenario.isFailed()) {

                byte[] screenshot =
                        ((TakesScreenshot) DriverManager.getDriver())
                                .getScreenshotAs(OutputType.BYTES);

                scenario.attach(
                        screenshot,
                        "image/png",
                        scenario.getName());
            }

        } finally {

            DriverManager.quitDriver();
        }
    }
}
