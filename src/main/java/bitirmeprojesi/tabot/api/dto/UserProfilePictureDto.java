package bitirmeprojesi.tabot.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserProfilePictureDto {
    private int userId;
    private byte[] profilePicture;

}
