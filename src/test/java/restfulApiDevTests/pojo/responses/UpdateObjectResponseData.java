package restfulApiDevTests.pojo.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateObjectResponseData {

    private Integer year;
    private Double price;
    @JsonProperty("CPU model")
    private String cPUmodel;
    @JsonProperty("Hard disk size")
    private String hardDiskSize;
    private String color;

    public UpdateObjectResponseData(int year, double price, String cPUmodel, String hardDiskSize, String color) {
        this.year = year;
        this.price = price;
        this.cPUmodel = cPUmodel;
        this.hardDiskSize = hardDiskSize;
        this.color = color;
    }

    public UpdateObjectResponseData() {
    }

    public Integer getYear() {
        return year;
    }

    public Double getPrice() {
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