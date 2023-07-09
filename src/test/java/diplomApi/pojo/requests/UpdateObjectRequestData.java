package diplomApi.pojo.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateObjectRequestData {
    private String year;
    private String price;
    @JsonProperty("CPU model")
    private String cPUmodel;
    @JsonProperty("Hard disk size")
    private String hardDiskSize;
    private String color;

    public UpdateObjectRequestData(String year, String price, String cPUmodel, String hardDiskSize, String color) {
        this.year = year;
        this.price = price;
        this.cPUmodel = cPUmodel;
        this.hardDiskSize = hardDiskSize;
        this.color = color;
    }

    public UpdateObjectRequestData() {
    }

    public String getYear() {
        return year;
    }

    public String getPrice() {
        return price;
    }

    public String getcPUmodel() {
        return cPUmodel;
    }

    public String getHardDiskSize() {
        return hardDiskSize;
    }

    public String getColor() {
        return color;
    }
}
