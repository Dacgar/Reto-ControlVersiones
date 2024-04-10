package com.guru99.automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegisterAccountPageObject extends PageObject {


    By txtCustomerId = By.name("cusid");
    By txtInitialDeposit = By.name("inideposit");
    By msgSuccess = By.xpath("//table[@name=\"account\"]//tr//p");
    By btnSubmit = By.name("button2");
    By lnkOpenAccount = By.linkText("New Account");
    By msgID = By.xpath("//table[@name=\"customer\"]//tr[4]//td[2]");

    public By getBtnSubmit() {
        return btnSubmit;
    }

    public By getLnkOpenAccount() {
        return lnkOpenAccount;
    }

    public By getMsgID() {
        return msgID;
    }

    public By getTxtCustomerId() {
        return txtCustomerId;
    }

    public By getTxtInitialDeposit() {
        return txtInitialDeposit;
    }

    public By getMsgSuccess() {
        return msgSuccess;
    }
}
