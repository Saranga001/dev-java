import java.util.*;

// Student Class
class Student {
    int rollNo;
    String name;
    boolean isPresent;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
        this.isPresent = false; // default absent
    }
}

// Attendance Tracker
class AttendanceTracker {

    // Prevent duplicate roll numbers using Map
    private Map<Integer, Student> students = new HashMap<>();

    // Add Student
    public void addStudent(int rollNo, String name) {
        if (students.containsKey(rollNo)) {
            System.out.println("Duplicate roll number not allowed!");
            return;
        }
        students.put(rollNo, new Student(rollNo, name));
    }

    // Mark Attendance
    public void markPresent(int rollNo) {
        Student s = students.get(rollNo);
        if (s != null) {
            s.isPresent = true;
        } else {
            System.out.println("Student not found!");
        }
    }

    // Search Student
    public void searchStudent(int rollNo) {
        Student s = students.get(rollNo);
        if (s != null) {
            System.out.println("Found: " + s.rollNo + " - " + s.name + 
                               " - " + (s.isPresent ? "Present" : "Absent"));
        } else {
            System.out.println("Student not found!");
        }
    }

    // Print Present Students Sorted by Name
    public void printPresentStudents() {
        List<Student> presentList = new ArrayList<>();

        for (Student s : students.values()) {
            if (s.isPresent) {
                presentList.add(s);
            }
        }

        // Sort by name
        Collections.sort(presentList, (a, b) -> a.name.compareTo(b.name));

        System.out.println("\nPresent Students (Sorted by Name):");
        for (Student s : presentList) {
            System.out.println(s.rollNo + " - " + s.name);
        }
    }
}

// Main Class
public class studentattendence {
    public static void main(String[] args) {

        AttendanceTracker tracker = new AttendanceTracker();

        // Add Students
        tracker.addStudent(1, "Rahul");
        tracker.addStudent(2, "Ankit");
        tracker.addStudent(3, "Priya");

        tracker.addStudent(2, "Duplicate"); // ❌ duplicate check

        // Mark Attendance
        tracker.markPresent(1);
        tracker.markPresent(3);

        // Search
        tracker.searchStudent(2);
        tracker.searchStudent(5);

        // Print Present Students
        tracker.printPresentStudents();
    }
}

