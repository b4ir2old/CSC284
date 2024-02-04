import java.util.ArrayList;

// Assuming Student class definition here
class Student {
    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}

public class ParticipationList {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        // TODO: Create a Student Object with your first and last name and add them to the students list
        students.add(new Student("Colson", "Dunlap"));
        students.add(new Student("John", "Doe"));

        // Sort the list by last name
        students.sort((o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));

        // Print the list of students
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
