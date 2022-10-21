package web.Servise;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import java.util.List;

public interface UserServiceInt {

    public List<User> index() ;

    public User show(int id) ;

    public void save(User user);

    public void update(int id, User userUpDate);

    public void delete(int id) ;

}

