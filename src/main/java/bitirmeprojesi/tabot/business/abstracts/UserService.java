package bitirmeprojesi.tabot.business.abstracts;
import bitirmeprojesi.tabot.entities.concretes.User;

public interface UserService {
    void saveUser(User user);
    User login(String email, Integer password);
    User getUser(int id);
}
