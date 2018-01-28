package service;


import domain.User;

import java.util.List;

/**
 * Created by Rabin Shrestha on 1/28/2018.
 */
public interface UserService extends IService<User> {
    public User findByEmail(String email);

    public User findByUserName(String name);

    List<User> findAllByZipcode(String zipcode);

    User findUserByUserNameAndPassword(String username, String password);

    List<User> findUserByAddressIsLike(String address);

    Long deleteById(String userid);


}