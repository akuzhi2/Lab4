/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */

/**
 * this class finds the smallest word in the largerst word.
 */
public class ReclamationProject {
    /**
     *
     * @param wordOne one word
     * @param wordTwo another word
     * @return newWord section of the smallest word
     */
    public static String doIt(final String wordOne, final String wordTwo) {
        String newWordOne = wordOne;
        String newWordTwo = wordTwo;
        if (wordOne.length() > wordTwo.length()) {
            newWordOne = wordTwo;
            newWordTwo = wordOne;

        }
        String newWord = "";
        for (int i = 0; i < newWordOne.length(); i++) {
            for (int j = newWordOne.length() - i; j > 0; j--) {
                for (int k = 0; k < newWordTwo.length() - j; k++) {
                    if (newWordOne.regionMatches(i, newWordTwo, k, j) && j > r.length()) {
                        newWord = newWordOne.substring(i, i + j);
                    }
                }
            }
        }

     return newWOrd;
    }
}

