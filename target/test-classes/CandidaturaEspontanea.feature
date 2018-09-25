# language: pt

Funcionalidade: Candidatura Espontanea
  Como usuario candidato
  Eu desejo realizar a candidatura espontanea

  Esquema do Cenario: Candidatura Espontanea
    Dado que o usuario esteja na pagina "<webSite>"
    E que o usuario selecione a lingua "PT"
    E que clique na opcao "Candidatura Espontanea"
    Quando preencher os campos Nome: "<nome>", Senioridade: "<senioridade>", Telemovel: "<telemovel>", Tecnologias: "<tecnologias>", E-mail: "<email>" e LinkedIn: "<linkedin>"
    E clicar na opcao "Integra��o do candidato nos processos de recrutamento"
    E clicar na opcao "Envio de comunica��es relacionadas com a minha carreira profissional e oportunidades de emprego atrav�s de meios eletr�nicos"
    E clicar na opcao "Eu li e aceitei a Politica de Privacidade"
    E clicar na opcao "N�o sou um rob�"
    E clicar no botao "Enviar"
    Entao a mensagem "<mensagem>" deve ser exibida

    Exemplos: 
      | webSite      | nome  | senioridade | telemovel | tecnologias | email              | linkedin               | mensagem                                                                               |
      | www.aubay.pt | teste | Senior      | 945673456 | Java        | teste@teste.com.br | www.linkedin.com/teste | Obrigado pelo interesse. Vamos agora trabalhar para lhe propor uma entrevista pessoal. |