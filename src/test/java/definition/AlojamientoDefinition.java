package definition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.E;
import io.cucumber.java.es.Entonces;
import pageobjects.DatosPage;
import pageobjects.HomePage;
import pageobjects.ListDestinoPage;
import pageobjects.TarjetaPage;

import java.util.List;
import java.util.Map;

public class AlojamientoDefinition {

    HomePage home;
    ListDestinoPage list;
    DatosPage datos;
    TarjetaPage tarjeta;

    public AlojamientoDefinition(){
        home = new HomePage();
        list = new ListDestinoPage();
        datos = new DatosPage();
        tarjeta = new TarjetaPage();
    }

    @Entonces("ingreso los datos de busqueda")
    public void ingresoLosDatosDeBusqueda(DataTable dt) throws InterruptedException {
        List<Map<String,String>> data = dt.asMaps(String.class,String.class);
        for (int i=0; i<data.size(); i++){
            home.IngresarDetino(data.get(i).get("Destino"));
            home.IngresarFecha(data.get(i).get("FechaInicio"),data.get(i).get("FechaFin"));
            home.IngresarOcupacion(data.get(i).get("Ninnos"));
        }
    }

    @E("realizo la busqueda")
    public void realizoLaBusqueda() {
        home.PulsarBuscar();
    }

    @Entonces("selecciono la segunda opcion")
    public void seleccionoLaSegundaOpcion() throws InterruptedException {
        list.SeleccionarOpcion();
        list.ValidarEDisponibilidad();
    }

    @Cuando("ingreso los datos del usuario")
    public void ingresoLosDatosDelUsuario(DataTable dt) {
        List<Map<String,String>> data = dt.asMaps(String.class,String.class);
        for (int i=0; i<data.size(); i++){
            datos.IngresarNombre(data.get(i).get("Nombre"));
            datos.IngresarApellido(data.get(i).get("Apellido"));
            datos.IngresarEmail(data.get(i).get("Email"));
            datos.IngresarDireccion(data.get(i).get("Direccion"));
            datos.IngresarCodigoPostal(data.get(i).get("CodigoPostal"));
            datos.IngresarCiudad(data.get(i).get("Ciudad"));
            datos.IngresarPais(data.get(i).get("Pais"));
            datos.IngresarTelefono(data.get(i).get("Telefono"));
        }
        datos.PulsarSiguiente();
    }

    @Dado("ingreso datos de la tarjeta")
    public void ingresoDatosDeLaTarjeta(DataTable dt) throws InterruptedException {
        tarjeta.ValidarIngresoTerminarReserva();
        List<Map<String,String>> data = dt.asMaps(String.class,String.class);
        for (int i=0; i<data.size(); i++){
            tarjeta.IngresarNumeroTarjeta(data.get(i).get("Numero"));
            tarjeta.IngresarTitular(data.get(i).get("Titular"));
            tarjeta.IngresarFechaCaducidad(data.get(i).get("FechaC"));
            tarjeta.IngresarCodigoCVV(data.get(i).get("CodigoCVV"));
        }
    }

    @E("pulso sobre Reserva Ahora")
    public void pulsoSobreReservaAhora() {
        tarjeta.PularReservaAhora();
    }

    @Cuando("valido la reserva confirmada")
    public void validoLaReservaConfirmada() {
        tarjeta.ConfirmacionReserva();
    }
}
