package ListsAndSet;

import java.util.*;

public class School {
    private List<Student> studentsList = new ArrayList<>();
 public void addStudent(Student student) {

     studentsList.add(student);

 }

    @Override
    public String toString() {
        return "School{" +
                "studentsList=" + studentsList +
                '}';
    }

    public void removeStudent(Student student){

     studentsList.remove(student);
    }
}