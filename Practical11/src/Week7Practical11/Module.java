package Week7Practical11;

import java.util.Arrays;

public class Module {

    // The moduleID variable represents the unique identifier for this module
    private String moduleID;
    // The classList variable stores the students enrolled in this module
    private Student[] classList;
    // The currentSize variable stores the current number of students enrolled in the module
    int currentSize;

    // The Module constructor initializes the moduleID field and creates an empty list of students
    public Module(String moduleID) {
        this.moduleID = moduleID;
        this.classList = new Student[5];
        this.currentSize = 0;
    }

    // The EnrolledStudent method adds a student to the classList array if they are not already enrolled
    public void EnrolledStudent(Student student) {
        // Check if the student is already enrolled
        for (int index = 0; index < currentSize; index++) {
            if (classList[index].getStudentID().equals(student.getStudentID())) {
                // If the student is already enrolled, print an error message and return
                System.out.println("\nError during enrollment\nStudent enrolled already\n\n");
                return;
            }
        }
        // If the student is not already enrolled, add them to the classList array and increase the currentSize
        classList[currentSize] = student;
        currentSize++;
        // Sort the classList array so that the students are listed in alphabetical order by ID
        Arrays.sort(classList, 0, this.currentSize);
    }


    // The unenrollStudent method removes a student from the classList array
    public void unenrollStudent(Student studentID) {
        // Search for the student in the classList array
        for (int index = 0; index < classList.length; index++) {
            // If the student is found, remove them from the array by setting their element to null
            if (String.valueOf(classList[index]).equals(String.valueOf(studentID))) {
                classList[index] = null;
                currentSize--;
                break;
            }
        }

        // Create a temporary array to store the non-null elements of the classList array
        int tempSize = 0;
        Student[] temp = new Student[classList.length];
        for (int index = 0; index < classList.length; index++) {
            if (classList[index] != null) {
                temp[tempSize] = classList[index];
                tempSize++;
            }
        }
        // Copy the elements from the temporary array back into the classList array
        for (int index = 0; index < classList.length; index++) {
            classList[index] = temp[index];
        }
    }


    // The toString method returns a string representation of the Module object
    @Override
    public String toString() {
        // Create a StringBuilder object to build the string representation of the Module object
        StringBuilder Module = new StringBuilder("Module " + moduleID + " \nEnrolled Students:\n");
        // Append the string representation of each enrolled student to the Module string
        for (Student enrolledStudent : classList) {
            // Skip null elements in the classList array
            if (enrolledStudent == null) {
                continue;
            } else {
                // Append the string representation of the enrolled student to the Module string
                Module.append(enrolledStudent).append("\n");
            }
        }
        // Return the completed Module string
        return Module.toString();
    }
}