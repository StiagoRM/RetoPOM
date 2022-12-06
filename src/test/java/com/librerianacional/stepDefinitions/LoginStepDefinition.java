package com.librerianacional.stepDefinitions;

import com.librerianacional.steps.PaginaCuentaStep;
import com.librerianacional.steps.PaginaIngresarStep;
import com.librerianacional.steps.PaginaIniciarSesionStep;
import com.librerianacional.steps.PaginaInicioStep;
import com.librerianacional.utils.EsperaExplicita;
import com.librerianacional.utils.EsperaImplicita;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class LoginStepDefinition {
    @Steps
    PaginaInicioStep paginaInicioStep;
    @Steps
    PaginaIngresarStep paginaIngresarStep;
    @Steps
    PaginaIniciarSesionStep paginaIniciarSesionStep;
    @Steps
    PaginaCuentaStep paginaCuentaStep;

    @Dado("^el usuario se encuentre en la pagina$")
    public void elUsuarioSeEncuentreEnLaPagina() {
        paginaInicioStep.abrirNavegador();
        paginaInicioStep.clickMiCuenta();
        paginaInicioStep.clickIniciarSesion();
        paginaIngresarStep.clickIngresarConMail();
    }


    @Cuando("^el usuario ingrese los datos$")
    public void elUsuarioIngreseLosDatos() throws IOException {
        paginaIniciarSesionStep.ingresarCorreo();
        paginaIniciarSesionStep.ingresarClave();
        paginaIniciarSesionStep.clickIniciarSesion();
    }

    @Entonces("^visualizara un mensaje de bienvenida$")
    public void visualizaraUnMensajeDeBienvenida() {
        paginaCuentaStep.validarMensaje();
    }
}
