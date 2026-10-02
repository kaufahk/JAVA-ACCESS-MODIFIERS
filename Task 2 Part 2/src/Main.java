import Medical.Patient;
public class Main {
    public static void main(String[] args) {
        Patient obj1 = new Patient("Jacob",20,"Typhoid","0789654325");
        Doctor obj2 = new Doctor();
        Receptionist obj3 = new Receptionist();
        Admin obj4 = new Admin();
        System.out.println("/n Patient Management System" );
        obj2.viewPatient(obj1);
        System.out.println("Receptionist");
        obj3.viewBasicInfo(obj1);
        System.out.println("Administration");
        obj4.Finances();
    }
}
