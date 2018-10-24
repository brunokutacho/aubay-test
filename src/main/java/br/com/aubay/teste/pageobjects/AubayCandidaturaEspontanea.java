package br.com.aubay.teste.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AubayCandidaturaEspontanea {
	
	final WebDriver driver;
	
	@FindBy(how = How.ID, using = "Nome")
	public WebElement txtNome;
	
	@FindBy(how = How.ID, using = "NivelProfissionalId")
	public WebElement cboSenioridade;
	
	@FindBy(how = How.ID, using = "TelemovelList")
	public WebElement cboDdiTelemovel;
	
	@FindBy(how = How.ID, using = "Telemovel")
	public WebElement txtTelemovel;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"Tecnologias\"]")
	public WebElement cboTecnologia;
	
	@FindBy(how = How.ID, using = "Email")
	public WebElement txtEmail;
	
	@FindBy(how = How.ID, using = "Linkedin")
	public WebElement txtLinkedin;
	
	@FindBy(how = How.ID, using = "AutorizeRecrut")
	public WebElement ckbIntegracaoCandidato;
	
	@FindBy(how = How.ID, using = "AutorizeJobOpp")
	public WebElement ckbEnvioComunicacoes;
	
	@FindBy(how = How.ID, using = "AutorizePolicy")
	public WebElement ckbLiAceitei;
	
	@FindBy(how = How.XPATH, using = "//*[@class=\"rc-anchor rc-anchor-normal rc-anchor-light\"][1]/div/div/div/div/span/div[2]")
	public List<WebElement> ckbRecaptcha;
	
	@FindBy(how = How.CLASS_NAME, using = "g-recaptcha")
	public WebElement boxRecaptcha;
	
	@FindBy(how = How.ID, using = "recaptcha-checkbox goog-inline-block recaptcha-checkbox-unchecked rc-anchor-checkbox recaptcha-checkbox-checked")
	public WebElement ckbNaoSouRoboChecked;
	
	@FindBy(how = How.ID, using = "Save")
	public WebElement btnEnviar;
	
	@FindBy(how = How.CLASS_NAME, using = "toast-message")
	public WebElement boxMessagemErro;
	
	public AubayCandidaturaEspontanea(WebDriver driver) {
        this.driver = driver;
    }

    public void endTest() {
        driver.quit();
    }
	

}
