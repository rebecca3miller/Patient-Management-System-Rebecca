public class Main {

    public static void main(String[] args) {

        // Create patient queue
        PatientQueue patientQueue = new PatientQueue();

        // Creating patients
        Patient patient1 = new Patient(1, "Sarah", "Headache");
        Patient patient2 = new Patient(2, "John", "Back Pain");
        Patient patient3 = new Patient(3, "Emma", "Stomach Pain");

        // Add patients to queue
        patientQueue.enqueue(patient1);
        patientQueue.enqueue(patient2);
        patientQueue.enqueue(patient3);

        // Display waiting patients
        System.out.println("\nPatients Waiting:");
        patientQueue.displayQueue();

        // Remove first patient
        System.out.println("\nNext Patient:");
        System.out.println(patientQueue.dequeue());

        // Display remaining patients
        System.out.println("\nRemaining Patients:");
        patientQueue.displayQueue();

        // Test Doubly Linked List
        System.out.println("\nDoubly Linked List");

        PatientDoublyLinkedList patientList = new PatientDoublyLinkedList();

        // Add patients to the list
        patientList.addPatient(new Patient(4, "Claire", "Nausea"));
        patientList.addPatient(new Patient(5, "Sarah", "Cold"));
        patientList.addPatient(new Patient(6, "John", "Fever"));

        // Display patients
        System.out.println("\nPatients in the list:");
        patientList.displayPatients();

        // Display patients backwards
        System.out.println("\nPatients in reverse order:");
        patientList.displayPatientsBackward();

        // Remove patient from the list
        System.out.println("\nRemoving Patient ID 5:");
        patientList.removePatient(5);

        // Display remaining patient in the list
        System.out.println("\nRemaining Patients:");
        patientList.displayPatients();

        // Display patients backwards
        System.out.println("\nRemaining patients in reverse order:");
        patientList.displayPatientsBackward();

        // Remove the first patient
        System.out.println("\nRemoving Patient ID 4:");
        patientList.removePatient(4);

        // Display remaining patient in the list
        System.out.println("\nRemaining Patients:");
        patientList.displayPatients();

        // Remove the last patient
        System.out.println("\nRemoving Patient ID 6:");
        patientList.removePatient(6);

        // Checking if list is empty
        System.out.println("\nPatients after removal");
        patientList.displayPatients();

        // Test removing a patient that does not exist
        System.out.println("\nRemoving Patient ID 10:");
        patientList.removePatient(10);

        // Add a new patient after the list is empty
        System.out.println("\nAdding new patient:");

        Patient patient7 = new Patient(7, "Sarah", "Headache");}
}