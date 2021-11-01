import Database.Student;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Xenon {
    
    public static void main(String[] args) {
        
        
        StudentsRepository studentsRepository = new StudentsRepository();
        List<Student> studentList = studentsRepository.getStudents();
        List<String> studentNames = studentList.stream().map(Student::getName).collect(Collectors.toList());
        System.out.println(studentNames);
       getFemaleStudents(studentList).forEach(student -> System.out.println(student.getName()));

        System.out.println("Sum of student Ages: -->"+getSumOfAges(studentList));

        System.out.println("Sum of student Ages: -->"+getSumOfAge2(studentList));


        System.out.println("Oldest Student: ----> "+ getOldestStudent(studentList));

        System.out.println("Longest Name: ----> "+ longestName(studentList));

        
        System.out.println("Average Age of female students : ->"+ studentList.stream()
                .filter(student -> student.getSex().equals(Student.Gender.FEMALE))
                .map(Student::getAge).mapToInt(Integer::intValue)
                .average()
                .getAsDouble());

        System.out.println("Oldest Female Student :->"+studentList.stream().filter(student -> student.getSex().equals(Student.Gender.FEMALE)).map(Student::getAge).reduce(Integer::max).get());
        IntStream intStream = IntStream.range(2,30);
              System.out.println(intStream.noneMatch(Objects::nonNull));
        
        
        
                
    }



    static List<Student> getFemaleStudents(List<Student> studentList){

        return  studentList.stream().filter(student -> student.getSex()
                .equals(Student.Gender.FEMALE))
                .collect(Collectors.toList());


    }
    //----Parralt
    static Integer getSumOfAges(List<Student> studentList){        
        return studentList.stream().mapToInt(Student::getAge).sum();
    }

    static Integer getSumOfAge2(List<Student> studentList){
        return studentList.stream().map(Student::getAge).reduce(0,(a,b) -> a + b);
    }
    
    
    static Student getOldestStudent(List<Student> studentList){
        
        Integer max_age = studentList.stream().map(Student::getAge).reduce(Integer::max).get();
        
        return studentList.stream().filter(student -> student.getAge() == max_age).findAny().get() ;
    }

    static Student getOldestStudent2(List<Student> studentList){

        return studentList.stream().filter(student -> student.getAge() == studentList.stream().map(Student::getAge).reduce(0,(a,b)-> a > b ? a : b)).findAny().get() ;
    }
    
    
    static String longestName(List<Student> studentList){
        
        return studentList.stream().map(Student::getName).reduce((a,b) -> a.length() > b.length() ? a:b).get();
    }
  
}
