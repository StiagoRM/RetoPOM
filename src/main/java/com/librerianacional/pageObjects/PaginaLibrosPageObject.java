package com.librerianacional.pageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaLibrosPageObject extends PageObject {

    By btnCategoriaLiteraturaYFiccion = By.xpath("//*[@aria-controls='collapse-0']");
    By btnCategoriaUniversal = By.xpath("//*[@aria-controls='collapse2-00']");
    By btnCategoriaFantasticaYCienciaFiccion = By.xpath("//div[text()=' Fantástica y Ciencia Ficción ']");
    By btnLibroNarnia = By.xpath("//div[@class='w-100 h-100']/a[@href='/producto/313696']");
    By btnLibroHarryPotter = By.xpath("//div[@class='w-100 h-100']/a[@href='/producto/harry-potter-2-y-la-camara-secreta-393475']");

    public By getBtnCategoriaLiteraturaYFiccion() {
        return btnCategoriaLiteraturaYFiccion;
    }

    public By getBtnCategoriaUniversal() {
        return btnCategoriaUniversal;
    }

    public By getBtnCategoriaFantasticaYCienciaFiccion() {
        return btnCategoriaFantasticaYCienciaFiccion;
    }

    public By getBtnLibroNarnia() {
        return btnLibroNarnia;
    }

    public By getBtnLibroHarryPotter() {
        return btnLibroHarryPotter;
    }
}
