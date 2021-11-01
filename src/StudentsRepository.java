import Database.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static Database.Student.Gender.*;
  


public class StudentsRepository {
    public List<Student> getStudents(){            
        List<Student> students = new ArrayList<>();
        Map<String,Integer> marks = new HashMap<>();       
        students.add(new Student("Allan", MALE ,14,"Anglican"));
        students.add(new Student("Chris",MALE,19,"Anglican"));
        students.add(new Student("Jane",FEMALE,14,"SDA"));
        students.add(new Student("Mary",FEMALE,11,"Catholic"));
        students.add(new Student("Sumaya",FEMALE,17,"Moslem"));
        students.add(new Student("Fred",MALE,13,"Anglican"));
        students.add(new Student("Lisa",FEMALE,14,"Catholic"));
        students.add(new Student("Ali",MALE,12,"Moslem"));      
        return students;
    }
    
    
    
}
