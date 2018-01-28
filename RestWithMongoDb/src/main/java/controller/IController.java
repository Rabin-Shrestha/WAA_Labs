package controller;

import java.util.List;

/**
 * Created by Rabin Shrestha on 1/28/2018.
 */
public interface IController<T> {
    T add(T t);

    T update(T t, String id);

    T delete(T t, String id);

    List<T> getAll();

    T get(String id);
}
