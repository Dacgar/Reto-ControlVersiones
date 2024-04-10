package com.guru99.automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://demo.guru99.com/v4/")
public class LoginPageObject extends PageObject {
    By txtUsuario = By.name("uid");
    By txtPassword = By.name("password");
    By btnLogin = By.name("btnLogin");
    By lnkRegister = By.linkText("New Customer");
    By txtName = By.xpath("//input[@name=\"name\"]");
    By txtBirthday = By.xpath("//input[@name=\"dob\"]");
    By txtAddres = By.xpath("//textarea[@name=\"addr\"]");
    By txtCity = By.xpath("//input[@name=\"city\"]");
    By txtState = By.xpath("//input[@name=\"state\"]");
    By txtPin = By.xpath("//input[@name=\"pinno\"]");
    By txtPhone = By.xpath("//input[@name=\"telephoneno\"]");
    By txtEmail = By.xpath("//input[@name=\"emailid\"]");
    By txtPass = By.xpath("//input[@name=\"password\"]");
    By btnSubmit = By.xpath("//input[@name=\"sub\"]");
    By msgSuccess = By.xpath("//p[@class=\"heading3\"]");


    public By getMsgSuccess() {
        return msgSuccess;
    }

    public void setMsgSuccess(By msgSuccess) {
        this.msgSuccess = msgSuccess;
    }

    public By getTxtUsuario() {
        return txtUsuario;
    }

    public By getLnkRegister() {
        return lnkRegister;
    }

    public void setLnkRegister(By lnkRegister) {
        this.lnkRegister = lnkRegister;
    }

    public By getTxtName() {
        return txtName;
    }

    public void setTxtName(By txtName) {
        this.txtName = txtName;
    }

    public By getTxtBirthday() {
        return txtBirthday;
    }

    public void setTxtBirthday(By txtBirthday) {
        this.txtBirthday = txtBirthday;
    }

    public By getTxtAddres() {
        return txtAddres;
    }

    public void setTxtAddres(By txtAddres) {
        this.txtAddres = txtAddres;
    }

    public By getTxtCity() {
        return txtCity;
    }

    public void setTxtCity(By txtCity) {
        this.txtCity = txtCity;
    }

    public By getTxtState() {
        return txtState;
    }

    public void setTxtState(By txtState) {
        this.txtState = txtState;
    }

    public By getTxtPin() {
        return txtPin;
    }

    public void setTxtPin(By txtPin) {
        this.txtPin = txtPin;
    }

    public By getTxtPhone() {
        return txtPhone;
    }

    public void setTxtPhone(By txtPhone) {
        this.txtPhone = txtPhone;
    }

    public By getTxtEmail() {
        return txtEmail;
    }

    public void setTxtEmail(By txtEmail) {
        this.txtEmail = txtEmail;
    }

    public By getTxtPass() {
        return txtPass;
    }

    public void setTxtPass(By txtPass) {
        this.txtPass = txtPass;
    }

    public By getBtnSubmit() {
        return btnSubmit;
    }

    public void setBtnSubmit(By btnSubmit) {
        this.btnSubmit = btnSubmit;
    }

    public void setTxtUsuario(By txtUsuario) {
        this.txtUsuario = txtUsuario;
    }

    public By getTxtPassword() {
        return txtPassword;
    }

    public void setTxtPassword(By txtPassword) {
        this.txtPassword = txtPassword;
    }

    public By getBtnLogin() {
        return btnLogin;
    }

    public void setBtnLogin(By btnLogin) {
        this.btnLogin = btnLogin;
    }
}


