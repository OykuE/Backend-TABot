package bitirmeprojesi.tabot.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="departments")
public class Department {

    @Id
    @GeneratedValue
    @Column(name="department_id")
    private int departmentId;

    @Column(name="faculty_id")
    private int facultyId;

    @Column(name="department_name")
    private String departmentName;
}
