package KrogerTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Rabin Shrestha on 1/16/2018.
 */
public class CreditCartValidation {
    static List<Map<String, Object>> validateCards(String[] bannedPrefixes, String[] cardsToValidate) {

        if (null == cardsToValidate || cardsToValidate.length < 1) return null;
        //TO hold the Result List of HashMap
        List<Map<String, Object>> ResultMap = new ArrayList<>();
        for (String card : cardsToValidate) {
            //Creating HashMap object for each card and Assigning Value
            HashMap<String, Object> hm = new HashMap<>();
            hm.put("card", card);
            hm.put("isValid", isValid(card));
            hm.put("isAllowed", isAllowed(card, bannedPrefixes));
            //Adding on List
            ResultMap.add(hm);
        }
        return ResultMap;
    }

    static boolean isValid(String card) {
        if ("".equals(card) || card == null) return false;
        Integer sum = 0;
        for (int i = 0; i < card.length() - 1; i++) {
            Integer d = Integer.parseInt(card.charAt(i) + "");
            sum += d*2;
        }
        Integer checkDigit = Integer.parseInt(card.charAt(card.length() - 1) + "");

        return checkDigit.equals(sum % 10);
    }

    static boolean isAllowed(String card, String[] bannedPrefixes) {

        if (bannedPrefixes == null) return true;
        if (card == null || "".equals(card)) return false;

        for (int i = 0; i < bannedPrefixes.length; i++) {
            if (card.startsWith(bannedPrefixes[i]))
                return false;
        }
        return true;
    }
}
