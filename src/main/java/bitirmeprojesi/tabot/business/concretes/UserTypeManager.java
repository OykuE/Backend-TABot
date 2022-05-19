package bitirmeprojesi.tabot.business.concretes;

import bitirmeprojesi.tabot.business.abstracts.UserTypeService;
import bitirmeprojesi.tabot.dataAccess.UserTypeDao;
import bitirmeprojesi.tabot.entities.concretes.User;
import bitirmeprojesi.tabot.entities.concretes.UserType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserTypeManager implements UserTypeService {

    UserTypeDao userTypeDao;

    @Autowired
    public UserTypeManager(UserTypeDao userTypeDao){
        super();
        this.userTypeDao = userTypeDao;
    }

    @Override
    public void saveUserType(UserType userType) {
        userTypeDao.save(userType);
    }
}
