package com.librerianacional.steps;

import com.librerianacional.pageObjects.PaginaInicioPageObject;
import net.thucydides.core.annotations.Step;

public class PaginaInicioStep {

    PaginaInicioPageObject paginaInicioPageObject = new PaginaInicioPageObject();

    @Step
    public void abrirNavegador(){
        paginaInicioPageObject.open();
    }
    @Step
    public void clickMiCuenta(){
        paginaInicioPageObject.getDriver().findElement(paginaInicioPageObject.getBtnMiCuenta()).click();
    }
    @Step
    public void clickIniciarSesion(){
        paginaInicioPageObject.getDriver().findElement(paginaInicioPageObject.getBtnIniciarSesion()).click();
    }
}
