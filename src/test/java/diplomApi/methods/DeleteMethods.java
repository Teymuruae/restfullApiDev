package diplomApi.methods;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import spec.Spec;

public class DeleteMethods extends ApiGeneral {

    public Response deleteObject(String objectId) {
        Spec.install(HttpStatus.SC_OK);
        return RestAssured
                .given().log().all()
                .basePath(apiConfig.getBasePath())
                .delete(String.format("/%s", objectId))
                .then().log().all()
                .extract()
                .response();
    }
}