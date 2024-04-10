package com.guru99.test.stepdefinitions;

import static org.junit.Assert.assertThat;

import com.guru99.automation.models.DataInjection;
import com.guru99.automation.models.Usuario;
import com.guru99.automation.steps.LoginSteps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import org.hamcrest.Matchers;

import java.util.List;

public class LoginStepDefinitions {

    @Steps
    LoginSteps loginSteps;

    DataInjection data = new DataInjection();

    @Dado("^que estoy en la pagina de inicio de gurubank$")
    public void queEstoyEnLaPaginaDeInicioDeGurubank() {
      loginSteps.abrirNavegador();
    }


    @Cuando("^ingreso mis credenciales$")
    public void ingresoMisCredenciales(List<Usuario> listaUsuarios) {
      loginSteps.escribirUsuario(listaUsuarios.get(0).getUsuario());
      loginSteps.escribirContraseña(listaUsuarios.get(0).getClave());
      loginSteps.clickEnLogin();
    }

    @Cuando("^lleno los campos de registro para cliente$")
    public void llenoLosCamposDeRegistroParaCliente() throws InterruptedException {
       loginSteps.clickEnRegistrarClienteGuru99();
       loginSteps.mandarNombre(data.getNombre());
       loginSteps.mandarFechaNacimiento(data.getFechaNacimiento());
       loginSteps.mandarDireccion(data.getDireccion());
       loginSteps.mandarCiudad(data.getCiudad());
       loginSteps.mandarDepartamento(data.getDepartamento());
       loginSteps.mandarPin(data.getCodigoPostal());
       loginSteps.mandarCelular(data.getNumeroTelefonico());
       loginSteps.mandarEmail(data.getCorreo());
       loginSteps.mandarPass(data.getClave());
       loginSteps.clickEnEnviarInformacionParaRegistro();
    }

    @Entonces("^valido la presencia de un mensaje de exito$")
    public void validoLaPresenciaDeUnMensajeDeExito() {
        assertThat(loginSteps.obtenerTextoDeRegistroExitoso(), Matchers.is("Customer Registered Successfully!!!"));
    }
}
