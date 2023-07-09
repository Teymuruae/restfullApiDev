package diplomApi.tests.datas;

public class GetData {
    private final String
            expectedPrice = "419.99",
            idsPath = "?id=3&id=2&id=10",
            id7Paht = "?id=7",
            expectedCpuModel = "Intel Core i9";

    private final Integer
            expectedCapacityGB = 512;

    public String getExpectedPrice() {
        return expectedPrice;
    }

    public String getIdsPath() {
        return idsPath;
    }

    public Integer getExpectedCapacityGB() {
        return expectedCapacityGB;
    }

    public String getId7Paht() {
        return id7Paht;
    }

    public String getExpectedCpuModel() {
        return expectedCpuModel;
    }
}
