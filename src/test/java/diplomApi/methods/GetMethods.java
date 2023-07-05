package diplomApi.methods;

import diplomApi.pojo.responses.ListOfAllObjectsResponse;
import io.restassured.RestAssured;
import org.apache.http.HttpStatus;
import spec.Spec;

import java.util.List;

public class GetMethods {

    private final String
            listOfAllObjectsPath = "/objects";

    public ListOfAllObjectsResponse [] getListOfAllObjectsResponse() {
        Spec.install(HttpStatus.SC_OK);
        return RestAssured
                .get(listOfAllObjectsPath)
                .then()
                .extract()
                .as(ListOfAllObjectsResponse[].class);
    }
}
