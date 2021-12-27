package bitirmeprojesi.tabot.business.concretes;

import bitirmeprojesi.tabot.business.abstracts.DepartmentService;
import bitirmeprojesi.tabot.dataAccess.DepartmentDao;
import bitirmeprojesi.tabot.entities.concretes.Department;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentManager implements DepartmentService {

    private DepartmentDao departmentDao;

    public DepartmentManager(DepartmentDao departmentDao){
        super();
        this.departmentDao = departmentDao;
    }

    @Override
    public List<Department> getByFacultyId(Integer facultyId) {
        return this.departmentDao.findByFacultyId(facultyId);
    }
}
