package objectStudy.universityScenario;

public class Main {
    public static void main(String[] args) {
        // 생성
        // 학과
        Major computerScience = new ComputerScience();
        Major philosophy = new Philosophy();

        // 교수
        Professor jiwon = new Professor(1, "jiwon");
        Professor minhyeok = new Professor(2, "minhyeok");
        Professor angie = new Professor(3, "angie");

        // 학생
        Student doori = new Student(1, "doori", computerScience);
        Student kori = new Student(2, "kori", computerScience);
        Student bani = new Student(3, "bani", computerScience);

        // 과목
        Course dataStructure = new Course(1, "dataStructure", 3, computerScience);
        Course javaProgramming = new Course(2, "javaProgramming", 3, computerScience);
        Course database = new Course(3, "database", 3, computerScience);
        Course iosProgramming = new Course(4, "iosProgramming", 3, computerScience);
        Course machineLearning = new Course(5, "machineLearning", 3, computerScience);
        Course philosophyBasic = new Course(6, "philosophyBasic", 3, philosophy);
        Course marxistIdeology = new Course(7, "marxistIdeology", 3, philosophy);

/*        //시나리오 흐름
        dataStructure.addProfessor("dataStructure",jiwon);
        jiwon.chargeProfessorName(dataStructure);
        doori.registrationCourse(dataStructure);
        kori.registrationCourse(dataStructure);
        //중복체크
        doori.registrationCourse(dataStructure);
        doori.registrationCourse(dataStructure);
        kori.registrationCourse(dataStructure);
        // 수업시작
        jiwon.startCourse(dataStructure);*/

        doori.registrationCourse(dataStructure);
        doori.registrationCourse(javaProgramming);
        doori.registrationCourse(philosophyBasic);
        doori.registrationCourse(marxistIdeology);
        doori.checkSuccessToRegister();
    }
}