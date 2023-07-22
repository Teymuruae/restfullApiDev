package restfulApiDevTests.pojo.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListOfAllObjectsData {

    private String color;
    private String capacity;
    @JsonProperty("capacity GB")
    private Integer capacityGB;
    private Double price;
    private String generation;
    private Integer year;
    @JsonProperty("CPU model")
    private String cPU_model;
    @JsonProperty("Hard disk size")
    private String hardDiskSize;
    @JsonProperty("Strap Colour")
    private String strapColour;
    @JsonProperty("Case Size")
    private String caseSize;
    @JsonProperty("Color")
    private String color2;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("Capacity")
    private String capacity2;
    @JsonProperty("Screen size")
    private Double screenSize;
    @JsonProperty("Generation")
    private String generation2;
    @JsonProperty("Price")
    private String price2;

    public ListOfAllObjectsData(String color, String capacity, Integer capacityGB, Double price, String generation,
                                Integer year, String cPU_model, String hardDiskSize, String strapColour, String caseSize,
                                String color2, String description, String capacity2, Double screenSize, String generation2, String price2) {
        this.color = color;
        this.capacity = capacity;
        this.capacityGB = capacityGB;
        this.price = price;
        this.generation = generation;
        this.year = year;
        this.cPU_model = cPU_model;
        this.hardDiskSize = hardDiskSize;
        this.strapColour = strapColour;
        this.caseSize = caseSize;
        this.color2 = color2;
        this.description = description;
        this.capacity2 = capacity2;
        this.screenSize = screenSize;
        this.generation2 = generation2;
        this.price2 = price2;
    }

    public ListOfAllObjectsData() {
    }

    public String getColor() {
        return color;
    }

    public String getCapacity() {
        return capacity;
    }

    public Integer getCapacityGB() {
        return capacityGB;
    }

    public Double getPrice() {
        return price;
    }

    public String getGeneration() {
        return generation;
    }

    public Integer getYear() {
        return year;
    }

    public String getcPU_model() {
        return cPU_model;
    }

    public String getHardDiskSize() {
        return hardDiskSize;
    }

    public String getStrapColour() {
        return strapColour;
    }

    public String getCaseSize() {
        return caseSize;
    }

    public String getColor2() {
        return color2;
    }

    public String getDescription() {
        return description;
    }

    public String getCapacity2() {
        return capacity2;
    }

    public Double getScreenSize() {
        return screenSize;
    }

    public String getGeneration2() {
        return generation2;
    }

    public String getPrice2() {
        return price2;
    }
}