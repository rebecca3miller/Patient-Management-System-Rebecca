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

    // Remove patient by ID
    public void removePatient(int patientId) {
        if (isEmpty()) {
            System.out.println("Patient list is empty");
            return;
        }

        PatientNode tempNode = head;

        while (tempNode != null) {
            if (tempNode.patient.getPatientId() == patientId) {

                if (tempNode == head) {
                    head = tempNode.next;
                }
                if (tempNode == tail) {
                    tail = tempNode.prev;
                }
                if (tempNode.prev != null) {
                    tempNode.prev.next = tempNode.next;
                }
                if (tempNode.next != null) {
                    tempNode.next.prev = tempNode.prev;
                }

                size--;
                System.out.println("Patient removed from the list");
                return;
            }
            tempNode = tempNode.next;
        }
        System.out.println("Patient not found");
    }
}
