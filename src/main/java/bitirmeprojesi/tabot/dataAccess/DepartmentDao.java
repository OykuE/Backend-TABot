package bitirmeprojesi.tabot.dataAccess;

import bitirmeprojesi.tabot.entities.concretes.Department;
import bitirmeprojesi.tabot.entities.concretes.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentDao extends JpaRepository<Department,Integer>{

    List<Department> findByFacultyId(int facultyId);
}
