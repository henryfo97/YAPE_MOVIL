package pageobjects;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class HomePage extends util {
    @AndroidFindBy(id = "com.booking:id/facet_search_box_accommodation_destination")
    protected WebElement btnDestino;
    @AndroidFindBy(id="com.booking:id/facet_with_bui_free_search_booking_header_toolbar_content")
    protected WebElement txtDestino;
    @AndroidFindBy(id = "com.booking:id/facet_date_picker_confirm")
    protected WebElement btnSelecionarFecha;
    @AndroidFindBy(id = "com.booking:id/facet_search_box_accommodation_occupancy")
    protected WebElement btnOcupacion;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[3]/android.widget.LinearLayout/android.widget.Button[2]")
    protected WebElement btnMasNinos;
    @AndroidFindBy(id = "android:id/button1")
    protected WebElement btnOK;
    @AndroidFindBy(id = "com.booking:id/group_config_apply_button")
    protected WebElement btnAplicar;
    @AndroidFindBy(id = "com.booking:id/facet_search_box_cta")
    protected WebElement btnBuscar;

    public HomePage() {
        PageFactory.initElements(new AppiumFieldDecorator(driverand),this);
    }


    public void IngresarDetino(String text){
        wait.until(ExpectedConditions.elementToBeClickable(btnDestino));
        btnDestino.click();
        txtDestino.sendKeys(text);
        driverand.findElement(By.xpath("(//android.view.ViewGroup)[2]")).click();
    }

    public void IngresarFecha(String fechaI, String fechaF) throws InterruptedException {
        Thread.sleep(3000);
        WebElement fechaInicio = driverand.findElement(AppiumBy.accessibilityId(""+fechaI+""));
        fechaInicio.click();
        WebElement fechaFin = driverand.findElement(AppiumBy.accessibilityId(""+fechaF+""));
        fechaFin.click();
        wait.until(ExpectedConditions.elementToBeClickable(btnSelecionarFecha));
        btnSelecionarFecha.click();
    }

    public void IngresarOcupacion(String n) throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(btnOcupacion));
        btnOcupacion.click();
        btnMasNinos.click();
        Thread.sleep(3000);
        WebElement btnEdad = driverand.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.NumberPicker/android.widget.Button[2]"));
        for (int i=0; i<=Integer.parseInt(n);i++){
            btnEdad.click();
        }
        btnOK.click();
        btnAplicar.click();
    }

    public void PulsarBuscar(){
        wait.until(ExpectedConditions.elementToBeClickable(btnBuscar));
        btnBuscar.click();
    }
}
