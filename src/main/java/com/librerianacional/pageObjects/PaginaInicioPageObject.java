package com.librerianacional.pageObjects;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://librerianacional.com")
public class PaginaInicioPageObject extends PageObject {

    By btnMiCuenta = By.xpath("(//button[.=' Mi cuenta '])[2]");
    By btnIniciarSesion = By.xpath("//div[@x-placement='bottom-end']/a[@href='/usuario/ingresar']");

    public By getBtnMiCuenta() {
        return btnMiCuenta;
    }

    public By getBtnIniciarSesion() {
        return btnIniciarSesion;
    }
}
