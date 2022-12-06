package com.librerianacional.pageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaConfirmarCarritoCompraPageObject extends PageObject {

    By msjValidacion = By.xpath("//div[.='¡Producto agregado al carrito de compras!']");

    public By getMsjValidacion() {
        return msjValidacion;
    }
}
