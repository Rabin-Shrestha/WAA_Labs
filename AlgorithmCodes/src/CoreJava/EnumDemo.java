package CoreJava;

/**
 * Created by Rabin Shrestha on 1/12/2018.
 */
public class EnumDemo {
    public static void main(String[] args) {

        Gender g=Gender.Male;

        if(g.equals(Gender.Male))
        {
            System.out.println("Male");
        }else if(g.equals(Gender.Female)){
            System.out.println("Female");
        }else {
            System.out.println("Other");
        }

        double result = Operation.PLUS.calculate(1, 2);
        System.out.println(result); //3.0

    }
    enum  Gender
    {
         Male,
        Female,
        Other

    }
    enum Operation {
        PLUS,
        MINUS,
        TIMES,
        DIVIDE;

        double calculate(double x, double y) {
            switch (this) {
                case PLUS:
                    return x + y;
                case MINUS:
                    return x - y;
                case TIMES:
                    return x * y;
                case DIVIDE:
                    return x / y;
                default:
                    throw new AssertionError("Unknown operations " + this);
            }
        }

    }
}



