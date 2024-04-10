package com.guru99.automation.steps;

import com.guru99.automation.pageobjects.LoginPageObject;
import com.guru99.automation.pageobjects.RegisterAccountPageObject;
import com.sqasa.web.demo.utils.KrakenWeb;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;

public class RegisterAccountSteps extends KrakenWeb {

    RegisterAccountPageObject registerPage = new RegisterAccountPageObject();
    String id;
    public  RegisterAccountSteps(){
       this.id = obtenerDriver().findElement(registerPage.getMsgID()).getText();
    }

    @Step
    public void clickEnAbrirNuevaCuenta(){
        click(registerPage.getLnkOpenAccount());
    }
    @Step("Se escribe el customer id")
    public void escribirCustomerId (){
        escribirTexto(registerPage.getTxtCustomerId(), this.id);
    }
    @Step("Se escribe el deposito inicial")
    public void escribirInitialDeposit(String deposit){
        escribirTexto(registerPage.getTxtInitialDeposit(), deposit);
    }
    @Step("Click en Crear Cuenta")
    public void clickEnCrearCuenta(){
        click(registerPage.getBtnSubmit());
    }

    @Step
    public String obtenerMensajeDeExito(){
        return registerPage.getDriver().findElement(registerPage.getMsgSuccess()).getText();
    }

}
