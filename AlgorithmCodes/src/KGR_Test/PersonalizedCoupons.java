package KrogerTest;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Rabin Shrestha on 12/22/2017.
 */
public class PersonalizedCoupons {
    public static void main(String[] args) {

        List<Map<String, Object>> coupons = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Map<String, Object> c1 = new HashMap<>();
            c1.put("upc", "" + i);
            c1.put("code", "" + i);
            if (i < 15) {
                c1.put("category", "food");
                c1.put("itemPrice", 10.0F * Math.random() * 100);
                c1.put("couponAmount", 2.0F * Math.random() * 100);
            } else if (i < 30) {
                c1.put("category", "beverage");
                c1.put("itemPrice", 10.0F * (Math.random() * 100));
                c1.put("couponAmount", 2.0F * Math.random() * 100);
            } else if (i < 50) {
                c1.put("category", "util");
                c1.put("itemPrice", 10.0F * (Math.random() * 100));
                c1.put("couponAmount", 2.0F * Math.random() * 100);
            } else if (i < 100) {
                c1.put("category", "gift");
                c1.put("itemPrice", 10.0F * (Math.random() * 100));
                c1.put("couponAmount", 2.0F * Math.random() * 100);
            }

            coupons.add(c1);

        }
        List<String> prefferedList = Arrays.asList("food", "util", "beverage");
       List<Map<String,Object>>  resultPersonalizedCoupon=personalizedCoupons(coupons, prefferedList);
resultPersonalizedCoupon.forEach(x-> System.out.println(x+" \n"));

    }


    static List<Map<String, Object>> personalizedCoupons(List<Map<String, Object>> coupons, List<String> preferredCategories) {
        if(coupons==null ||preferredCategories==null )return null;
        //TO Hold Best Deals coupons
        List<Map<String, Object>> bestDeals = new ArrayList<>();

        //Creating Best Deals using Java 8 : Stream API 
        bestDeals = coupons
                .stream() // Stream Created
                .filter(c -> preferredCategories.contains(c.get("category"))) // Filtering only Coupons which is included in preferredList
                .sorted((coupon1, coupon2) -> {
                    Float c1price = Float.valueOf(coupon1.get("itemPrice").toString());
                    Float c1CouponPrice = Float.valueOf(coupon1.get("couponAmount").toString());
                    Float c1OffPercent = (c1CouponPrice / c1price) * 100;
                    Float c2price = Float.valueOf(coupon2.get("itemPrice").toString());
                    Float c2CouponPrice = Float.valueOf(coupon2.get("couponAmount").toString());
                    Float c2OffPercent = (c2CouponPrice / c2price) * 100;
                    return c2OffPercent.compareTo(c1OffPercent);
                })// Sortting coupons based on Percentage Off : Highest to Lowest Using Custom Comparator
                .limit(10) // Selecting Only top 10 Elements
                .map(coupon -> {coupon.remove("code"); return coupon;}) // To Remove Code Information form coupons
                .collect(Collectors.toList());

        return bestDeals;
    }


}

