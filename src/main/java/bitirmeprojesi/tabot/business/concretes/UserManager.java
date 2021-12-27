package bitirmeprojesi.tabot.business.concretes;

import bitirmeprojesi.tabot.business.abstracts.UserService;
import bitirmeprojesi.tabot.dataAccess.UserDao;
import bitirmeprojesi.tabot.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManager implements UserService {

    private UserDao userDao;

    @Autowired
    public UserManager(UserDao userDao){
        super();
        this.userDao = userDao;
    }

    @Override
    public void saveUser(User user) {
        userDao.save(user);
    }

    @Override
    public User login(String email, Integer password) {
        if(userDao.findByEmailAndPassword(email,password).isPresent()){
            return userDao.findByEmailAndPassword(email,password).get();
        }
        return null;
    }


}
