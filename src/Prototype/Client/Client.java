package Prototype.Client;

import Prototype.IntelligentStudent;
import Prototype.Student;
import Prototype.StudentRegistry;

public class Client {
    public static final String APR_22 = "APR_22";
    public static final String INTELLIGENT_APR_22 = "INTELLIGENT_APR_22";

    public static void main(String[] args) {
        StudentRegistry registry = new StudentRegistry();
        fillRegistry(registry);


        Student roshan = registry.get(APR_22).clone();
        roshan.setAge(25);
        roshan.setEmail("abc@xyz.com");
        roshan.setName("Roshan");
        roshan.setPsp(95.23);
//        System.out.println("DEBUG");

        Student intelligentVikramStudent = registry.get(INTELLIGENT_APR_22).clone();
        // datatype is student in above line bcz registry returns Student only
        intelligentVikramStudent.setPsp(75);
        intelligentVikramStudent.setName("Vikram");
        intelligentVikramStudent.setEmail("text@xyz.com");

//        intelligentVikramStudent.setiq(120);
        // as datatype is student this won't work


//        Sol: type casting
//        IntelligentStudent intelligentStudent = (IntelligentStudent) intelligentVikramStudent;
//        intelligentStudent.setIq(120);


        System.out.println("DEBUG");
    }

    private static void fillRegistry(StudentRegistry registry) {
        //prototype object
        Student apr22 = new Student();
        apr22.setBatch("Apr 22");
        apr22.setAvgBatchPsp(89.88);

        registry.register(APR_22,apr22);

        IntelligentStudent intelligentapr22Student = new IntelligentStudent();
        intelligentapr22Student.setBatch("Apr 22");
        intelligentapr22Student.setAvgBatchPsp(89.88);


        registry.register(INTELLIGENT_APR_22,intelligentapr22Student);


    }
}
