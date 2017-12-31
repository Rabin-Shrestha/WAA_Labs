package Algorithms;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Rabin Shrestha on 12/22/2017.
 */
public class PersonalizedCoupons {
    public static void main(String[] args) {

        List<Map<String, Object>> coupons = new ArrayList<>();

        for(int i=0;i< 100; i++)
        {
            Map<String ,Object> c1=new HashMap<>();
            c1.put("upc",""+i);
            c1.put("code",""+i);
            if(i<15) {
                c1.put("category", "food");
                c1.put("itemPrice",10.0F*Math.random()*100);
                c1.put("couponAmount",2.0F*Math.random()*100);
            }
            else if(i<30) {
                c1.put("category", "beverage");
                c1.put("itemPrice",10.0F*(Math.random()*100));
                c1.put("couponAmount",2.0F*Math.random()*100);
            } else if(i<50) {
                c1.put("category", "util");
                c1.put("itemPrice",10.0F*(Math.random()*100));
                c1.put("couponAmount",2.0F*Math.random()*100);
            }else if(i<100) {
                c1.put("category", "gift");
                c1.put("itemPrice",10.0F*(Math.random()*100));
                c1.put("couponAmount",2.0F*Math.random()*100);
            }

            coupons.add(c1);

        }
        List<String> prefferedList= Arrays.asList("food","util","beverage");
        System.out.println(personalizedCoupons(coupons,prefferedList));

}


    static List<Map<String, Object>> personalizedCoupons(List<Map<String, Object>> coupons, List<String> preferredCategories) {
        List<Map<String, Object>> bestDeals = new ArrayList<>();

        bestDeals = coupons.stream().filter(c -> preferredCategories.contains(c.get("category"))).sorted((c1, c2) -> {
            Float c1price = Float.valueOf(c1.get("itemPrice").toString());
            Float c1CouponPrice = Float.valueOf(c1.get("couponAmount").toString());
            Float c1OffPercent = (c1CouponPrice / c1price) * 100;
            Float c2price = Float.valueOf(c2.get("itemPrice").toString());
            Float c2CouponPrice = Float.valueOf(c2.get("couponAmount").toString());
            Float c2OffPercent = (c2CouponPrice / c2price) * 100;
            return c2OffPercent.compareTo(c1OffPercent);
        }).limit(10).map(c -> {
            c.remove("code");
            return c;
        }).collect(Collectors.toList());

        return bestDeals;
    }


}

