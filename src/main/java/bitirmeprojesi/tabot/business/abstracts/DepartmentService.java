package bitirmeprojesi.tabot.business.abstracts;
import bitirmeprojesi.tabot.entities.concretes.Department;
import bitirmeprojesi.tabot.entities.concretes.Faculty;

import java.util.List;

public interface DepartmentService {
    List<Department> getByFacultyId(Integer facultyId);
}
