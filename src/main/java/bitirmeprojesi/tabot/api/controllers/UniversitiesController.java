package bitirmeprojesi.tabot.api.controllers;

import bitirmeprojesi.tabot.business.abstracts.UniversityService;
import bitirmeprojesi.tabot.entities.concretes.University;
import bitirmeprojesi.tabot.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/universities")
public class UniversitiesController {

    private UniversityService universityService;

    @Autowired
    public UniversitiesController(UniversityService universityService) {
        super();
        this.universityService = universityService;
    }



    @GetMapping("/getall")
    public List<University> getAll(){
        return this.universityService.getAll();
    }
}
