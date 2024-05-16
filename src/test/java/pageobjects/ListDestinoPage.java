package pageobjects;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class ListDestinoPage extends util {
    @AndroidFindBy(id = "com.booking:id/property_name")
    protected WebElement lblNombrePropiedad;
    @AndroidFindBy(id = "com.booking:id/select_room_cta")
    protected WebElement btnElegirHabitacion;
    @AndroidFindBy(id = "com.booking:id/rooms_item_select_text_view")
    protected WebElement btnSeleccionar;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.Button")
    protected WebElement btnReservaAhora;


    public ListDestinoPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driverand), this);
    }

    public void SeleccionarOpcion() throws InterruptedException {
        Thread.sleep(3000);
        WebElement SegundaOpcion = driverand.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]"));
        SegundaOpcion.click();
    }

    public void ValidarEDisponibilidad() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(lblNombrePropiedad));
        Thread.sleep(5000);
        btnElegirHabitacion.click();
        wait.until(ExpectedConditions.elementToBeClickable(btnSeleccionar));
        btnSeleccionar.click();
        wait.until(ExpectedConditions.elementToBeClickable(btnReservaAhora));
        btnReservaAhora.click();

    }
}
