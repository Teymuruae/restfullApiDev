package restfulApiDevTests.pojo.responses;

public class ListOfAllObjectsResponse {

    private String id;
    private String name;
    private ListOfAllObjectsData data;

    public ListOfAllObjectsResponse(String id, String name, ListOfAllObjectsData data) {
        this.id = id;
        this.name = name;
        this.data = data;
    }

    public ListOfAllObjectsResponse() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ListOfAllObjectsData getData() {
        return data;
    }
}