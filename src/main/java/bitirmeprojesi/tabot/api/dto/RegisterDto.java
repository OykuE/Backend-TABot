package bitirmeprojesi.tabot.api.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterDto {
    private String userName;
    private String userSurname;
    private int lectureId;
    private String userType;
    private String email;
    private String password;
    private int departmentId;
}
