public class AsteriskExercicies {


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
            asterisks += repeatChar(i+1,'*')+ "\n";
        }
        return asterisks;
    }

    private static String repeatChar(int count , char character)
    {
        return new String(new char[count]).replace('\u0000', character);
    }

}
