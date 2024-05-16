package definition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.E;
import io.cucumber.java.es.Entonces;
import pageobjects.InicioSesion;

public class InicioSesionDefinition {

    InicioSesion inicio;

    public InicioSesionDefinition(){
        inicio = new InicioSesion();
    }


    @Entonces("valido el ingreso correcto a la aplicacion")
    public void validoElIngresoCorrectoALaAplicacion() {
        inicio.ValidarIngresoCorrecto();
    }
}
