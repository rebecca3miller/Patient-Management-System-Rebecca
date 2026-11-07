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

    // Display patients in the list
    public void displayPatients() {
        if (isEmpty()) {
            System.out.println("Patient list is empty");
        } else {
            PatientNode tempNode = head;

            while (tempNode != null) {
                System.out.println(tempNode.patient);
                tempNode = tempNode.next;
            }
        }
    }

    // Display patients backwards
    public void displayPatientsBackward() {
        if (isEmpty()) {
            System.out.println("Patient list is empty");
        } else {
            PatientNode tempNode = tail;

            while (tempNode != null) {
                System.out.println(tempNode.patient);
                tempNode = tempNode.prev;
            }
        }
    }
}
