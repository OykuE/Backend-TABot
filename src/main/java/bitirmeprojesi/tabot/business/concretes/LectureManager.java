package bitirmeprojesi.tabot.business.concretes;

import bitirmeprojesi.tabot.business.abstracts.LectureService;
import bitirmeprojesi.tabot.dataAccess.LectureDao;
import bitirmeprojesi.tabot.entities.concretes.Faculty;
import bitirmeprojesi.tabot.entities.concretes.Lecture;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LectureManager implements LectureService{

    private LectureDao lectureDao;

    public LectureManager(LectureDao lectureDao){
        super();
        this.lectureDao = lectureDao;
    }

    @Override
    public List<Lecture> getBySemesterAndDepartmentId(String semester, int departmentId) {
        return this.lectureDao.getBySemesterAndDepartmentId(semester,departmentId);
    }
}
