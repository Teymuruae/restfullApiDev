package diplomApi.tests.datas;

public class DeleteData {

    private final String deleteResponseMessage = "Object with id = %s has been deleted.";

    public String getDeleteResponseMessage(String objectId) {
        return String.format(deleteResponseMessage, objectId);
    }
}

