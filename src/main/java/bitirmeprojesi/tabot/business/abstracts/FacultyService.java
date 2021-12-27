package bitirmeprojesi.tabot.business.abstracts;
import bitirmeprojesi.tabot.entities.concretes.Faculty;
import bitirmeprojesi.tabot.entities.concretes.University;

import java.util.List;

public interface FacultyService {

    List<Faculty> getByUniversityId(Integer universityId);
}
