package com.librerianacional.pageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaConfirmarLibroPageObject extends PageObject {

    By btnAgregarCarrito = By.xpath("//button[text()='Añadir al carrito']");

    public By getBtnAgregarCarrito() {
        return btnAgregarCarrito;
    }
}
