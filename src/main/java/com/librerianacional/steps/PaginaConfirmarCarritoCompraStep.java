package com.librerianacional.steps;

import com.librerianacional.pageObjects.PaginaConfirmarCarritoCompraPageObject;
import com.librerianacional.utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class PaginaConfirmarCarritoCompraStep {

    EsperaImplicita esperaImplicita = new EsperaImplicita();

    PaginaConfirmarCarritoCompraPageObject paginaConfirmarCarritoCompraPageObject = new PaginaConfirmarCarritoCompraPageObject();

    @Step
    public void validarCarritoCompras(){
        Assert.assertThat(paginaConfirmarCarritoCompraPageObject.getDriver().findElement
                (paginaConfirmarCarritoCompraPageObject.getMsjValidacion()).isDisplayed(), Matchers.is(true));

    }
}
