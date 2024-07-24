public class Person {
    public static final int HEALTHY = 3;
    public static final int NORMAL = 2;
    public static final int WEAK = 1;
    public static final int SUFFERING = 0;
    private String name;
    private int age;
    private String ID;
    private int healthCondition;

    /**
     * Constructor.
     * 
     * @param name String.
     * @param age  int.
     * @param iD   String.
     */
    public Person(String name, int age, String iD, int healthCondition) {
        this.name = name;
        this.age = age;
        this.ID = iD;
        this.healthCondition = healthCondition;
    }

    /**
     * Get the Person's name.
     * 
     * @return String name.
     */
    public String getName() {
        return name;
    }

    /**
     * Set the person name.
     * 
     * @param name String.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the person's age.
     * 
     * @return int age.
     */
    public int getAge() {
        return age;
    }

    /**
     * Set the person age.
     * 
     * @param age int.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Get the person's id.
     * 
     * @return
     */
    public String getID() {
        return ID;
    }

    /**
     * Set the person's id.
     * 
     * @param iD String.
     */
    public void setID(String iD) {
        ID = iD;
    }

    /**
     * Get the person's health condition.
     * 
     * @return health condition int.
     */
    public int getHealthCondition() {
        return this.healthCondition;
    }

    /**
     * Raise the person healt condition one level up.
     */
    public void feelBetter() {
        this.healthCondition++;
    }

    public String toString() {
        return "Name = " + name + ", age = " + age + ", ID = " + ID;
    }
}
