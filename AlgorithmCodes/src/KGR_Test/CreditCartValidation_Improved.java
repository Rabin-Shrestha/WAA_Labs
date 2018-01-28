package KrogerTest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Rabin Shrestha on 1/16/2018.
 */
public class CreditCartValidation_Improved {

    public static void main(String[] args) {
        String[] cardToCheck={"012850003580200","12345678903555"};
        String[] bannedPrefix={"012","788"};
        Map<String,CreditCard> cardInfo=validateCards(bannedPrefix,cardToCheck);
        cardInfo.keySet().forEach(x-> System.out.println(cardInfo.get(x)));
    }

    static Map<String,CreditCard> validateCards(String[] bannedPrefixes, String[] cardsToValidate) {

        if (null == cardsToValidate || cardsToValidate.length < 1) return null;
        //TO hold the Result List of HashMap
        Map<String,CreditCard> creditCards = new HashMap<>();
        for (String card : cardsToValidate) {
            //Creating Credit card Object
            creditCards.put(card,new CreditCard(card, bannedPrefixes));
        }
        return creditCards;
    }

}



class CreditCard {
    private String cardString;
    private String[] bannedPrefixes;

    CreditCard(String cardString, String[] bannedPrefixes) {
        this.cardString = cardString;
        this.bannedPrefixes = bannedPrefixes.clone();

    }

    boolean isValid() {
        if ("".equals(cardString) || cardString == null) return false;
        Integer sum = 0;
        try {
            for (int i = 0; i < cardString.length() - 1; i++) {
                Integer d = Integer.parseInt(cardString.charAt(i) + "");
                sum += d * 2;
            }
            Integer checkDigit = Integer.parseInt(cardString.charAt(cardString.length() - 1) + "");
            return checkDigit.equals(sum % 10);
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    boolean isAllowed() {

        if (bannedPrefixes == null) return true;
        if (cardString == null || "".equals(cardString)) return false;

        for (int i = 0; i < bannedPrefixes.length; i++) {
            if (cardString.startsWith(bannedPrefixes[i]))
                return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "Card="+ this.cardString  +
                "Valid='" + isValid() + '\'' +
                ", Allowed=" + isAllowed() +
                '}';
    }
}
