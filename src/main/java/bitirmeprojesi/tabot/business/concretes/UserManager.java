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

    /*@Override
    public User login(String username, Integer password) {
        if(userDao.findByUsernameAndPassword(username,password).isPresent()){
            return userDao.findByUsernameAndPassword(username,password).get();
        }
        return null;
    }
    */

    @Override
    public User getUser(int id) {
        return userDao.findById(id).get();
    }

    @Override
    public void editProfilePicture(Integer userId, byte[] profilePicture) {
       if(userDao.findById(userId).isPresent()){
          User user = userDao.findById(userId).get();
          user.setProfilePicture(profilePicture);
          userDao.save(user);
       }
    }

    @Override
    public void changePassword(Integer userId, String password) {
        if(userDao.findById(userId).isPresent()){
            User user = userDao.findById(userId).get();
            user.setPassword(password);
            userDao.save(user);
        }
    }

    @Override
    public User login(String userEmail, String password) {
        if (userDao.findByUsername(userEmail).isPresent()) {
            User user = userDao.findByUsername(userEmail).get();
            if (user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

    }



