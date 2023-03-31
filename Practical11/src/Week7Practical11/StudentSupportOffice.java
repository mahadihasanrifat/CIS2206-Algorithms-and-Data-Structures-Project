package Week7Practical11;

public class StudentSupportOffice {
    public static void main(String[] args) {

        // Create five Student objects
        Student student1 = new Student("U0000001");
        Student student2 = new Student("U0000002");
        Student student3 = new Student("U0000003");
        Student student4 = new Student("U0000004");
        Student student5 = new Student("U0000005");

        // Create three Module objects
        Module CIS2206 = new Module("CIS2206");
        Module CIS2360 = new Module("CIS2360");
        Module CIS2205 = new Module("CIS2205");


        // Enroll students in the modules CIS2206
        CIS2206.EnrolledStudent(student1);
        CIS2206.EnrolledStudent(student5);

        // Enroll students in the modules CIS2360
        CIS2360.EnrolledStudent(student1);
        CIS2360.EnrolledStudent(student3);
        CIS2360.EnrolledStudent(student4);

        // Enroll students in the modules CIS2205
        CIS2205.EnrolledStudent(student2);
        CIS2205.EnrolledStudent(student4);
        CIS2205.EnrolledStudent(student5);

        // Print the list of enrolled students before making changes
        System.out.println("Student before Change" + "\n\n" + CIS2206 + "\n" + CIS2360 + "\n" + CIS2205);
        System.out.println("\n----------x----------\n");

        // Unenroll students in the modules CIS2206
        CIS2206.unenrollStudent(student5);
        // Enroll students in the modules CIS2206
        CIS2206.EnrolledStudent(student3);
        CIS2206.EnrolledStudent(student4);

        // Enroll students in the modules CIS2360
        CIS2360.EnrolledStudent(student2);
        CIS2360.EnrolledStudent(student5);


        // Unenroll students in the modules CIS2205
        CIS2205.unenrollStudent(student2);
        CIS2205.unenrollStudent(student5);

        // Enroll students in the modules CIS2205
        CIS2205.EnrolledStudent(student1);
        CIS2205.EnrolledStudent(student3);

        // Print the list of enrolled students after making changes
        System.out.println("Student after Change" + "\n\n" + CIS2206 + "\n" + CIS2360 + "\n" + CIS2205);



    }
}



