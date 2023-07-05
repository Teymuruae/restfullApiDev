package spec;

import diplomApi.configs.ApiConfig;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.aeonbits.owner.ConfigFactory;

public class Spec {
    private static ApiConfig apiConfig = ConfigFactory.create(ApiConfig.class, System.getProperties());

    private static RequestSpecification request() {
        return new RequestSpecBuilder()
                .setBaseUri(apiConfig.getBaseUrl())
                .setContentType(ContentType.JSON)
                .build();
    }

    private static ResponseSpecification response(int statusCode) {
        return new ResponseSpecBuilder()
                .expectStatusCode(statusCode)
                .build();
    }

    public static void install(int statusCode) {
        RestAssured.requestSpecification = request();
        RestAssured.responseSpecification = response(statusCode);
    }
}