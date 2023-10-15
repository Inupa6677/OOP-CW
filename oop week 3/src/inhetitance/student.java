package inhetitance;

public class student extends person{
    private String studentId;
    int age;

    public student(String firstName, String studentId){
        super(firstName);
        this.firstName = firstName;
    }
    public student(String lastName, int age ){
        super(lastName);
        this.lastName = lastName;
    }

}
