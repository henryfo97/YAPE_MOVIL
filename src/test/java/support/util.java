package support;

import definition.hooks;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class util extends hooks {
    public static WebDriverWait wait;

    public util() {
        wait = new WebDriverWait(driverand, Duration.ofSeconds(30));
    }
}
