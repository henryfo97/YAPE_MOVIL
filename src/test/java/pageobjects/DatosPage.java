package pageobjects;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class DatosPage extends util {
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/javaClass[1]/android.widget.EditText")
    protected WebElement txtNombre;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/javaClass[2]/android.widget.EditText")
    protected WebElement txtApellido;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/javaClass[3]/android.widget.AutoCompleteTextView")
    protected WebElement txtEmail;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/javaClass[1]/android.widget.EditText")
    protected WebElement txtDireccion;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/javaClass[2]/android.widget.EditText")
    protected WebElement txtCodigoPostal;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/javaClass[3]/android.widget.EditText")
    protected WebElement txtCiudad;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/javaClass/android.widget.AutoCompleteTextView")
    protected WebElement txtPais;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/javaClass[2]/android.widget.EditText")
    protected WebElement txtTelefono;
    @AndroidFindBy(id = "com.booking:id/action_button")
    protected WebElement btnSiguientePaso;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.Button")
    protected WebElement btnUltimoPaso;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/javaClass[1]/android.widget.TextView")
    protected WebElement btnBorrarTeclado;


    public DatosPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driverand),this);
    }

    public void IngresarNombre(String text){
        wait.until(ExpectedConditions.visibilityOf(txtNombre));
        txtNombre.clear();
        txtNombre.sendKeys(text);
        btnBorrarTeclado.click();
    }
    public void IngresarApellido(String text){
        wait.until(ExpectedConditions.visibilityOf(txtApellido));
        txtApellido.clear();
        txtApellido.sendKeys(text);
    }
    public void IngresarEmail(String text){
        wait.until(ExpectedConditions.visibilityOf(txtEmail));
        txtEmail.clear();
        txtEmail.sendKeys(text);
    }

    public void IngresarDireccion(String text){
        wait.until(ExpectedConditions.visibilityOf(txtDireccion));
        txtDireccion.clear();
        txtDireccion.sendKeys(text);
    }

    public void IngresarCodigoPostal(String text){
        wait.until(ExpectedConditions.visibilityOf(txtCodigoPostal));
        txtCodigoPostal.clear();
        txtCodigoPostal.sendKeys(text);
    }

    public void IngresarCiudad(String text){
        driverand.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Ciudad *\"))")).click();
        wait.until(ExpectedConditions.visibilityOf(txtCiudad));
        txtCiudad.clear();
        txtCiudad.sendKeys(text);
    }
    public void IngresarPais(String text){
        driverand.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"País/región *\"))")).click();
        wait.until(ExpectedConditions.visibilityOf(txtPais));
        txtPais.clear();
        txtPais.sendKeys(text);
        driverand.pressKey(new KeyEvent(AndroidKey.BACK));
    }
    public void IngresarTelefono(String text){
        driverand.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Teléfono móvil *\"))")).click();
        wait.until(ExpectedConditions.visibilityOf(txtTelefono));
        txtTelefono.sendKeys(text);
    }
    public void PulsarSiguiente(){
        wait.until(ExpectedConditions.elementToBeClickable(btnSiguientePaso));
        btnSiguientePaso.click();
        wait.until(ExpectedConditions.elementToBeClickable(btnUltimoPaso));
        btnUltimoPaso.click();
    }

}
