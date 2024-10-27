# CS320-Portfolio
The main approach of designing this type of system was the implementation of CRUD operations like create, read, update, delete. I wrote a special unit test to make sure that data integrity and consistency is maintained. For contact service testing, I made sure to test edge cases like updating the nonexistent contacts and even trying to add duplicate contacts. The overall quality of my J unit test was measured by the coverage percentage gained. To improve, I will focus on developing edge cases for invalid input and boundary testing for the contact fields.
The Contact service was a type of class which I designed to manage contact data to allow users to create, update and delete their contacts by unique IDs. I made sure to test the operations for appointments to be CRUD specific with valid IDs. The testing strategy made it closely aligned with the requirement because each test case directly reflected the expected behavior that was from the software. For example, when it came to testing the length of the task name, I made sure that tasks with name longer than the allowed characters were automatically rejected by the system.
The Contact, Task, and Appointment services were made for one application, not 3 separate applications. By understanding the complexity of the relationships between task and appointment services, I took extra steps to ensure that I made a test which covered various interaction issues. I intentionally wrote a special test design to challenge my own code. One of the mindsets I have developed is to avoid technical debt by making sure rigorous testing standards are part of employing any type of automated software for excellent quality.
