package bitirmeprojesi.tabot.business.concretes;

import bitirmeprojesi.tabot.business.abstracts.FacultyService;
import bitirmeprojesi.tabot.dataAccess.FacultyDao;
import bitirmeprojesi.tabot.entities.concretes.Faculty;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyManager implements FacultyService{

    private FacultyDao facultyDao;

    public FacultyManager(FacultyDao facultyDao){
        super();
        this.facultyDao = facultyDao;
    }

    @Override
    public List<Faculty> getByUniversityId(Integer universityId) {
        return this.facultyDao.findByUniversityId(universityId);
    }
}
