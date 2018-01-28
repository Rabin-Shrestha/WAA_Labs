package TDD;

import java.util.Collections;
import java.util.List;

/**
 * Created by Rabin Shrestha on 1/15/2018.
 */
public class MyQuickSort implements ISorting<String> {
    @Override
    public List<String> sort(List<String> list) {
        Collections.sort(list);
        return list;
    }
}
