package diplomApi.tests;

import diplomApi.methods.PostMethods;
import diplomApi.tests.datas.PostData;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import spec.Spec;

import java.util.Map;

@Tag("post")
public class PostTest extends TestBase {

    PostMethods postMethods = new PostMethods();
    PostData postData = new PostData();

    @DisplayName("Проверка добавления объекта")
    @Test
    void postAddObjectTest() {
        Spec.install(HttpStatus.SC_OK);
        Map<String, ?> body = postData.postBody(postData.getNameValue(), postData.getYearValue(), postData.getPriceValue(),
                postData.getCpuModelValue(), postData.getHardDiskSizeValue());
        Response response = postMethods.addObject(body);
        Assertions.assertAll(
                () -> Assertions.assertEquals(postData.getNameValue(), response.path("name")),
                () -> Assertions.assertEquals(postData.getHardDiskSizeValue(), response.path("data.'Hard disk size'"))
        );
    }
}