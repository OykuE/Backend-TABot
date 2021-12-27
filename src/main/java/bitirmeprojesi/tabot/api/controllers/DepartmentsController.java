package bitirmeprojesi.tabot.api.controllers;

import bitirmeprojesi.tabot.business.abstracts.DepartmentService;
import bitirmeprojesi.tabot.business.abstracts.FacultyService;
import bitirmeprojesi.tabot.entities.concretes.Department;
import bitirmeprojesi.tabot.entities.concretes.Faculty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
public class DepartmentsController {
    private DepartmentService departmentService;

    @Autowired
    public DepartmentsController(DepartmentService departmentService) {
        super();
        this.departmentService = departmentService;
    }



    @GetMapping("/getByFacultyId")
    public List<Department> getByFacultyId(Integer facultyId){
        return this.departmentService.getByFacultyId(facultyId);
    }
}
