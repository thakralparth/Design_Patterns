package Prototype;

public class Student implements Prototype<Student>{
    private int age;
    private String name;
    private double psp;
    private String email;


    // below attributes would bbe same for all the students
    private String batch;
    private double avgBatchPsp;
    // query to fetch
    // select avg(psp) from Students group by batch_id having batch_id = 'xyz';
    // if we create object of this student 150 times , this query would have to run 150 times which s heavy compute

    //sol : execute this query once , store it in a Prototype object and then fetch student back


    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setAvgBatchPsp(double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }

    @Override
    public Student clone() {
        Student copy = new Student();
        copy.name = this.name;
        copy.age = this.age;
        copy.psp = this.psp;
        copy.email = this.email;
        copy.batch = this.batch;
        copy.avgBatchPsp = this.avgBatchPsp;
        return copy;
    }
}

