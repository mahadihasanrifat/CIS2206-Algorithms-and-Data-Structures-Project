package Week7Practical11;

public class Student implements Comparable<Student>{


    //String variable for Student ID
    private String studentID;

    //Constructor for the Student class. Initializes the studentID field with the value passed as an argument.
    public Student(String studentID) {
        this.studentID = studentID;
    }


    // Getter for the studentID variable
    public String getStudentID() {
        return studentID;
    }

    // Setter for the studentID variable
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    // Returns a human friendly representation of a Student object
    @Override
    public String toString() {
        return "Student ID = '" + studentID + '\'';
    }


    /*
    Compares the studentID variable of the current Student object
    to the studentID variable of another Student object passed as
    an argument and returns the result of the comparison as an int.
    */
    @Override
    public int compareTo(Student student) {
        return this.studentID.compareTo((student.studentID));
    }
}
