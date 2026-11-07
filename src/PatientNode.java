public class PatientNode {

    Patient patient;
    PatientNode next;
    PatientNode prev;

    // Constructor
    public PatientNode(Patient patient) {
        this.patient = patient;
        this.next = null;
        this.prev = null;
    }
}
