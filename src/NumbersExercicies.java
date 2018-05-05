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


    public static int[] returnFactorByNumber(int number)
    {
        int[] factors = new int[]{};

        for (int i = 2; i < number; i++) {
            if (isDivisibleByParameter(number,i))
            {
//                factors.
            }
        }
        return factors;
    }

    private static boolean isDivisibleByParameter(int number, int divisor)
    {
        return number % divisor == 0 ? true : false;
    }
}
