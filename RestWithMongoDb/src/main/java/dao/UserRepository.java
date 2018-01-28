package dao;

import domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by Rabin Shrestha on 1/28/2018.
 */
public interface UserRepository extends MongoRepository<User,String> {
    User findByUserName(String username);
    User findById(String id);
    User findByEmail(String email);
    List<User> findAllByZipcode(String zipcode);
    User findUserByUserNameAndPassword(String username, String password);
    List<User> findAllUserByAddressIsLike(String address);
    Long deleteById(String userid);
}
