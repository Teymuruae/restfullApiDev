package diplomApi.methods;

import diplomApi.configs.ApiConfig;
import diplomApi.pojo.responses.ListOfAllObjectsResponse;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.aeonbits.owner.ConfigFactory;
import org.apache.http.HttpStatus;
import spec.Spec;

import java.util.Map;

public class PostMethods extends ApiGeneral{

    public Response addObject(Map<String, ?> body) {
        Spec.install(HttpStatus.SC_OK);
        return RestAssured
                .given()
                .body(body)
                .post(basePath)
                .then()
                .extract().response();
    }
}
