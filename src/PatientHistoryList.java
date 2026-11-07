public class PatientHistoryList {

    PatientHistoryNode  head;
    PatientHistoryNode tail;
    PatientHistoryNode current;
    int size;

    // Constructor
    public PatientHistoryList() {
        head = null;
        tail = null;
        current = null;
        size = 0;
    }

    // Check if history list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Add a new patient to history record
    public void addHistory(PatientHistory history) {
        PatientHistoryNode node = new PatientHistoryNode(history);

        if (isEmpty()) {
            head = node;
            tail = node;
        } else  {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        current = tail;
        size++;
    }

    // Move to the next patient history record
    public void nextRecord() {
        if (isEmpty()) {
            System.out.println("Patient History List is Empty");
        } else if (current.next == null) {
            System.out.println("Already at the newest record");
        } else {
            current = current.next;
            System.out.println(current.history);
        }
    }
}
