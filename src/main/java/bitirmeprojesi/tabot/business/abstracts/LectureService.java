package bitirmeprojesi.tabot.business.abstracts;
import bitirmeprojesi.tabot.dataAccess.LectureDao;
import bitirmeprojesi.tabot.entities.concretes.Faculty;
import bitirmeprojesi.tabot.entities.concretes.Lecture;

import java.util.List;

public interface LectureService {
    List<Lecture> getBySemesterAndDepartmentId(String semester, int departmentId);
}
