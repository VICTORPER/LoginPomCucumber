package co.com.loginPOM.stepdefinitions;

import com.steps.stepLogin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class stepDefinitionsLogin {
    @Steps
    stepLogin login;
    @Given("que ingreso a la pagina demoguru99")
    public void queIngresoALaPaginaDemoguru99() {
        login.AbrirPagina();
    }

    @When("ingreso los datos de usuario {string} y contrasena {string}")
    public void ingresoLosDatosDeUsuarioYContrasena(String usuario, String contrasena) {
        login.IngresarUser(usuario);
        login.IngresarPassword(contrasena);
        login.btnInicioSesion();
    }

    @Then("valido el ingreso exitoso")
    public void validoElIngresoExitoso() {
       login.isDisplayed();
    }
}
