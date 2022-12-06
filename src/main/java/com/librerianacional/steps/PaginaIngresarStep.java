package com.librerianacional.steps;

import com.librerianacional.pageObjects.PaginaIngresarPageObject;
import net.thucydides.core.annotations.Step;

public class PaginaIngresarStep {

    PaginaIngresarPageObject paginaIngresarPageObject = new PaginaIngresarPageObject();

    @Step
    public void clickIngresarConMail (){
        paginaIngresarPageObject.getDriver().findElement(paginaIngresarPageObject.getBtnIngresar()).click();
    }
}
