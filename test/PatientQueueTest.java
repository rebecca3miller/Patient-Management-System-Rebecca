import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PatientQueueTest {
    @Test
    public void testAddPatient() {
        PatientQueue queue = new PatientQueue();

        Patient patient = new Patient(101, "Sarah", "Headache");

        queue.enqueue(patient);

        assertFalse(queue.isEmpty());
    }

    @Test
    public void testRemovePatient() {
        PatientQueue queue = new PatientQueue();

        Patient patient1 = new Patient(101, "Sarah", "Headache");
        Patient patient2 = new Patient(102, "John", "Back Pain");

        queue.enqueue(patient1);
        queue.enqueue(patient2);

        Patient removedPatient = queue.dequeue();

        assertEquals(101, removedPatient.getPatientId());
    }

    @Test
    public void testEmergePatient() {
        PatientQueue queue = new PatientQueue();

        Patient patient1 = new Patient(101, "Sarah", "Headache");
        Patient patient2 = new Patient(102, "John", "Back Pain");
        Patient emergency = new Patient(103, "Emma", "Emergency");

        queue.enqueue(patient1);
        queue.enqueue(patient2);

        queue.insertEmergency(emergency, 1);

        Patient firstPatient = queue.dequeue();

        assertEquals(103, firstPatient.getPatientId());
    }
}
