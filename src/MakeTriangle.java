public class MakeTriangle {

    public static String IsoscelesTriangleByIndex(int height)
    {
        String triangle = "";
        for (int i=0; i < height; i++)
        {
            int blankSpaces = height - (i +1);
            int starCount = (i * 2) + 1;

            triangle += lineGeneretor(height - (i +1), starCount);

            if (i < height - 1)
            {
                triangle += '\n';
            }
        }
        return triangle;
    }

    private static String lineGeneretor(int blankSpaces, int starCount) {
        return repeatChar(blankSpaces, ' ') + repeatChar(starCount, '*');
    }

    private static String repeatChar(int count , char character)
    {
        return new String(new char[count]).replace('\u0000', character);
    }
}