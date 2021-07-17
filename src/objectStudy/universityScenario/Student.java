package objectStudy.universityScenario;

public class Student {
    int studentId;
    String studentName;
    String courseName;
    String major;
    boolean courseAttend;

    public Student(int studentId, String studentName, String major) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.major = major;
    }

    // 수강 학생 추가
    // 1. {학생_이름}님, {수업_이름} 수강 신청에 성공하였습니다.
    public void registrationCourse(Course registerCourse){
        registerCourse.addStudent(this.studentName);
        System.out.println(this.studentName+"님, "+ registerCourse.courseName+" 수강 신청에 성공하였습니다.");
    }

    // 수강한 수업에 참여
    // 2. {학생_이름}이 {수업_이름}에 출석하였습니다.
    public void participationCourse(Course course){

    }

}