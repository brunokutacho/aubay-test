package br.com.aubay.teste.steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CandidaturaEspontaneaSteps {


	@Dado("^que o usuario esteja na pagina \"(.*?)\"$")
	public void queOUsuarioEstejaNaPagina(String webSite) throws Throwable {
	}

	@Dado("^que o usuario selecione a lingua \"(.*?)\"$")
	public void queOUsuarioSelecioneALingua(String lingua) throws Throwable {
	}

	@Dado("^que clique na opcao \"(.*?)\"$")
	public void queCliqueNaOpcao(String arg1) throws Throwable {
	}

	@Quando("^preencher os campos Nome: \"(.*?)\", Senioridade: \"(.*?)\", Telemovel: \"(.*?)\", Tecnologias: \"(.*?)\", E-mail: \"(.*?)\" e LinkedIn: \"(.*?)\"$")
	public void preencherOsCamposNomeSenioridadeTelemovelTecnologiasEMailELinkedIn(String nome, String senioridade, String telemovel, String tecnologia, String email, String linkedin) throws Throwable {
	}

	@Quando("^clicar na opcao \"(.*?)\"$")
	public void clicarNaOpcao(String opcao) throws Throwable {
	}

	@Quando("^clicar no botao \"(.*?)\"$")
	public void clicarNoBotao(String botao) throws Throwable {
	}

	@Entao("^a mensagem \"(.*?)\" deve ser exibida$")
	public void aMensagemDeveSerExibida(String mensagem) throws Throwable {
	}



}
