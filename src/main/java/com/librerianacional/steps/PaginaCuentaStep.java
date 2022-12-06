package com.librerianacional.steps;

import com.librerianacional.pageObjects.PaginaCuentaPageObject;
import com.librerianacional.utils.DatosExcel;
import com.librerianacional.utils.EsperaExplicita;
import com.librerianacional.utils.EsperaImplicita;
import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.hamcrest.Matchers;
import org.junit.Assert;

import java.io.IOException;
import java.util.regex.Matcher;

public class PaginaCuentaStep {

    EsperaExplicita esperaExplicita = new EsperaExplicita();
    EsperaImplicita esperaImplicita = new EsperaImplicita();
    PaginaCuentaPageObject paginaCuentaPageObject = new PaginaCuentaPageObject();

    DatosExcel datosExcel = new DatosExcel();

    @Step
    public void validarMensaje(){
        Assert.assertThat(paginaCuentaPageObject.getDriver().findElement
                (paginaCuentaPageObject.getMsjBienvenida()).isDisplayed(), Matchers.is(true));
    }
    @Step
    public void clickLibros(){
        esperaImplicita.esperaImplicita(10);
        paginaCuentaPageObject.getDriver().findElement(paginaCuentaPageObject.getBtnLibros()).click();

    }

    @Step
    public void ingresarLibro() throws IOException {
        esperaImplicita.esperaImplicita(10);
        paginaCuentaPageObject.getDriver().findElement(paginaCuentaPageObject.getTxtBuscar()).
                sendKeys(datosExcel.leerDatosExcel("Data.xlsx","DatosLibro",1,0));
    }
    @Step
    public void seleccionarLibroBuscado(){
        paginaCuentaPageObject.getDriver().findElement(paginaCuentaPageObject.getBtnLibroBuscar()).click();
    }
}
