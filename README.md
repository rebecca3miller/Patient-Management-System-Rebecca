# Patient Management System


## Project Overview
For this project, I created a Patient Management System using Java. The
program uses a Queue to manage patients in a waiting room and a Doubly
Linked List to store patient history records.
The waiting room allows patients to be added, served in order, and inserted at a
specific position in case of an emergency. The patient history system allows
users to view the oldest and newest records and move forward or backward
through the history.
I also created an interactive menu using Scanner so users can interact with the
program. I used JUnit 5 to test the main features and make sure they work
correctly.


## Part 1 - Patient Waiting Room (Queue)
### Why was a Queue appropriate for the waiting room?
A Queue is appropriate for a patient waiting room because it allows patients to be
served in the order they arrive. This helps keep the waiting room organized and
makes sure patients are treated fairly.
In my program, patients are added to the back of the queue and removed from
the front when they are served. I also added a feature that allows emergency
patients to be inserted at a specific position when they need to be seen sooner.


### Explain the FIFO principle
FIFO stands for First In, First Out. This means that the first patient added to the
queue will be the first patient removed and served.
For example, if John enters the waiting room before Emma, John will normally be
served first. My program follows this principle using the enqueue() method to add
patients and the dequeue() method to remove them.


### What could happen if a Stack was used instead of a Queue?
If a Stack was used instead of a Queue, patients would be served using the LIFO
(Last In, First Out) principle.

This means the most recently added patient would be served first, while patients
who arrived earlier could end up waiting much longer.
This would not be a fair way to manage a waiting room because patients should
normally be served in the order they arrive, unless there is an emergency.


### How could this system be improved?
There are a few ways I could improve this system in the future:
- Add a priority system based on how urgent a patient's condition is.
- Allow users to search for patients using their patient ID.
- Add estimated waiting times for patients.
- Save patient information to a database so it is not lost when the program
  closes.
- Add input validation to prevent incorrect information from being entered.
- Create a graphical user interface to make the system easier to use.
  These improvements would make the program more useful in a real healthcare
  environment.


## Part 2 - Patient History (Doubly Linked List)
### Why is a Doubly Linked List appropriate for patient history?
A Doubly Linked List is appropriate for patient history because it allows records
to be accessed in both directions.
Each node contains a patient history record and two references called next and
prev. These references connect the records together.
In my program, users can view the oldest or newest history record and navigate
forward or backward through previous visits.
This makes it easier to review a patient's history without having to start from the
beginning every time.


### What would happen if the next and previous pointers were not updated
correctly?
If the next and previous pointers were not updated correctly, the Doubly Linked
List could become disconnected or stop working properly.

For example, if the next pointer was not updated when adding a record, the
program might not be able to move forward to that record.
If the previous pointer was incorrect, the program might not be able to navigate
backward properly.
This could cause records to become inaccessible or cause errors when moving
through the list.


### Why use a Doubly Linked List instead of an Array or ArrayList?
A Doubly Linked List works well for this project because it allows records to be
connected and accessed in both directions using next and prev references.
Unlike a regular Array, a Doubly Linked List does not need a fixed size. It can
grow as new records are added.
An ArrayList can also grow and allows access to records by index, but inserting
or removing records in the middle may require other elements to be shifted.
A Doubly Linked List can insert or remove nodes without shifting other records,
as long as the correct node is already located.
For this project, I chose a Doubly Linked List because it demonstrates how
records can be connected and navigated forward and backward.


## Part 3 - Program Features
### Patient Waiting Room
The program allows users to:
- Add a new patient to the waiting queue.
- Serve and remove the next patient.
- Insert an emergency patient at a chosen position.
- Display all patients currently waiting.
- Handle situations where the queue is empty.


### Patient History
The program also allows users to:

- Store patient history records containing a visit date, diagnosis, and treatment
  notes.
- Store at least 10 sample history records.
- Display the oldest history record.
- Display the newest history record.
- Move to the next history record.
- Move to the previous history record.
- Prevent navigation beyond the oldest or newest record.


### Interactive Menu
I used Scanner and a switch statement to create a menu that allows users to
select different options.
The menu continues running until the user chooses to exit the program.


## Part 4 - Unit Testing
I used JUnit 5 to test the main features of my Patient Management System.
### Test 1 - Add Patient
Method: testAddPatient()
This test checks that a patient can be successfully added to the waiting queue
using the enqueue() method.
It verifies that the queue contains the patient after they are added.
### Test 2 - Remove Patient
Method: testRemovePatient()
This test checks that patients are removed from the queue in the correct order.
It adds patients to the queue and then uses dequeue() to verify that the first
patient added is the first one removed.
This confirms that the FIFO principle is working correctly.
### Test 3 - Emergency Patient
Method: testEmergePatient()

This test checks that an emergency patient can be inserted at a specific position
in the waiting queue.
It verifies that the emergency patient is placed in the correct order and can be
served when expected.
### Test 4 - Patient History Navigation
Method: testHistoryNavigation()
This test checks that patient history records are connected correctly in the
Doubly Linked List.
It verifies that the head and tail contain the expected records and checks the next
and previous references between nodes.
This helps confirm that the Doubly Linked List is linked correctly in both
directions.


### Testing Results
The unit tests were run using IntelliJ IDEA and JUnit 5.
All four tests passed successfully after correcting the history navigation test
assertions.
These tests helped confirm that the main queue operations and Doubly Linked
List connections work as expected.


## Part 5 - How to Run the Program
1. Open the Patient Management System project in IntelliJ IDEA.
2. Make sure the Java Development Kit (JDK) is configured.
3. Open Main.java inside the src folder.
4. Run the Main class.
5. Follow the menu displayed in the console.
6. Enter a number to select an option.
7. Enter 0 to exit the program.
## Conclusion

This project helped me understand how Queues and Doubly Linked Lists work in
Java.
I learned how to use the FIFO principle to manage a waiting room and how to
connect nodes using next and previous references.
I also gained more experience creating interactive menus, organizing code into
separate classes, and using JUnit tests to check my program.
Overall, this project helped me better understand how different data structures
can be used to solve real-world problems.