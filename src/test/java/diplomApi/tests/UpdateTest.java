package diplomApi.tests;

import diplomApi.methods.PostMethods;
import diplomApi.methods.UpdateMethods;
import diplomApi.pojo.requests.UpdateObjectRequest;
import diplomApi.pojo.requests.UpdateObjectRequestData;
import diplomApi.pojo.responses.UpdateObjectResponse;
import diplomApi.tests.datas.PostData;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import spec.Spec;

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