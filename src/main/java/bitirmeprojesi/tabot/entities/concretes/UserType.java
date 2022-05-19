package bitirmeprojesi.tabot.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="user_types")
public class UserType {

    @Id
    @GeneratedValue
    @Column(name="user_type_id")
    private int userTypeId;

    @Column(name="user_type_name")
    private String userTypeName;
}
