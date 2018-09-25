package br.com.aubay.teste.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		snippets = SnippetType.CAMELCASE
		,plugin = {"pretty"},
		features = "src/test/resources/CandidaturaEspontanea.feature"
		,monochrome = true, dryRun = false
		,glue={"br.com.aubay.teste.steps"}
		)
public class CandidaturaEspontaneaRunner {
}
