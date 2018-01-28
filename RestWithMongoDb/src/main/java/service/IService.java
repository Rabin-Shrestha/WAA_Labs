package service;

import java.util.List;

/**
 * Created by Rabin Shrestha on 1/28/2018.
 */
public interface IService<T> {
    T add(T t);
    T update(T t, String id);
    T delete(T t);
    List<T> getAll();
    T get(String id);
}
