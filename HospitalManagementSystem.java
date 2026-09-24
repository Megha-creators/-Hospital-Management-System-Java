import java.util.ArrayList;
import java.util.Scanner;

public class HospitalManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Patient> patients = new ArrayList<>();

        while (true) {

            System.out.println("\n===== Hospital Management System =====");
            System.out.println("1. Add Patient");
            System.out.println("2. Display Patients");
            System.out.println("3. Search Patient");
            System.out.println("4. Delete Patient");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Patient ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Patient Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Disease: ");
                    String disease = sc.nextLine();

                    patients.add(new Patient(id, name, age, disease));
                    System.out.println("Patient Added Successfully!");
                    break;

                case 2:
                    if (patients.isEmpty()) {
                        System.out.println("No Patients Found.");
                    } else {
                        for (Patient p : patients) {
                            p.display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Patient ID to Search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (Patient p : patients) {
                        if (p.patientId == searchId) {
                            p.display();
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Patient Not Found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Patient ID to Delete: ");
                    int deleteId = sc.nextInt();

                    patients.removeIf(p -> p.patientId == deleteId);
                    System.out.println("Patient Deleted Successfully!");
                    break;
                 case 5:
                     System.out.println("Total Patients: " + patients.size());
                    break;
                  case 6:
                      System.out.print("Enter Patient ID to Update: ");
                      int updateId = sc.nextInt();
                       sc.nextLine();

                        boolean updated = false;

                    for (Patient p : patients) {
                         if (p.patientId == updateId) {

            System.out.print("Enter New Name: ");
            p.patientName = sc.nextLine();

            System.out.print("Enter New Age: ");
            p.age = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter New Disease: ");
            p.disease = sc.nextLine();

            updated = true;
            System.out.println("Patient Updated Successfully!");
            break;
        }
    }

    if (!updated) {
        System.out.println("Patient Not Found!");
    }
    break;
   
                case 7:
                    System.out.println("Thank You!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
