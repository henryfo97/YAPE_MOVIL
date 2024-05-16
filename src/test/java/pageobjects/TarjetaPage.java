package pageobjects;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class TarjetaPage extends util {
    @AndroidFindBy(id = "com.booking:id/new_credit_card_number_edit")
    protected WebElement txtNumeroTarjeta;
    @AndroidFindBy(id = "com.booking:id/new_credit_card_holder_edit")
    protected WebElement txtNombre;
    @AndroidFindBy(id = "com.booking:id/new_credit_card_expiry_date_edit")
    protected WebElement txtFechaCaducidad;
    @AndroidFindBy(id = "com.booking:id/new_credit_card_cvc_edit_text")
    protected WebElement txtCodigoCVV;

    @AndroidFindBy(id = "com.booking:id/action_button")
    protected WebElement btnReservaAhora;

    @AndroidFindBy(id = "com.booking:id/pb_reservation_header_title")
    protected WebElement lblReservaConfirmada;

    public TarjetaPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driverand),this);
    }

    public void ValidarIngresoTerminarReserva() throws InterruptedException {
        Thread.sleep(5000);
    }

    public void IngresarNumeroTarjeta(String text){
        wait.until(ExpectedConditions.visibilityOf(txtNumeroTarjeta));
        txtNumeroTarjeta.sendKeys(text);
    }

    public void IngresarTitular(String text){
        wait.until(ExpectedConditions.visibilityOf(txtNombre));
        txtNombre.clear();
        txtNombre.sendKeys(text);
    }

    public void IngresarFechaCaducidad(String text){
        wait.until(ExpectedConditions.visibilityOf(txtFechaCaducidad));
        txtFechaCaducidad.sendKeys(text);
    }

    public void IngresarCodigoCVV(String text){
        wait.until(ExpectedConditions.visibilityOf(txtCodigoCVV));
        txtCodigoCVV.sendKeys(text);
    }


    public void PularReservaAhora(){
        wait.until(ExpectedConditions.elementToBeClickable(btnReservaAhora));
        btnReservaAhora.click();
    }

    public void ConfirmacionReserva(){
        wait.until(ExpectedConditions.elementToBeClickable(lblReservaConfirmada));
        Assert.assertEquals("Tu reserva está confirmada", lblReservaConfirmada.getText());
        System.out.println(lblReservaConfirmada.getText());
    }
}
