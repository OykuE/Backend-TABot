package bitirmeprojesi.tabot.api.controllers;

import bitirmeprojesi.tabot.api.dto.LectureDto;
import bitirmeprojesi.tabot.api.dto.LoginDto;
import bitirmeprojesi.tabot.business.abstracts.LectureService;
import bitirmeprojesi.tabot.dataAccess.LectureDao;
import bitirmeprojesi.tabot.entities.concretes.Faculty;
import bitirmeprojesi.tabot.entities.concretes.Lecture;
import bitirmeprojesi.tabot.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/lectures")
public class LecturesController {

    private LectureService lectureService;

    @Autowired
    public LecturesController(LectureService lectureService){
        super();
        this.lectureService=lectureService;
    }

    @GetMapping("/getBySemesterAndDepartmentId")
    public List<Lecture> getBySemesterAndDepartmentId(LectureDto lectureDto){
        return this.lectureService.getBySemesterAndDepartmentId(lectureDto.getSemester(),lectureDto.getDepartmentId());
    }



}
