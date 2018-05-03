public class AsteriskExercicies {
    public static void main(String[] args) {


        System.out.println(printCrashLineWithPreviusLine(3));
        System.out.println(fizzBuzzGame());
    }

    public static String printInLine(int qtd)
    {
        String asterisks = "";
        for (int i=0; i < qtd; i++) {
            asterisks +="*";
        }
        return asterisks;
    }

    public static String printCrashLine(int qtd)
    {
        String asterisks = "";
        for (int i=0; i < qtd; i++) {
            asterisks += "*" + "\n";
        }
        return asterisks;

    }

    public static String printCrashLineWithPreviusLine(int qtd)
    {
        String asterisks = "";
        for (int i=0; i < qtd; i++) {
            asterisks += '\n'+repeatChar(i+1,'*')+ "\n";
        }
        return asterisks;
    }

    public static String fizzBuzzGame()
    {
        String fizzBuzz= "";
        for(int i=1; i < 100; i++ )
        {
           fizzBuzz += returnFizzOrBuzzOrFizzBuzz(i)+'\n';
        }
        return fizzBuzz;
    }

    private static String returnFizzOrBuzzOrFizzBuzz(int number)
    {
        return (number % 3 == 0) && (number % 5 == 0) ?
                "FizzBuzz" : (number % 3 == 0) ?
                "Fizz" : (number % 5 == 0) ?
                "Buzz" : Integer.toString(number);
    }



    private static String repeatChar(int count , char character)
    {
        return new String(new char[count]).replace('\u0000', character);
    }

}
