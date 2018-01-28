package CoreJava;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Rabin Shrestha on 1/15/2018.
 */
public class CheckedExceptionDemo {
}
abstract class parent{

    abstract void methodThrowingCheckedException()throws IOException;
}
class child1 extends parent
{

    @Override
    void methodThrowingCheckedException() throws FileNotFoundException {

    }
}

