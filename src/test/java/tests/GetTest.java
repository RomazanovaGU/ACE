package tests;

import io.qameta.allure.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import lib.Assertions;
import lib.BaseTestCase;
import lib.ApiCoreRequests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import support.HeadersHelper;
import support.JsonBody;

@Epic("CORP-925: ACE")
@Story("CORP-939: Create other peripherals")
public class GetTest extends BaseTestCase {
    private final ApiCoreRequests apiCoreRequests = new ApiCoreRequests();

    @Test

    @Severity(value = SeverityLevel.NORMAL)
    @Description("This test create a new Card Swipes")
    @DisplayName("Test positive first one")
    public void testCreateCardSwipesOnCopiedEstab(){
        Response responseUserData = RestAssured
                .given()
                .headers(HeadersHelper.headerForAuth())
                .body(JsonBody.createFirstBodyJson())
                .post("https://corp-qa1.revelup.com/setup/auto-copy/")
                .andReturn();
//        Assertions.assertJsonHasField(responseUserData, "username");
//        Assertions.assertJsonHasNotField(responseUserData, "firstName");
//        Assertions.assertJsonHasNotField(responseUserData, "lastName");
//        Assertions.assertJsonHasNotField(responseUserData, "email");
    }
}

