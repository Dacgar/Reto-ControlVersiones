package com.guru99.test.stepdefinitions;

import com.guru99.automation.steps.RegisterAccountSteps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import org.hamcrest.Matchers;

import static org.junit.Assert.assertThat;

public class RegisterAccountStepDefinitions {
    @Steps
    RegisterAccountSteps registerSteps;

    @Dado("^selecciono abrir nueva cuenta$")
    public void seleccionoAbrirNuevaCuenta() {
       registerSteps.clickEnAbrirNuevaCuenta();
    }


    @Cuando("^lleno todos los campos requeridos$")
    public void llenoTodosLosCamposRequeridos(){
        registerSteps.escribirCustomerId();
        registerSteps.escribirInitialDeposit("1500000");
        registerSteps.clickEnCrearCuenta();
    }


    @Entonces("^valido la presencia de un mensaje diciendo cuenta creada exitosamente$")
    public void validoLaPresenciaDeUnMensajeDiciendoCuentaCreadaExitosamente() {
        assertThat(registerSteps.obtenerMensajeDeExito(), Matchers.is("Account Generated Successfully!!!"));
    }

}
