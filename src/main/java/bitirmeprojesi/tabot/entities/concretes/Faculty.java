package bitirmeprojesi.tabot.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="faculties")

public class Faculty {

    @Id
    @GeneratedValue
    @Column(name="faculty_id")
    private int facultyId;

    @Column(name="university_id")
    private int universityId;

    @Column(name="faculty_name")
    private String facultyName;
}
