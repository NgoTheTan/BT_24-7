public class DoctorRobot extends Robot implements MedicalRobot{
    public DoctorRobot(String id, String model) {
        super(id, model);
        this.workPlace = HOSPITAL;
    }
    /**
     * Cure the person illness.
     */
    public void takeCareOf(Object obj) {
        if (obj instanceof Person) {
            Person p = (Person) obj;
            if (p.getHealthCondition() < Person.NORMAL) {
                p.feelBetter();
                p.feelBetter();
                System.out.println("Cured person " + p.getName() + " illness!");
            }
            else {
                System.out.println("This person doesn't need to see the doctor.");
            }
        } else {
            System.out.println("Can't help this object.");
        }
    }
}
