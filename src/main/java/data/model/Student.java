package data.model;

public class Student {
    private Integer studentId;
    private String studentName;

    public Student() {
    }

    public Integer getStudentId() {
        studentId = 3;
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        studentName = "dcj";
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
