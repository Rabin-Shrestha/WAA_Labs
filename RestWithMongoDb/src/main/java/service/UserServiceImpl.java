package service;

import dao.UserRepository;
import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Rabin Shrestha on 1/28/2018.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User add(User u) {
        return userRepository.save(u);
    }

    @Override
    public User get(String id) {
        return userRepository.findById(id);
    }

    @Override
    public User update(User user, String id) {
        user.setId(id);
        // needs change here, it always saves new record
        return userRepository.save(user);
    }

    @Override
    public User delete(User user) {
        userRepository.delete(user);
        return user;
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }


    public User findByUserName(String name) {
        return userRepository.findByUserName(name);
    }

    @Override
    public List<User> findAllByZipcode(String zipcode) {
        return userRepository.findAllByZipcode(zipcode);
    }

    @Override
    public User findUserByUserNameAndPassword(String username, String password) {
        return userRepository.findUserByUserNameAndPassword(username, password);

    }

    @Override
    public List<User> findUserByAddressIsLike(String address) {
        return userRepository.findAllUserByAddressIsLike(address);
    }

    @Override
    public Long deleteById(String userid) {

        return userRepository.deleteById(userid);
    }


}
