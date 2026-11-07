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
}
