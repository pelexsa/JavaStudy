package objectStudy.universityScenario;

public class Main {
    public static void main(String[] args) {
        // 생성
        // 학생
        Student doori = new Student(1, "doori", "cs");
        Student kori = new Student(2, "kori", "cs");
        Student bani = new Student(3, "bani", "cs");

        // 교수
        Professor jiwon = new Professor(1,"jiwon","cs");
        Professor minhyeok = new Professor(2,"jiwon","cs");
        Professor angie = new Professor(3,"jiwon","cs");

        // 학과
        Course dataStructure = new Course(1, "dataStructure");
        Course javaProgramming = new Course(2, "javaProgramming");
        Course database = new Course(3,"database");

        //시나리오 흐름
        dataStructure.addProfessor("dataStructure",jiwon);
        jiwon.chargeProfessorName(dataStructure);
        doori.registrationCourse(dataStructure);
        kori.registrationCourse(dataStructure);
        //중복체크
        doori.registrationCourse(dataStructure);
        doori.registrationCourse(dataStructure);
        kori.registrationCourse(dataStructure);
        // 수업시작
        jiwon.startCourse(dataStructure);

    }
}