package diplomApi.pojo.responses;

public class UpdateObjectResponse {

    private String id;
    private String name;
    private UpdateObjectResponseData data;
    private String updatedAt;

    public UpdateObjectResponse(String id, String name, UpdateObjectResponseData data, String updatedAt) {
        this.id = id;
        this.name = name;
        this.data = data;
        this.updatedAt = updatedAt;
    }

    public UpdateObjectResponse() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public UpdateObjectResponseData getData() {
        return data;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
}
