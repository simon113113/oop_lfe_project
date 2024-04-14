/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tahmina;

/**
 *
 * @author Admin
 */


public class Student {
    private String studentId;
    private String studentName;
    private String email;
    private String contact;

    public Student(String studentId, String studentName, String email, String contact) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.email = email;
        this.contact = contact;
    }

    // Getters and setters for the properties
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
