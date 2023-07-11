package diplomApi.tests;

import diplomApi.methods.DeleteMethods;
import diplomApi.methods.PostMethods;
import diplomApi.tests.datas.DeleteData;
import diplomApi.tests.datas.PostData;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
@Tag("delete")
public class DeleteTest extends TestBase {
    private DeleteMethods deleteMethods = new DeleteMethods();
    private PostData postData = new PostData();
    private PostMethods postMethods = new PostMethods();
    private DeleteData deleteData = new DeleteData();


    @Test
    void deleteObjectTest() {
        String id = postMethods.postObject();
        Response response = deleteMethods.deleteObject(id);
        Assertions.assertEquals(deleteData.getDeleteResponseMessage(id), response.path("message"));
    }
}
