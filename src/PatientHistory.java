public class PatientHistory {

    private String visitDate;
    private String diagnosis;
    private String treatmentNotes;

    // Constructor
    public PatientHistory(String visitDate, String diagnosis, String treatmentNotes) {
        this.visitDate = visitDate;
        this.diagnosis = diagnosis;
        this.treatmentNotes = treatmentNotes;
    }

    // Display patient history
    public String toString() {
        return "Visit Date:" + visitDate + " Diagnosis:" + diagnosis + " Treatment Notes:" + treatmentNotes;
    }
}
