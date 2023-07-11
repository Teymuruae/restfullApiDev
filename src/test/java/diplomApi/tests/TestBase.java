package diplomApi.tests;

import diplomApi.configs.ApiConfig;
import diplomApi.helpers.CustomApiListener;
import io.restassured.RestAssured;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    protected static ApiConfig apiConfig = ConfigFactory.create(ApiConfig.class, System.getProperties());

    @BeforeAll
    static void beforeAll() {
        RestAssured.baseURI = apiConfig.getBaseUrl();
        RestAssured.filters(CustomApiListener.withCustomTemplates());
    }
}