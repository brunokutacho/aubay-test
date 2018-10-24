# language: pt
Funcionalidade: Candidatura Espontanea
  Como usuario candidato
  Eu desejo realizar a candidatura espontanea

  Esquema do Cenario: Candidatura Espontanea
    Dado que o usuario esteja na pagina "<webSite>"
    E que o usuario selecione a lingua "PT"
    E que clique na opcao "Candidatura Espontanea"
    Quando preencher os campos Nome: "<nome>", Senioridade: "<senioridade>", Telemovel: "<telemovel>", Tecnologias: "<tecnologias>", E-mail: "<email>" e LinkedIn: "<linkedin>"
    E clicar na opcao Integraco do candidato nos processos de recrutamento
    E clicar na opcao Envio de comunicacoes relacionadas com a minha carreira profissional e oportunidades de emprego atraves de meios eletronicos
    E clicar na opcao Eu li e aceitei a Politica de Privacidade
    E clicar no botao Enviar
    Entao a mensagem "<mensagem>" deve ser exibida

    Exemplos: 
      | webSite              | nome  | senioridade | telemovel | tecnologias | email              | linkedin               | mensagem                                 |
      | https://www.aubay.pt | teste | Senior      | 945673456 | Cucumber    | teste@teste.com.br | www.linkedin.com/teste | Selecione a caixa Captcha para continuar |
