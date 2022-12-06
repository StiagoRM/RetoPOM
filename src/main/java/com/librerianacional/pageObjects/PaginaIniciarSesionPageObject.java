package com.librerianacional.pageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaIniciarSesionPageObject extends PageObject {

    By txtCorreo = By.name("usuario");
    By txtClave = By.name("contrasena");
    By btnIniciarSesion = By.xpath("//button[.='Iniciar sesión']");

    public By getTxtCorreo() {
        return txtCorreo;
    }

    public By getTxtClave() {
        return txtClave;
    }

    public By getBtnIniciarSesion() {
        return btnIniciarSesion;
    }
}
