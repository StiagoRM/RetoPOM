package com.librerianacional.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/agregarLibroCarrito.feature",
        //tags = {"@LibroBusqueda"},
        glue = "com.librerianacional.stepDefinitions",
        snippets = SnippetType.CAMELCASE)

public class AgregarLibroCarritoRunner {

}
