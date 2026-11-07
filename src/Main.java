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
    }
}
