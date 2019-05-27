package ua.lviv.iot.main;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

    private String firstName;
    private String lastName;
    private String enrollment;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private Integer id;
    

    public Student() {
    }
    public Student(String firstName, String lastName, String enrollment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.enrollment = enrollment;
    }
    @Override
    public String toString() {
        return "Student [firstName=" + firstName + ", lastName=" + lastName + ", enrollment=" + enrollment + "]";
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEnrollment() {
        return enrollment;
    }
    public void setEnrollment(String enrollment) {
        this.enrollment = enrollment;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    
}
