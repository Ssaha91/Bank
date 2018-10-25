package steps;

import com.citibank.endpoints.PSGLayer;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

import static io.restassured.RestAssured.given;

public class MyStepdefs {

    @Given("^I am on facebook homepage$")
    public void iAmOnFacebookHomepage() {
        given().when().get(PSGLayer.VERIFY_CUSTOMER).then().statusCode(200);
    }

}
