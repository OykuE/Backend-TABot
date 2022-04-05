

package bitirmeprojesi.tabot.entities.concretes;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue
    @Column(name="user_id")
    private int userId;

    @Column(name="user_name")
    private String userName;

    @Column(name="user_surname")
    private String userSurname;

    @Column(name="lecture_id")
    private int lectureId;

    @Column(name="user_type")
    private String userType;

    @Column(name="user_email")
    private String email;

    @Column(name="password")
    private int password;

    @Column(name="department_id")
    private int departmentId;
}
