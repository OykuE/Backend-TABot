package bitirmeprojesi.tabot.business.concretes;

import bitirmeprojesi.tabot.dataAccess.UserDao;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import static java.util.Collections.emptyList;

@Service
public class UserDetailsManager implements UserDetailsService {
    private final UserDao userDao;

    public UserDetailsManager(UserDao developerRepository) {
        this.userDao = developerRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        bitirmeprojesi.tabot.entities.concretes.User user;
        userDao.findByUsername(username);
        if(userDao.findByUsername(username).isPresent()){
            user = userDao.findByUsername(username).get();
        }
        else{
            user = null;
        }
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
        return new User(user.getName(), user.getPassword(), emptyList());
    }
}