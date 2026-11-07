public class PatientQueue {

    private Patient[] queue =  new Patient[100];
    private int front = 0;
    private int rear = -1;
    private int size = 0;

    // Check if queue is empty
    public boolean isEmpty(){
        return size == 0;
    }

    // Check if queue is full
    public boolean isFull(){
        return size == queue.length;
    }

    // Add patient to queue
    public void enqueue(Patient patient){
        if (isFull()){
            System.out.println("Patient Queue is full");
        } else {
            rear = (rear + 1) % queue.length;
            queue[rear] = patient;
            size++;
            System.out.println("Patient added to queue");
        }
    }

    // Remove next patient from queue
    public Patient dequeue(){
        if (isEmpty()){
            System.out.println("Patient Queue is empty");
            return null;
        } else {
            Patient patient = queue[front];
            queue[front] = null;
            front = (front + 1) % queue.length;
            size--;
            return patient;
        }
    }

    // Display patients waiting
    public void displayQueue(){
        if (isEmpty()){
            System.out.println("Patient Queue is empty");
        } else {
            for (int i=0; i<size; i++){
                int index = (front + i) % queue.length;
                System.out.println(queue[index]);
            }
        }
    }

    // Insert emergency patient at a specific position
    public void insertEmergency(Patient patient, int position){
        if (isFull()){
            System.out.println("Patient Queue is full");
            return;
        }
        if (position < 1 || position > size + 1) {
            System.out.println("Invalid position");
            return;
        }

        // Move patients to make room
        for (int i = size; i >= position; i--) {
            int currentIndex = (front + i) % queue.length;
            int previousIndex = (front + i - 1) % queue.length;

            queue[currentIndex] = queue[previousIndex];
        }

        // Insert emergency patient
        int index = (front + position - 1) % queue.length;
        queue[index] = patient;

        size++;
        rear = (front + size - 1) % queue.length;

        System.out.println("Emergency patient added to position " + position);
    }
}
