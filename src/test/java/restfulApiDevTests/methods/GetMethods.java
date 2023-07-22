package restfulApiDevTests.methods;

import restfulApiDevTests.pojo.responses.ListOfAllObjectsResponse;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import restfulApiDevTests.spec.Spec;

public class GetMethods extends ApiGeneral {

    public ListOfAllObjectsResponse[] getListOfAllObjects(String path) {
        Spec.install(HttpStatus.SC_OK);
        return RestAssured
                .given()
                .get(basePath + path)
                .then()
                .extract()
                .as(ListOfAllObjectsResponse[].class);
    }

    public Response getListOfAllObjectsResponse(String path) {
        Spec.install(HttpStatus.SC_OK);
        return RestAssured
                .given()
                .get(basePath + path);
    }
}