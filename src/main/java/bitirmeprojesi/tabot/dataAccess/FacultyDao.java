package bitirmeprojesi.tabot.dataAccess;

import bitirmeprojesi.tabot.entities.concretes.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FacultyDao extends JpaRepository<Faculty,Integer> {
    List<Faculty> findByUniversityId(int universityId);
}
