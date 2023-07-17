package Runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(tags = "@tagConnexionModifierProfil", 

                features = {"src/test/resources/Features"}, 

                glue = {"Definitions"},

                plugin = {})

public class CucumberRunner extends AbstractTestNGCucumberTests{

}