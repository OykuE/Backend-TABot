package bitirmeprojesi.tabot.api.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterDto {
    private String name;
    private String surname;
    private int lectureId;
    private int userTypeId;
    private String username;
    private String password;
    private int departmentId;
}
