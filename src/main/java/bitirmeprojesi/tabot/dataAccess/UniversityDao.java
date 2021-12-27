package bitirmeprojesi.tabot.dataAccess;

import bitirmeprojesi.tabot.entities.concretes.University;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UniversityDao extends JpaRepository<University,Integer> {

}
