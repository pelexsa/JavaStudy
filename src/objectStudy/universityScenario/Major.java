package objectStudy.universityScenario;

import java.util.ArrayList;
import java.util.List;

public class Major {
    int majorId;
    String name;
    List<Professor> professors;
    List<Course> courses;

    public Major(int majorId, String name) {
        this.majorId = majorId;
        this.name = name;
        professors = new ArrayList<Professor>();
        courses = new ArrayList<Course>();
    }

    // 교수 추가
    public void addProfessor(Professor professor){
        if (professors.contains(professor)) {
            return;
        }else{
            professors.add(professor);
            System.out.println(this.name + "학과, "+ professor.professorName + " 교수 추가");
        }
    }

    // 학과 삭제
    public void deleteMajor(Major major) {
        System.out.println(major.name + ", 해당 과가 삭제되었습니다.");
        major.courses.get(0).ChangeMajorForStudent(major.courses.get(0),major);
        major = null;
    }
}
