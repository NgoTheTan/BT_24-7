public class Robot {
    protected String id;
    protected String model;
    protected String WorkPlace;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getWorkPlace() {
        return WorkPlace;
    }

    public void setWorkPlace(String workPlace) {
        WorkPlace = workPlace;
    }

    public Robot(String id, String model, String WorkPlace) {
        this.id = id;
        this.model = model;
        this.WorkPlace = WorkPlace;
    }
}
