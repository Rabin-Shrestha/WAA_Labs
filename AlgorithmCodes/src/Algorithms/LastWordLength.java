package Algorithms;

/**
 * Created by Rabin Shrestha on 12/13/2017.
 */
public class LastWordLength {


    public int lengthOfLastWord(final String a) {
        //step1:find last index of space : li
        // step 2: find Last Word
        // step 3: return length of last word.
        if(a.length()<2)return 0;
        Integer li= a.lastIndexOf(" ");
        if(li<0)return 0;

        String lastWord= a.substring(li+1,a.length()-1);
        return lastWord.length();

    }

}
