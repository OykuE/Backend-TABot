package bitirmeprojesi.tabot.business.abstracts;
import bitirmeprojesi.tabot.entities.concretes.User;

public interface UserService {
    void saveUser(User user);
    //User login(String email, Integer password);
    User getUser(int id);
    void editProfilePicture(Integer userId, byte[] profilePicture);
    void changePassword(Integer userId, String password);

    User login(String userEmail, String password);
}
