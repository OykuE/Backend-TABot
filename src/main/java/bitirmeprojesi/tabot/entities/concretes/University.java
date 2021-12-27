package bitirmeprojesi.tabot.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="universities")

public class University {

    @Id
    @GeneratedValue
    @Column(name="university_id")
    private int universityId;

    @Column(name="university_name")
    private String universityName;
}
