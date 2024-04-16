/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tahmina;

/**
 *
 * @author Admin
 */
class Managementt {
     private String studentId;
    private String stuNmane;
    private String email;
    private String cintact;

    public Managementt(String studentId, String stuNmane, String email, String value3) {
        this.studentId = studentId;
        this.stuNmane = stuNmane;
        this.email = email;
        this.cintact = cintact;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStuNmane() {
        return stuNmane;
    }

    public void setStuNmane(String stuNmane) {
        this.stuNmane = stuNmane;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCintact() {
        return cintact;
    }

    public void setCintact(String cintact) {
        this.cintact = cintact;
    }
    
}
