package qapromo;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/LogInFeature"},
        glue = {"classpath:qapromo"},
        plugin = {"pretty"},
        tags = {"@promo"}
)
public class RunCukesTest {



}
