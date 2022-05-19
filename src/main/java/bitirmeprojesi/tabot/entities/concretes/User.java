

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
    private String name;

    @Column(name="user_surname")
    private String surname;

    @Column(name="lecture_id")
    private int lectureId;

    @Column(name="user_type_id")
    private int userTypeId;

    @Column(name="user_email")
    private String username;

    @Column(name="password")
    private String password;

    @Column(name="department_id")
    private int departmentId;

    @Column(name="profile_picture")
    private byte[] profilePicture;

}
