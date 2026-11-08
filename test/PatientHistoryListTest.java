import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PatientHistoryListTest {
    @Test
    public void testHistoryNavigation() {

        PatientHistoryList historyList = new PatientHistoryList();

        PatientHistory history1 = new PatientHistory("2025-01-10", "Flu", "Rest and fluids");
        PatientHistory history2 = new PatientHistory("2025-02-15", "Migraine", "Prescribed medication");

        historyList.addHistory(history1);
        historyList.addHistory(history2);

        assertEquals(history1, historyList.head.history);
        assertEquals(history2, historyList.tail.history);

        assertEquals(history2, historyList.head.next.history);
        assertEquals(history1, historyList.tail.prev.history);
    }
}
