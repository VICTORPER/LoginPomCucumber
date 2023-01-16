package com.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
@DefaultUrl("http://demo.guru99.com")
public class LoginPage extends PageObject {
    @FindBy(xpath= "//input[@name='userName']")
    WebElement txtUser;

    @FindBy (xpath = "//input[@name='password']")
    WebElement txtPassword;

    @FindBy (xpath = "//input[@name='submit']")
    WebElement btnIniciarSesion;

     @FindBy(xpath = "//h3[text()='Login Successfully']")
     WebElement txtMensajeError;

    public void ingresarUsuario(String usuario) {
        txtUser.sendKeys(usuario);

    }
    public void ingresarPassword(String password) {
        txtPassword.sendKeys(password);

    }
    public void btnIniciarSesion(){
        btnIniciarSesion.click();
    }
    public boolean isHomePageDisplayed()
    {
        return txtMensajeError.isDisplayed();
    }


}
