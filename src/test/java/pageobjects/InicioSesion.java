package pageobjects;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class InicioSesion extends util {

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Desplazarse hacia arriba']")
    protected WebElement btnCerrar;

    public InicioSesion() {
        PageFactory.initElements(new AppiumFieldDecorator(driverand),this);
    }


    public void ValidarIngresoCorrecto(){
        wait.until(ExpectedConditions.elementToBeClickable(btnCerrar));
        btnCerrar.click();
    }
}
