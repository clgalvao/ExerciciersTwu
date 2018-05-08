import java.util.ArrayList;
import java.util.List;

public class NumbersExercicies {
    public static String fizzBuzzGame()
    {
        String fizzBuzz= "";
        for(int i=1; i < 100; i++ )
        {
            fizzBuzz += returnFizzOrBuzzOrFizzBuzz(i)+'\n';
        }
        return fizzBuzz;
    }

    public static String returnFizzOrBuzzOrFizzBuzz(int number)
    {
        return (number % 3 == 0) && (number % 5 == 0) ?
                "FizzBuzz" : (number % 3 == 0) ?
                "Fizz" : (number % 5 == 0) ?
                "Buzz" : Integer.toString(number);
    }


    public static List<Integer> returnFactorByNumber(int number)
    {
        List<Integer> factors = new ArrayList();

        for (int i = 2; i < number; i++) {
            if (isDivisibleByParameter(number,i))
            {
               factors.add(i);
            }
            if (checkMultiplier(number,factors) == number) {
                i = number;
            }
        }
        return factors;
    }

    private static int checkMultiplier(int number, List<Integer> factors)
    {
        int finalNumber =1;

        for(int multiplier : factors)
        {
            finalNumber *= multiplier;
        }
        return finalNumber;
    }

    private static boolean isDivisibleByParameter(int number, int divisor)
    {
        return number % divisor == 0 ? true : false;
    }
}
