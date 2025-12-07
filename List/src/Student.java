/*
 * Create a List of custom objects (Student class).
 * Why is this used in real-time projects?
 *
 * Why used?
 * In real applications we store:
 * - DTOs
 * - Entities
 * - API Responses
 * 
 * And all these are returned in:
 * List<User>, List<Employee>, List<Student>, etc.
 *
 * Example: Spring Boot REST APIs typically return List<Entity>.
 */

import java.util.ArrayList;
import java.util.List;

// Custom class (file name should be Student.java)
public class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " (" + age + ")";
    }
}

// Only ONE public class allowed per file → this must be non-public
class List5 {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student("Akash", 25));
        list.add(new Student("Samidha", 27));
        list.add(new Student("Yogita", 24));

        System.out.println(list);
    }
}
