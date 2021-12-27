package bitirmeprojesi.tabot.api.controllers;

import bitirmeprojesi.tabot.business.abstracts.FacultyService;
import bitirmeprojesi.tabot.business.abstracts.UniversityService;
import bitirmeprojesi.tabot.entities.concretes.Faculty;
import bitirmeprojesi.tabot.entities.concretes.University;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/faculties")
public class FacultiesController {

        private FacultyService facultyService;

        @Autowired
        public FacultiesController(FacultyService facultyService) {
            super();
            this.facultyService = facultyService;
        }



        @GetMapping("/getByUniversityId")
        public List<Faculty> getByUniversityId(Integer universityId){
            return this.facultyService.getByUniversityId(universityId);
        }
    }


