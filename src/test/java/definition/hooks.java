package definition;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class hooks {
    public static AndroidDriver driverand;

    @Before
    public static void setUp() throws MalformedURLException {
//        service.start();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi 10");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
        capabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\henryRengifo\\YAPE_MOVIL\\src\\test\\resources\\apk\\booking-com-32-9.apk");
        capabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
        driverand = new AndroidDriver(new URL("http://127.0.0.1:4723"), capabilities);
    }

    @After
    public static void tearDown() {
        try {
            driverand.quit();
        } catch (Exception ign) {
            System.out.println(ign);
        }

    }
}
