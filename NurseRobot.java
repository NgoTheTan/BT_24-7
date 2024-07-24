public class NurseRobot extends Robot implements MedicalRobot {
    public NurseRobot(String id, String model) {
        super(id, model);
        this.workPlace = HOSPITAL;
    }

    /**
     * Help the person feel better.
     */
    public void takeCareOf(Object obj) {
        if (obj instanceof Person) {
            Person p = (Person) obj;
            if (p.getHealthCondition() >= Person.NORMAL) {
                p.feelBetter();
                System.out.println("Helped person " + p.getName() + " feel better!");
            } else {
                System.out.println("Please go to the doctor robot for better healthcare.");
            }
        } else {
            System.out.println("Can't help this object.");
        }
    }
}
