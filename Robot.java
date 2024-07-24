public class Robot {
    protected String id;
    protected String model;

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

    public Robot(String id, String model) {
        this.id = id;
        this.model = model;
    }
}
