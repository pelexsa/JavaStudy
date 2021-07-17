package objectStudy.universityScenario;

public class Professor {
    int professorId;
    String professorName;
    String courseName;
    String major;
    String courseAttend;

    public Professor(int professorUniqueNum, String professorName, String major) {
        this.professorId = professorUniqueNum;
        this.professorName = professorName;
        this.major = major;
    }

    //담당 교수 추가
    // {교수_이름} 교수님이 {수업_이름}(을)를 담당합니다.
    public void chargeProfessorName(Course course) {
        this.courseName = course.courseName;
        System.out.println(this.professorName + "교수님이 " + this.courseName + "을 담당합니다.");
    }

    // 수업 시작
    // {교수_이름} 교수님이 {수업_이름}(을)를 시작합니다.
    public void startCourse(Course course) {
        System.out.println(this.professorName + "교수님이 " + this.courseName + "을 시작합니다.");
        Student.participationCourse(course);
    }
}
