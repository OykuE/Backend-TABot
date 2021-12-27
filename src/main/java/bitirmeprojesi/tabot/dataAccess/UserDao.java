package bitirmeprojesi.tabot.dataAccess;

import bitirmeprojesi.tabot.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserDao extends JpaRepository<User,Integer> {

    Optional<User> findByEmailAndPassword(String email, Integer password);

}
