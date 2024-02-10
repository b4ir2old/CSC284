import java.util.ArrayList;

public class ParticipationList {

   public static void main(String[] args) {
      
      ArrayList<String> students = new ArrayList<>(); // Changed to ArrayList<String>
      
      // Add student names
      students.add("Colson Dunlap");
      students.add("John Doe");
      students.add("Joseph Burke");
     
      // Sort the list alphabetically
      students.sort(String::compareTo);
      
      // Print the list of students
      for (String student : students) {
         System.out.println(student);
      }
   }
}
