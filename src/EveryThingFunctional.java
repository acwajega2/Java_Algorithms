import Database.Student;

import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

import static Database.Student.Gender.*;

public class EveryThingFunctional {
    
    public static void main(String[] args){
        //-------------> Function Interfaces--
        
        StudentsRepository studentsRepository = new StudentsRepository();
        
        //-----------> We get the list of students----
        List<Student> studentList = studentsRepository.getStudents();

        Predicate<Student> studentPredicate = student -> MALE.equals(student.getSex());
        
        List<Student> maleStudents = studentList.stream()
                .filter(studentPredicate)
                .collect(Collectors.toList());
        Predicate<Student> studentPredicate1 = student -> FEMALE.equals(student.getSex());
        
        List<Student> femaleStudents = studentList.stream().filter(studentPredicate1).collect(Collectors.toList());
        
        //------------> declative
        maleStudents.forEach(student -> greatStudents(student));
        
        //---------imperative
        maleStudents.forEach(student -> studentConsumer.accept(student));

        //---------imperative2
        maleStudents.forEach(student -> bistudentConsumer.accept(student,2));
        
        //------------> is abouve 15 predicate
        maleStudents.forEach(student -> System.out.println(isAbove18Predicate.test(student) ? student.getName()+ " is above 15 years" : student.getName() +" is below 15 years"));


        //----------------FUNCTIONS
        Integer result = incrementFunction.andThen(multipltFunction).apply(2);
        System.out.println(result);
        
        
        //---------------BI FUNCTIONS---
        Integer result2 = addThenMultiply.apply(1, 2);
        System.out.println(result2);

        

    }
    
    
    //------------------> display customers-------------
    static void greatStudents(Student student){
        System.out.println("Hello "+student.getName()+" is a male student");    
    }
    
    
    //-----------------> end ----------------------

    
    //--------------> FUNCTION INTERFACES
    /***
     * These take one input and produces once output
     * **/
    static Function<Integer,Integer> incrementFunction = number -> number + 2;

    static Function<Integer,Integer> multipltFunction = number -> number * 2;
    
    
    //-------------BI FUNCTIONS
    /***
     * These take two inputs and produces one output
     * **/
    
    static BiFunction<Integer,Integer,Integer> addThenMultiply = (numberToAdd,numberTomultiply) -> (numberToAdd + 2) * numberTomultiply;
    
    
    
    //--------------> CONSUMER
    /***
     * Takes one input and produces no output
     * **/
    static Consumer<Student> studentConsumer = student -> System.out.println("Hello "+student.getName()+" is a male student");


    //--------------> BI CONSUMER
    /***
     * Takes two inputs and produces no output
     * **/
    static BiConsumer<Student,Integer> bistudentConsumer = (student,ageincrement) -> System.out.println("Hello "+student.getName()+" is a male student, Age:"+student.getAge() * ageincrement);



    //--------------> PEDICATE
    /***
     * Takes two inputs and produces no output
     * **/
    static Predicate<Student> isAbove18Predicate = student -> student.getAge() > 14;


    //--------------> SUPPLIER
    /***
     * Takes two inputs and produces no output
     * **/


    /***
     * 
     * 
     * We shall run our test from hia
     * 
     * 
     * **/
    public static void TestingArea(){
        
    }
    
    
    
}
