import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

        Patient patient7 = new Patient(7, "Emily", "Stomach Pain");
        patientList.addPatient(patient7);

        // Display patients
        System.out.println("\nPatients in the list:");
        patientList.displayPatients();

        // Display patients backwards
        System.out.println("\nPatients in reverse order:");
        patientList.displayPatientsBackward();

        // Testing removing a patient that is not in the list
        System.out.println("\nRemoving Patient ID 99:");
        patientList.removePatient(99);

        // Test removing from an empty queue
        System.out.println("\nTesting empty queue:");

        PatientQueue testQueue = new PatientQueue();
        testQueue.dequeue();

        // Test filling the queue
        System.out.println("\nTesting full queue:");

        for (int i = 1; i <= 100; i++) {
            testQueue.enqueue(new Patient(i, "Patient" + i, "Checkup"));
        }

        // Adding one more patient
        System.out.println("\nAdding patient 101:");
        testQueue.enqueue(new Patient(101, "Patient101", "Checkup"));

        // Testing circular queue
        System.out.println("\nTesting circular queue:");

        // Remove two patients
        testQueue.dequeue();
        testQueue.dequeue();

        // Add two patients
        testQueue.enqueue(new Patient(102, "Mark", "Fever"));
        testQueue.enqueue(new Patient(103, "Abby", "Neck Pain"));

        System.out.println("\nPatients after adding:");
        testQueue.displayQueue();

        // Test emergency patient insertion
        System.out.println("\nTesting emergency patient insertion:");

        PatientQueue emergencyQueue = new PatientQueue();

        emergencyQueue.enqueue(new Patient(201, "Sarah", "Fever"));
        emergencyQueue.enqueue(new Patient(202, "John", "Checkup"));
        emergencyQueue.enqueue(new Patient(203, "Emily", "Headache"));

        // Insert emergency patient at position 2
        Patient emergencyPatient = new Patient(204, "Mark", "Emergency");
        emergencyQueue.insertEmergency(emergencyPatient, 2);

        // Display updated queue
        System.out.println("\nPatients after emergency insertion");
        emergencyQueue.displayQueue();

        // Create patient history list
        PatientHistoryList historyList = new PatientHistoryList();

        // Adding 10 patient history records
        historyList.addHistory(new PatientHistory("2025-01-10", "Flu", "Rest and fluids"));
        historyList.addHistory(new PatientHistory("2025-02-15", "Migraine", "Prescribed medication"));
        historyList.addHistory(new PatientHistory("2025-03-20", "Stomach pain", "Diet changes"));
        historyList.addHistory(new PatientHistory("2025-04-12", "Skin rash", "Topical cream"));
        historyList.addHistory(new PatientHistory("2025-05-18", "Eye irritation", "Eye drops"));
        historyList.addHistory(new PatientHistory("2025-06-22", "Checkup", "Routine checkup"));
        historyList.addHistory(new PatientHistory("2025-07-14", "Seasonal allergies", "Allergy medication"));
        historyList.addHistory(new PatientHistory("2025-08-09", "Headache", "Pain medication"));
        historyList.addHistory(new PatientHistory("2025-09-25", "Chest pain", "Respiratory therapy"));
        historyList.addHistory(new PatientHistory("2025-10-30", "Sinus infection", "Nasal spray and rest"));

        // Test oldest to newest records
        System.out.println("\nTesting Patient History:");

        historyList.displayOldest();
        historyList.displayNewest();

        // Testing navigation through patient history
        System.out.println("\nTesting history navigation:");

        historyList.displayOldest();

        // Move forward
        historyList.nextRecord();
        historyList.nextRecord();

        // Move backward
        historyList.prevRecord();

        // Testing history boundary conditions
        System.out.println("\nTesting history boundaries:");

        // Try moving before the oldest record
        historyList.displayOldest();
        historyList.prevRecord();

        // Try moving after the newest record
        historyList.displayNewest();
        historyList.nextRecord();

        // PATIENT MANAGEMENT SYSTEM MENU
        int choice = -1;

        while (choice != 0) {
            System.out.println("\n===== Patient Management System =====");
            System.out.println("1. Add Patient to Queue");
            System.out.println("2. Serve Next Patient");
            System.out.println("3. Insert Emergency Patient");
            System.out.println("4. Display Waiting Queue");
            System.out.println("5. Display Oldest History Record");
            System.out.println("6. Display Newest History Record");
            System.out.println("7. Next History Record");
            System.out.println("8. Previous History Record");
            System.out.println("0. Exit");

            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            // Handle menu choices
            switch (choice) {
                case 4:
                    patientQueue.displayQueue();
                    break;
                case 5:
                    historyList.displayOldest();
                    break;
                case 6:
                    historyList.displayNewest();
                    break;
                case 7:
                    historyList.nextRecord();
                    break;
                case 8:
                    historyList.prevRecord();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        System.out.println("Exiting Patient Management System...");
    }
}