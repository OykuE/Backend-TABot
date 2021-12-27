package bitirmeprojesi.tabot.dataAccess;

import bitirmeprojesi.tabot.entities.concretes.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LectureDao extends JpaRepository<Lecture,Integer> {
    List<Lecture> getBySemesterAndDepartmentId(String semester, int departmentId);
}
