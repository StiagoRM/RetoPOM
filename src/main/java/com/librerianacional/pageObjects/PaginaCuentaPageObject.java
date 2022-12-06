package com.librerianacional.pageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaCuentaPageObject extends PageObject {

    By msjBienvenida = By.xpath("//*[.='Hola, Santiago!']");
    By btnLibros = By.xpath("//li[@class='pr-2']/a[@href='/categoria/libros']");
    By txtBuscar = By.xpath("//div[@class='form-group form-search-content d-flex mb-0 h-100']/*[@formcontrolname='buscar']");
    By btnLibroBuscar = By.xpath("(//a[@href='/categoria/libros/busqueda/libros/HARRY%20POTTER%202%20LA%20CAMARA%20SECRETA'])[2]");
    public By getMsjBienvenida() {
        return msjBienvenida;
    }

    public By getBtnLibros() {
        return btnLibros;
    }

    public By getTxtBuscar() {
        return txtBuscar;
    }

    public By getBtnLibroBuscar() {
        return btnLibroBuscar;
    }
}
