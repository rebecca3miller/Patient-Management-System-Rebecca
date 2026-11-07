public class Patient {

    private int patientId;
    private String name;
    private String reasonForVisit;

    // Constructor
    public Patient(int patientId, String name, String reasonForVisit) {
        this.patientId = patientId;
        this.name = name;
        this.reasonForVisit = reasonForVisit;
    }

    // Getters
    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public String getReasonForVisit() {
        return reasonForVisit;
    }

    // Setters
    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReasonForVisit(String reasonForVisit) {
        this.reasonForVisit = reasonForVisit;
    }

    // Display patient info
    public String toString(){
        return "Patient ID:" + patientId + " Name:" + name + " Reason For Visit:" + reasonForVisit;
    }
}
