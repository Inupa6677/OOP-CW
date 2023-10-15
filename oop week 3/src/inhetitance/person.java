package inhetitance;

public class person {
    String firstName;
    String lastName;
    private int age;

    public person(){ // default constructor

    }
    public person(String firstName){ // constructor with one variable constructor overloading
        this.firstName = firstName;

    }

    public person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
