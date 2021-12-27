package bitirmeprojesi.tabot.business.concretes;

import bitirmeprojesi.tabot.business.abstracts.UniversityService;
import bitirmeprojesi.tabot.dataAccess.UniversityDao;
import bitirmeprojesi.tabot.entities.concretes.University;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversityManager implements UniversityService{

    private UniversityDao universityDao;

    @Autowired
    public UniversityManager(UniversityDao universityDao){
        super();
        this.universityDao = universityDao;
    }

    @Override
    public List<University> getAll() {
        return this.universityDao.findAll();
    }
}
