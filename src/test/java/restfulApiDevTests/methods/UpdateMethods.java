package restfulApiDevTests.methods;

import restfulApiDevTests.pojo.requests.UpdateObjectRequest;
import restfulApiDevTests.pojo.responses.UpdateObjectResponse;
import io.restassured.RestAssured;
import org.apache.http.HttpStatus;
import restfulApiDevTests.spec.Spec;

public class UpdateMethods extends ApiGeneral {

    public UpdateObjectResponse updateObject(UpdateObjectRequest body, String objectId) {
        Spec.install(HttpStatus.SC_OK);
        return RestAssured
                .given().log().all()
                .basePath(apiConfig.getBasePath())
                .body(body)
                .put(String.format("/%s", objectId))
                .then().log().all()
                .extract().as(UpdateObjectResponse.class);
    }
}