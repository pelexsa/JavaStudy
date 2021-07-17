package objectStudy.universityScenario;

import java.util.ArrayList;

public class Course {
    int courseId;
    String courseName;
    String professorName;
    ArrayList<String> studentNames = new ArrayList<String>();

    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    //담당 교수 추가
    // {수업_이름}에 {교수_이름} 교수님이 추가되었습니다.
    public void addProfessor(String courseName, Professor professor) {
        this.courseName = courseName;
        this.professorName = professor.professorName;
        System.out.println(courseName + "에 " + this.professorName + " 교수님이 추가되었습니다.");
    }

    // 수강 학생이 추가된다.
    // {수업_이름}에 {학생_이름} 학생이 수강 신청하였습니다.
    public boolean addStudent(String studentName) {
        if (studentNames.isEmpty()) {
            studentNames.add(studentName);
            System.out.println(this.courseName + "에 " + studentName + " 학생이 수강 신청하였습니다.");
            return true;
        } else {
            if (studentNames.contains(studentName)) {
                return false;
            } else {
                studentNames.add(studentName);
                System.out.println(this.courseName + "에 " + studentName + " 학생이 수강 신청하였습니다.");
                return true;
            }
        }
    }
}
