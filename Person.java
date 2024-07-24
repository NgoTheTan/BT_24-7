public class Person {
    private String name;
    private int age;
    private String ID;

    /**
     * Constructor.
     * 
     * @param name String.
     * @param age  int.
     * @param iD   String.
     */
    public Person(String name, int age, String iD) {
        this.name = name;
        this.age = age;
        ID = iD;
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

    public String toString() {
        return "Name = " + name + ", age = " + age + ", ID = " + ID;
    }

}
