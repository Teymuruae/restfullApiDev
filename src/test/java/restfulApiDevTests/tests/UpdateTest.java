package restfulApiDevTests.tests;

import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import restfulApiDevTests.methods.PostMethods;
import restfulApiDevTests.methods.UpdateMethods;
import restfulApiDevTests.pojo.requests.UpdateObjectRequest;
import restfulApiDevTests.pojo.requests.UpdateObjectRequestData;
import restfulApiDevTests.pojo.responses.UpdateObjectResponse;
import restfulApiDevTests.spec.Spec;
import restfulApiDevTests.tests.datas.PostData;

@Tag("update")
public class UpdateTest extends TestBase {

    private UpdateMethods updateMethods = new UpdateMethods();
    private PostData postData = new PostData();
    private PostMethods postMethods = new PostMethods();

    @DisplayName("Проверка редактирования объекта")
    @Test
    void updateObjectTest() {
        Spec.install(HttpStatus.SC_OK);
        UpdateObjectRequestData preBody = new UpdateObjectRequestData(postData.getYearValue(), "2049.99",
                postData.getCpuModelValue(), postData.getHardDiskSizeValue(), postData.getColorValue());

        UpdateObjectRequest body = new UpdateObjectRequest(postData.getNameValue(), preBody);
        String id = postMethods.postObject();
        UpdateObjectResponse response = updateMethods.updateObject(body, id);

        Assertions.assertAll(
                () -> Assertions.assertEquals(postData.getColorValue(), response.getData().getColor()),
                () -> Assertions.assertEquals(id, response.getId())
        );
    }
}