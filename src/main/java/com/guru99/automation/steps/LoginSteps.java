package com.guru99.automation.steps;

import com.guru99.automation.pageobjects.LoginPageObject;
import com.sqasa.web.demo.utils.KrakenWeb;
import net.thucydides.core.annotations.Step;

public class LoginSteps extends KrakenWeb {
    LoginPageObject loginPage = new LoginPageObject();
    @Step("Se abre el navegador")
    public void abrirNavegador(){
        configuracionesIniciales();
        abrirNavegadorEn(loginPage);
    }
    @Step("Se escribe el usuario")
    public void escribirUsuario (String usuario){
        escribirTexto(loginPage.getTxtUsuario(), usuario);
    }
    @Step("Se escribe la contraseña")
    public void escribirContraseña(String clave){
        escribirTexto(loginPage.getTxtPassword(), clave);
    }
    @Step("Click en login")
    public void clickEnLogin(){
        click(loginPage.getBtnLogin());
    }
    @Step
    public void clickEnRegistrarClienteGuru99(){
        click(loginPage.getLnkRegister());
    }
    @Step
    public void mandarNombre(String nombre){
        escribirTexto(loginPage.getTxtName(), nombre);
    }
    @Step
    public void mandarFechaNacimiento(String fecha){
        escribirTexto(loginPage.getTxtBirthday(), fecha);
    }
    @Step
    public void mandarDireccion(String direccion){
        escribirTexto(loginPage.getTxtAddres(), direccion);
    }
    @Step
    public void mandarCiudad(String ciudad){
        escribirTexto(loginPage.getTxtCity(), ciudad);
    }
    @Step
    public void mandarDepartamento(String dep){
        escribirTexto(loginPage.getTxtState(), dep);
    }
    @Step
    public void mandarPin(String PIN){
        escribirTexto(loginPage.getTxtPin(), PIN);
    }
    @Step
    public void mandarCelular(String telf){
        escribirTexto(loginPage.getTxtPhone(), telf);
    }
    @Step
    public void mandarEmail(String email){
        escribirTexto(loginPage.getTxtEmail(), email);
    }
    @Step
    public void mandarPass(String pass){
        escribirTexto(loginPage.getTxtPass(), pass);
    }
    @Step
    public void clickEnEnviarInformacionParaRegistro(){
        click(loginPage.getBtnSubmit());
    }

    @Step("Se obtiene el texto del registro exitoso")
    public String obtenerTextoDeRegistroExitoso(){
       return loginPage.getDriver().findElement(loginPage.getMsgSuccess()).getText();
    }
}
