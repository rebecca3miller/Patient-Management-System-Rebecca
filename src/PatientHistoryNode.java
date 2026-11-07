public class PatientHistoryNode {

    PatientHistory history;
    PatientHistoryNode next;
    PatientHistoryNode prev;

    // Constructor
    public PatientHistoryNode(PatientHistory history) {
        this.history = history;
        this.next = null;
        this.prev = null;
    }

}
