import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/Feature"},
        glue= {"Steps"},
        plugin = { "pretty" },
        monochrome = true

)

public class TestRunner {

}