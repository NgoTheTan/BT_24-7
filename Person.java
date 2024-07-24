public class Person {
    private String name;
    private int age;
    private String ID;

    public Person() {

    }

    public Person(String name, int age, String iD) {
        this.name = name;
        this.age = age;
        ID = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public String toString(){
        return "Name = "+name +", age = "+age+", ID = " + ID;
    }

}
