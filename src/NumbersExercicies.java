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
}
