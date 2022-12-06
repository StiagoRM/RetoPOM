package com.librerianacional.stepDefinitions;

import com.librerianacional.steps.PaginaConfirmarCarritoCompraStep;
import com.librerianacional.steps.PaginaConfirmarLibroStep;
import com.librerianacional.steps.PaginaCuentaStep;
import com.librerianacional.steps.PaginaLibrosStep;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class AgregarLibroCarritoStepDefinition {
    @Steps
    PaginaCuentaStep paginaCuentaStep;
    @Steps
    PaginaLibrosStep paginaLibrosStep;
    @Steps
    PaginaConfirmarLibroStep paginaConfirmarLibroStep;
    @Steps
    PaginaConfirmarCarritoCompraStep paginaConfirmarCarritoCompraStep;

    @Dado("^el usuario entre a la pagina libros$")
    public void elUsuarioEntreALaPaginaLibros() {
        paginaCuentaStep.clickLibros();
    }

    @Cuando("^el ususario seleccione una categoria$")
    public void elUsusarioSeleccioneUnaCategoria() {
        paginaLibrosStep.seleccionarCategoria();
    }


    @Cuando("^seleccione un libro$")
    public void seleccioneUnLibro() {
        paginaLibrosStep.seleccionarLibroPorCategoria();
        paginaConfirmarLibroStep.clickAgregarCarrito();
    }

    @Entonces("^lo agregara al carrito$")
    public void loAgregaraAlCarrito() {
        paginaConfirmarCarritoCompraStep.validarCarritoCompras();
    }

    @Dado("^el usuario digite el libro$")
    public void elUsuarioDigiteElLibro() throws IOException {
        paginaCuentaStep.ingresarLibro();
    }


    @Cuando("^le de click al libro$")
    public void leDeClickAlLibro() {
        paginaCuentaStep.seleccionarLibroBuscado();
        paginaLibrosStep.seleccionarLibroPorBusqueda();
        paginaConfirmarLibroStep.clickAgregarCarrito();
    }

    @Entonces("^se visualiza que lo agrego al carrito$")
    public void seVisualizaQueLoAgregoAlCarrito() {
        paginaConfirmarCarritoCompraStep.validarCarritoCompras();
    }
}
