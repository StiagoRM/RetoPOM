package com.librerianacional.steps;

import com.librerianacional.pageObjects.PaginaLibrosPageObject;
import com.librerianacional.utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;

public class PaginaLibrosStep {

    PaginaLibrosPageObject paginaLibrosPageObject = new PaginaLibrosPageObject();
    EsperaImplicita esperaImplicita = new EsperaImplicita();

    @Step
    public void seleccionarCategoria(){
        paginaLibrosPageObject.getDriver().findElement(paginaLibrosPageObject.getBtnCategoriaLiteraturaYFiccion()).click();
        paginaLibrosPageObject.getDriver().findElement(paginaLibrosPageObject.getBtnCategoriaUniversal()).click();
        paginaLibrosPageObject.getDriver().findElement(paginaLibrosPageObject.getBtnCategoriaFantasticaYCienciaFiccion()).click();
    }

    @Step
    public void seleccionarLibroPorCategoria(){
        paginaLibrosPageObject.getDriver().findElement(paginaLibrosPageObject.getBtnLibroNarnia()).click();
    }

    @Step
    public void seleccionarLibroPorBusqueda(){
        esperaImplicita.esperaImplicita(10);
        paginaLibrosPageObject.getDriver().findElement(paginaLibrosPageObject.getBtnLibroHarryPotter()).click();
    }
}
