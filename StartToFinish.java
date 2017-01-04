/**
 * Processes first and last letters of words
 * 
 * Name: Michelle Pham
 * Version: Oct 9, 2016 / Final
 */
public class StartToFinish
{
    private String phrase;
    
    /**
     * Constructs a StartToFinish object
     * @param myString the phase for this object
     */
    public StartToFinish(String myString)
    {
        phrase = myString;
    }

    /**
     * @return string a string consisited of the first character of every word in the string
     */
    public String firstLetters()
    {
        String ret = "";

        boolean startOfNewWord = true;
        for (int i = 0; i < phrase.length(); i++) 
        {
            if (startOfNewWord && isLetter(phrase.charAt(i))) 
            {
                ret += phrase.charAt(i);
                startOfNewWord = false;
            } 
            else 
            {
                if (phrase.charAt(i) == ' ')
                {
                    startOfNewWord = true;
                }
            }
        }
        return ret;
    }

    /**
     * @return ret a string consisting of the last letter of every word in the string
     */
    public String lastLetters()
    {
        String ret = "";

        if (phrase.length() == 0)
        {
            return ret;
        }

        for (int i = 1; i < phrase.length(); i++) 
        {
            if (!isLetter(phrase.charAt(i)) && isLetter(phrase.charAt(i - 1))) 
            {
                ret += phrase.charAt(i - 1);
            }
        }
        
        if (isLetter(phrase.charAt(phrase.length() - 1)))
        {
            ret += phrase.charAt(phrase.length() - 1);
        }
        return ret;
    }

    /**
     * determines if the specified character is a letter
     * @param ch is a specific character
     * @return character
     */
    public static boolean isLetter(char ch)
    {
        return Character.isLetter(ch);
    }
}