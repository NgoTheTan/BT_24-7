public class Robot {
    public static final String FARM = "FARM";
    public static final String HOSPITAL = "HOSPITAL";
    protected String id;
    protected String model;
    protected String workPlace;

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
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public Robot(String id, String model) {
        this.id = id;
        this.model = model;
    }
}
