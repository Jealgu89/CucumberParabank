import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/Feature"}
        ,glue= {"ParaBank"}
        ,tags= "@SomeTests"
)

public class TestRunner {

}