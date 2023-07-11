package diplomApi.methods;

import diplomApi.tests.datas.PostData;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import spec.Spec;

import java.util.Map;

public class PostMethods extends ApiGeneral {

    private PostData postData = new PostData();

    /**
     * post на создание объекта
     *
     * @param body
     * @return
     */
    public Response addObject(Map<String, ?> body) {
        Spec.install(HttpStatus.SC_OK);
        return RestAssured
                .given()
                .body(body)
                .post(basePath)
                .then()
                .extract().response();
    }

    /**
     * метод создания объекта и получения его id
     * @return
     */
    public String postObject() {
        Spec.install(HttpStatus.SC_OK);
        Map<String, ?> body = postData.postBody(postData.getNameValue(), postData.getYearValue(), postData.getPriceValue(),
                postData.getCpuModelValue(), postData.getHardDiskSizeValue());
        Response response = addObject(body);
        return response.path("id");
    }
}
