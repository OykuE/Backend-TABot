package bitirmeprojesi.tabot.business.abstracts;
import bitirmeprojesi.tabot.entities.concretes.University;
import org.springframework.http.ResponseEntity;

import java.util.List;


public interface UniversityService {

    List<University> getAll();
}
