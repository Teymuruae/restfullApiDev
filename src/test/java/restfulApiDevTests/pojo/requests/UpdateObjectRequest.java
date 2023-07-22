package restfulApiDevTests.pojo.requests;

public class UpdateObjectRequest {

    private String name;
    private UpdateObjectRequestData data;

    public UpdateObjectRequest(String name, UpdateObjectRequestData data) {
        this.name = name;
        this.data = data;
    }

    public UpdateObjectRequest() {
    }

    public String getName() {
        return name;
    }

    public UpdateObjectRequestData getData() {
        return data;
    }
}