package Prototype;

public class IntelligentStudent extends Student{
    private int iq;

    // Note: Always make sure that child classes override the clone method.
    // Else client might get object with parallel data
    public IntelligentStudent(){}

    public IntelligentStudent(IntelligentStudent originalIntelligentStudent){
        super(originalIntelligentStudent);
        this.iq= originalIntelligentStudent.iq;
    }

    @Override
    public IntelligentStudent clone() {
        //attributes in parent class are private , so we can't acess them from here
        // Also, we don't have getters in parent class

        // if we do super.clone() it will return clone of Student and not IntelligentStudent

        //Correct approach -> Copy Constructor
        return new IntelligentStudent(this);
//        return super.clone();
    }

    public void setIq(int iq){
        this.iq=iq;
    }
}
