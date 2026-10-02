import Medical.Patient;
public class Doctor {
    public void viewPatient (Patient obj1 ) {
        System.out.println("\n Doctor's view ");
        System.out.println("Name: "+obj1.getName());
        System.out.println("Age: "+obj1.getAge());
        System.out.println("Sickness: "+obj1.getSickness());
        System.out.println("Contact: "+obj1.getcontact());
    }
}
