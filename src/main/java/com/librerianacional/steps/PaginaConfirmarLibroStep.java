package com.librerianacional.steps;

import com.librerianacional.pageObjects.PaginaConfirmarLibroPageObject;
import com.librerianacional.utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;

public class PaginaConfirmarLibroStep {

    PaginaConfirmarLibroPageObject paginaConfirmarLibroPageObject = new PaginaConfirmarLibroPageObject();
    EsperaImplicita esperaImplicita = new EsperaImplicita();

    @Step
    public void clickAgregarCarrito (){
        paginaConfirmarLibroPageObject.getDriver().findElement(paginaConfirmarLibroPageObject.getBtnAgregarCarrito()).click();
        esperaImplicita.esperaImplicita(10);
    }
}
