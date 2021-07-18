package objectStudy.universityScenario;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    int professorId;
    String professorName;
    Major major;
    List<Course> courses;
    String courseAttend;

    public Professor(int professorUniqueNum, String professorName) {
        this.professorId = professorUniqueNum;
        this.professorName = professorName;
        courses = new ArrayList<Course>();
    }

    //담당 교수 추가
    // {교수_이름} 교수님이 {수업_이름}(을)를 담당합니다.
    public void chargeProfessorName(Course course) {
        if (courses.contains(course)) {
            return;
        } else {
            course.addProfessor(this);
            courses.add(course);
            System.out.println(this.professorName + "교수님이 " + course.courseName + "을 담당합니다.");
        }
    }

    // 수업 시작
    // {교수_이름} 교수님이 {수업_이름}(을)를 시작합니다.
    public void startCourse(Course course) {
        System.out.println(this.professorName + "교수님이 " + course.courseName + "을 시작합니다.");
        course.callStudentToAttend();
    }
}
