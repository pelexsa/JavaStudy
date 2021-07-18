package objectStudy.universityScenario;

import java.util.ArrayList;
import java.util.List;

public class Student {
    int studentId;
    String studentName;
    String courseName;
    Major major;
    boolean courseAttend;
    List<Course> courses;
    int grade;

    public Student(int studentId, String studentName, Major major) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.major = major;
        courses = new ArrayList<Course>();
    }

    // 수강 학생 추가
    // 1. {학생_이름}님, {수업_이름} 수강 신청에 성공하였습니다.
    public void registrationCourse(Course registerCourse) {
        if (this.grade > 18) {
            System.out.println("학점 초과");
            return;
        }

        if (checkMajorCourse(registerCourse) == false) {
            return;
        }

        courseAttend = registerCourse.addStudent(this);
        if (courseAttend == true) {
            addGrade(registerCourse);
            System.out.println(this.studentName + "님, " + registerCourse.courseName + " 수강 신청에 성공하였습니다.");
        }
    }

    // 수강한 수업에 참여
    // 2. {학생_이름}이 {수업_이름}에 출석하였습니다.
    public void participationCourse(Course course) {
        System.out.printf("%s이 %s에 출석하였습니다.\n", studentName, course.courseName);
    }

    public int addGrade(Course registerCourse) {
        return this.grade += registerCourse.grade;
    }

    public boolean checkMajorCourse(Course registerCourse) {
        if (this.courses.size() < 3) {
            if (this.major.name == registerCourse.major.name) {
                courses.add(registerCourse);
            } else {
                return false;
            }
        } else {
            courses.add(registerCourse);
        }
        return true;
    }

    // 해당 학과의 3과목이상 듣지 않을 경우, 수강 신청 목록 전부 취소
    public void checkSuccessToRegister() {
        int cnt = 0;
        for (int i = 0; i < this.courses.size(); i++) {
            if (this.major.name == this.courses.get(i).major.name) {
                cnt++;
            }
        }

        if (cnt < 3) {
            this.courses.clear();
            System.out.println("해당 학과 3개 과목이상 수강 요청");
        }
    }


}