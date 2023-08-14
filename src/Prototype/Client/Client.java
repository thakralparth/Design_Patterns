package Prototype.Client;

import Prototype.Student;
import Prototype.StudentRegistry;

public class Client {
    public static final String APR_22 = "APR_22";

    public static void main(String[] args) {
        StudentRegistry registry = new StudentRegistry();
        fillRegistry(registry);


        Student roshan = registry.get(APR_22).clone();
        roshan.setAge(25);
        roshan.setEmail("abc@xyz.com");
        roshan.setName("Roshan");
        roshan.setPsp(95.23);
        System.out.println("DEBUG");
    }

    private static void fillRegistry(StudentRegistry registry) {
        //prototype object
        Student apr22 = new Student();
        apr22.setBatch("Apr 22");
        apr22.setAvgBatchPsp(89.88);

        registry.register(APR_22,apr22);


    }
}
