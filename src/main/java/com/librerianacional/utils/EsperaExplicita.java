package com.librerianacional.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class EsperaExplicita {

    public void esperaExplicitaClick (By elemento, WebDriver driver) {
        WebDriverWait myWaitVar = new WebDriverWait(driver, 30);
        myWaitVar.until(ExpectedConditions.elementToBeClickable(elemento));
    }
    public void esperaExplicitaTexto (By elemento,WebDriver driver) {
        WebDriverWait myWaitVar = new WebDriverWait(driver, 30);
        myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(elemento));
    }
    public void esperarCargaPagina (WebDriver driver){
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }
}
