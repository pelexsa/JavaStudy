package objectStudy.universityScenario;

import java.util.ArrayList;

public class Course {
    int courseId;
    int grade;
    Major major;
    String courseName;
    String professorName;
    ArrayList<Student> students = new ArrayList<Student>();

    public Course(int courseId, String courseName, int grade, Major major) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.grade = grade;
        this.major = major;
        major.courses.add(this);
    }

    //담당 교수 추가
    // {수업_이름}에 {교수_이름} 교수님이 추가되었습니다.
    public void addProfessor(Professor professor) {
        this.professorName = professor.professorName;
        System.out.println(this.courseName + "에 " + this.professorName + " 교수님이 추가되었습니다.");
    }

    // 수강 학생이 추가된다.
    // {수업_이름}에 {학생_이름} 학생이 수강 신청하였습니다.
    public boolean addStudent(Student student) {
        if (students.contains(students)) {
            return false;
        } else {
            students.add(student);
            System.out.println(this.courseName + "에 " + student.studentName + " 학생이 수강 신청하였습니다.");
            return true;
        }
    }

    // 학생들 수업 참여 알림
    public void callStudentToAttend() {
        for (Student student : students) {
            student.participationCourse(this);
        }
    }

    // 학과에 포함된 학생들에게 부전공 전환요청
    public void ChangeMajorForStudent(Course course, Major major){
        for(int i=0; i<course.students.size(); i++){
            course.students.get(i).changeMajorToMinor(course.students.get(i),major);
        }
    }
}
