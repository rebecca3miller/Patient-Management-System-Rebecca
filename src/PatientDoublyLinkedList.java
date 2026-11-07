public class PatientDoublyLinkedList {

    PatientNode head;
    PatientNode tail;
    int size;

    // Constructor
    public PatientDoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    // Check if list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Add patient to the end of the list
    public void addPatient(Patient patient) {
        PatientNode node = new PatientNode(patient);

        if (isEmpty()) {
            head = node;
            tail = node;
        } else  {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        size++;
    }
}
