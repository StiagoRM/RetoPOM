package com.librerianacional.pageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaIngresarPageObject extends PageObject {
    By btnIngresar = By.xpath("//a[@href='/usuario/iniciar-sesion']");

    public By getBtnIngresar() {
        return btnIngresar;
    }
}
