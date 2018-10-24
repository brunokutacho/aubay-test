package br.com.aubay.teste.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AubayMainPage {
	
	final WebDriver driver;
	
	@FindBy(how = How.CLASS_NAME, using = "animated bounceInRight")
	public WebElement txtAubayTitle;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"main-navbar\"]/ul/li[5]/a")
	public WebElement btnAubayLanguageSelect;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"main-navbar\"]/ul/li[4]/a")
	public WebElement lnkAubayCandidaturaEspontanea;
	
	public AubayMainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void endTest() {
        driver.quit();
    }

}
