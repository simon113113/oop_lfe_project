package tahmina;

public class Management {
    public String studentId;
    public String stuName;
    public String email;
    public String contact;

    public Management(String studentId, String stuName, String email, String contact) {
        this.studentId = studentId;
        this.stuName = stuName;
        this.email = email;
        this.contact = contact;
    }

    // Getter methods should also be public
    public String getStudentId() {
        return studentId;
    }

    public String getStuName() {
        return stuName;
    }

    public String getEmail() {
        return email;
    }

    public String getContact() {
        return contact;
    }
}
