package diplomApi.tests;

import diplomApi.methods.GetMethods;
import diplomApi.pojo.responses.ListOfAllObjectsResponse;
import diplomApi.tests.datas.GetData;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

@Tag("get")
public class GetTest extends TestBase {

    private GetMethods getMethods = new GetMethods();
    private GetData testData = new GetData();

    @DisplayName("Проверка поля по одному id")
    @Test
    void oneIdValuesTest(){
        Response response = getMethods.getListOfAllObjectsResponse(testData.getId7Paht());
        String actualCpuModel = response.path("data.find {it.'Hard disk size' == '1 TB'}.'CPU model'" );
        Assertions.assertEquals(testData.getExpectedCpuModel(), actualCpuModel);
    }

    @DisplayName("Проверка значений по всем id")
    @Test
    void getListOfAllObjectsTest() {
        ListOfAllObjectsResponse[] response = getMethods.getListOfAllObjects("" );
        Assertions.assertAll(
                () -> Assertions.assertEquals(testData.getExpectedCapacityGB(), response[2].getData().getCapacityGB()),
                () -> Assertions.assertEquals(testData.getExpectedPrice(), response[11].getData().getPrice2()),
                () -> Arrays.stream(response).forEach(x -> Assertions.assertNotNull(x.getName()))
        );
    }

    @DisplayName("Проверка содержания Apple в id 2,3,10")
    @Test
    void getListOfObjectsByIdsAppleNameTest() {
        ListOfAllObjectsResponse[] response = getMethods.getListOfAllObjects(testData.getIdsPath());
       Arrays.asList(response).forEach(x -> Assertions.assertTrue(x.getName().contains("Apple")));
    }
}