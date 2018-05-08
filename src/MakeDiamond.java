public class MakeDiamond {


    public static String printDiamondByIndex(int height)
    {

        String diamond = "";
        for (int i=0; i < height; i++)
        {
            int blankSpaces = height - (i +1);
            int starCount = (i * 2) + 1;

            diamond += lineGeneretor(blankSpaces, starCount);

            if (i < height - 1)
            {
                diamond += '\n';
            }
        }
        for (int i=height -1; i > 0; i--)
        {
            int blankSpaces = height -i;
            int starCount = (i*2) -1;
            if (i < height+1)
            {
                diamond += '\n';
            }
            diamond += lineGeneretor(blankSpaces, starCount);

        }
        return diamond;
    }

    public static String printDiamondByIndexWithName(int height)
    {
        String diamond = "";
        for (int i=0; i < height; i++) {
            int blankSpaces = height - (i + 1);
            int starCount = (i * 2) + 1;
            if (i == height-1)
            {
                diamond += "Bill";
            }
            else
                {
                    diamond += lineGeneretor(blankSpaces, starCount);

                }
            if (i < height - 1)
            {
                diamond += '\n';
            }

        }
        for (int i=height -1; i > 0; i--)
        {
            int blankSpaces = height -i;
            int starCount = (i*2) -1;
            if (i < height+1)
            {
                diamond += '\n';
            }
            diamond += lineGeneretor(blankSpaces, starCount);

        }
        return diamond;
    }

    private static String lineGeneretor(int blankSpaces, int starCount) {
        return repeatChar(blankSpaces, ' ') + repeatChar(starCount, '*');
    }

    private static String repeatChar(int count , char character)
    {
        return new String(new char[count]).replace('\u0000', character);
    }
}
