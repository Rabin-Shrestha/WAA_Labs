package TDD;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Rabin Shrestha on 1/15/2018.
 */
public class MyQuickSortTest {
    ISorting<String> obj=new MyQuickSort();
    @Test
    public void shouldReturnSortedList(){
        List<String> input= Arrays.asList("b","a","c","e","d");
        assert Arrays.asList("a","b","c","d","e").equals(obj.sort(input));

    }
}
