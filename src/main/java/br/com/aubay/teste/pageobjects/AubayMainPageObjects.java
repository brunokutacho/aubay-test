package br.com.aubay.teste.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AubayMainPageObjects {
	
	public WebElement AubayTitle(WebDriver driver) {
		return driver.findElement(By.className("animated bounceInRight"));
	}
	
	public WebElement AubayMainMenu(WebDriver driver) {
		return driver.findElement(By.className("slicknav_nav slicknav_hidden"));
	}
	
	public WebElement AubayLanguageSelect(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"main-navbar\"]/ul/li[5]/a"));
	}
	
	public WebElement AubayCandidaturaEspontaneaLink(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"main-navbar\"]/ul/li[4]/a"));
	}

}
