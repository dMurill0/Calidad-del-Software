import prg.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features", glue = "Test")

public class CucumberSmokeTestRunner {

}