import Medical.Patient;
public class Receptionist {
    public void viewBasicInfo(Patient obj1){
        System.out.println("Name "+ obj1.getName());
        System.out.println("Age "+ obj1.getAge());
        System.out.println("contact "+ obj1.getcontact());
    }
}
