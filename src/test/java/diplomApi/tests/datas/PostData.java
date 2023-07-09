package diplomApi.tests.datas;

import java.util.HashMap;
import java.util.Map;

public class PostData {
    private final String
            name = "name",
            data = "data",
            year = "year",
            price = "price",
            cpuModel = "CPU model",
            hardDiskSize = "Hard disk size",
            color = "color",
            nameValue = "Apple MacBook Pro 16",
            dataValue = "data",
            yearValue = "2019",
            priceValue = "1849.99",
            cpuModelValue = "Intel Core i9",
            hardDiskSizeValue = "1 TB",
            colorValue = "silver";


    public String getName() {
        return name;
    }

    public String getData() {
        return data;
    }

    public String getYear() {
        return year;
    }

    public String getPrice() {
        return price;
    }

    public String getCpuModel() {
        return cpuModel;
    }

    public String getHardDiskSize() {
        return hardDiskSize;
    }

    public String getNameValue() {
        return nameValue;
    }

    public String getDataValue() {
        return dataValue;
    }

    public String getYearValue() {
        return yearValue;
    }

    public String getPriceValue() {
        return priceValue;
    }

    public String getCpuModelValue() {
        return cpuModelValue;
    }

    public String getHardDiskSizeValue() {
        return hardDiskSizeValue;
    }

    public String getColor() {
        return color;
    }

    public String getColorValue() {
        return colorValue;
    }

    public Map<String, ?> postBody(String nameValue, String yearValue, String priceValue, String cpuModelValue, String hardDiskSizeValue) {
        return new HashMap<>() {{
            put(name, nameValue);
            put(data, new HashMap<>() {{
                put(year, yearValue);
                put(price, priceValue);
                put(cpuModel, cpuModelValue);
                put(hardDiskSize, hardDiskSizeValue);
            }});
        }};
    }
}