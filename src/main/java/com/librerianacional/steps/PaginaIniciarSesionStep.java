package com.librerianacional.steps;

import com.librerianacional.pageObjects.PaginaIniciarSesionPageObject;
import com.librerianacional.utils.DatosExcel;
import com.librerianacional.utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;

import java.io.IOException;

public class PaginaIniciarSesionStep {

    PaginaIniciarSesionPageObject paginaIniciarSesionPageObject = new PaginaIniciarSesionPageObject();
    DatosExcel datosExcel = new DatosExcel();

    @Step
    public void ingresarCorreo() throws IOException {
        paginaIniciarSesionPageObject.getDriver().findElement(paginaIniciarSesionPageObject.getTxtCorreo())
                .sendKeys(datosExcel.leerDatosExcel("Data.xlsx","DatosInicioSesion",1,0));
    }

    @Step
    public void ingresarClave() throws IOException {
        paginaIniciarSesionPageObject.getDriver().findElement(paginaIniciarSesionPageObject.getTxtClave())
                .sendKeys(datosExcel.leerDatosExcel("Data.xlsx","DatosInicioSesion",1,1));
    }

    @Step
    public void clickIniciarSesion(){
        paginaIniciarSesionPageObject.getDriver().findElement(paginaIniciarSesionPageObject.getBtnIniciarSesion()).click();
    }
}
