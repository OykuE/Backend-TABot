package bitirmeprojesi.tabot.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="lectures")

public class Lecture {

    @Id
    @GeneratedValue
    @Column(name="lecture_id")
    private int lectureId;

    @Column(name="department_id")
    private int departmentId;

    @Column(name="lecture_code")
    private String lectureCode;

    @Column(name="lecture_name")
    private String lectureName;

    @Column(name="semester")
    private String semester;


    @Column(name="survey_id")
    private int surveyId;
}
