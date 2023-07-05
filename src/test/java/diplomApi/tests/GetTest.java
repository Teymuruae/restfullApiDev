package diplomApi.tests;

import diplomApi.methods.GetMethods;
import diplomApi.pojo.responses.ListOfAllObjectsResponse;
import org.junit.jupiter.api.Test;

import java.util.List;

//https://restful-api.dev/
public class GetTest {

    private GetMethods getMethods = new GetMethods();
    @Test
    void getListOfAllObjectsTest(){
        ListOfAllObjectsResponse[] response = getMethods.getListOfAllObjectsResponse();
        System.out.println(response[2].getData().getCapacityGB());
    }
}
