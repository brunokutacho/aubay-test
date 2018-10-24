package br.com.aubay.teste.steps;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.aubay.teste.factory.BrowserEnum;
import br.com.aubay.teste.factory.WebDriverFactory;
import br.com.aubay.teste.pageobjects.AubayCandidaturaEspontanea;
import br.com.aubay.teste.pageobjects.AubayMainPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CandidaturaEspontaneaSteps {
	
	final static Logger log = LoggerFactory.getLogger(CandidaturaEspontaneaSteps.class);
	
	private String browser = "Chrome";

    private WebDriver driver;
    private WebDriverWait driverWait;
    
    private AubayMainPage mainPage;
    private AubayCandidaturaEspontanea candidaturaEspontanea;
    
	@Before
	public void setup() throws InterruptedException {
		log.info("Setup de Teste");
        driver = new WebDriverFactory().getWebDriver(BrowserEnum.valueOf(browser));
        driverWait = new WebDriverWait(driver, 10);
		log.info("Fim - Setup de Teste");
		
		mainPage = (PageFactory.initElements(driver, AubayMainPage.class));
		candidaturaEspontanea = (PageFactory.initElements(driver, AubayCandidaturaEspontanea.class));
	}
	
	@After
	public void tearDown() {
		//driver.quit();
	}


	@Dado("^que o usuario esteja na pagina \"(.*?)\"$")
	public void queOUsuarioEstejaNaPagina(String webSite) throws Throwable {
		driver.get(webSite);
		driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
	}

	@Dado("^que o usuario selecione a lingua \"(.*?)\"$")
	public void queOUsuarioSelecioneALingua(String lingua) throws Throwable {
		mainPage.btnAubayLanguageSelect.click();
	}

	@Dado("^que clique na opcao \"(.*?)\"$")
	public void queCliqueNaOpcao(String arg1) throws Throwable {
		mainPage.lnkAubayCandidaturaEspontanea.click();
		driverWait.withTimeout(180, TimeUnit.SECONDS)
		.until(ExpectedConditions.visibilityOf(candidaturaEspontanea.txtNome));
	}

	@Quando("^preencher os campos Nome: \"(.*?)\", Senioridade: \"(.*?)\", Telemovel: \"(.*?)\", Tecnologias: \"(.*?)\", E-mail: \"(.*?)\" e LinkedIn: \"(.*?)\"$")
	public void preencherOsCamposNomeSenioridadeTelemovelTecnologiasEMailELinkedIn(String nome, String senioridade, String telemovel, String tecnologia, 
			String email, String linkedin) throws Throwable {
		candidaturaEspontanea.txtNome.sendKeys(nome);
		final Select selectBoxSenioridade = new Select(candidaturaEspontanea.cboSenioridade);
		selectBoxSenioridade.selectByVisibleText(senioridade);
		final Select selectBoxDDi = new Select(candidaturaEspontanea.cboDdiTelemovel);
		selectBoxDDi.selectByVisibleText("+55 (Brazil)");
		candidaturaEspontanea.txtTelemovel.sendKeys(telemovel);
		final Select selectBoxTecnologia = new Select(candidaturaEspontanea.cboTecnologia);
		selectBoxTecnologia.selectByVisibleText(tecnologia);
		candidaturaEspontanea.txtEmail.sendKeys(email);
		candidaturaEspontanea.txtLinkedin.sendKeys(linkedin);
		
	}

	@Quando("^clicar na opcao Integraco do candidato nos processos de recrutamento$")
	public void clicarNaOpcaoIntegracoDoCandidatoNosProcessosDeRecrutamento() throws Throwable {
		candidaturaEspontanea.ckbIntegracaoCandidato.click();
	}

	@Quando("^clicar na opcao Envio de comunicacoes relacionadas com a minha carreira profissional e oportunidades de emprego atraves de meios eletronicos$")
	public void clicarNaOpcaoEnvioDeComunicacoesRelacionadasComAMinhaCarreiraProfissionalEOportunidadesDeEmpregoAtravesDeMeiosEletronicos() throws Throwable {
		candidaturaEspontanea.ckbEnvioComunicacoes.click();
	}

	@Quando("^clicar na opcao Eu li e aceitei a Politica de Privacidade$")
	public void clicarNaOpcaoEuLiEAceiteiAPoliticaDePrivacidade() throws Throwable {
		candidaturaEspontanea.ckbLiAceitei.click();
	}

	@Quando("^clicar na opcao Nao sou um robo$")
	public void clicarNaOpcaoNaoSouUmRobo() throws Throwable {
		Actions action = new Actions(driver);
		action.moveToElement(candidaturaEspontanea.boxRecaptcha).perform();
		Thread.sleep(1000*5);
		action.moveToElement(candidaturaEspontanea.ckbRecaptcha.get(0),50,30).build().perform();
		Thread.sleep(1000);
		action.click();
		//.click().build().perform();
		//candidaturaEspontanea.c
	}

	@Quando("^clicar no botao Enviar$")
	public void clicarNoBotaoEnviar() throws Throwable {
		candidaturaEspontanea.btnEnviar.click();
	}

	@Entao("^a mensagem \"(.*?)\" deve ser exibida$")
	public void aMensagemDeveSerExibida(String mensagem) throws Throwable {
		driverWait.withTimeout(180, TimeUnit.SECONDS)
		.until(ExpectedConditions.visibilityOf(candidaturaEspontanea.boxMessagemErro));
		
		assertThat(candidaturaEspontanea.boxMessagemErro.getText(), is(mensagem));
	}



}
