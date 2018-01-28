package shoppingModels;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ShoppingCart {
    private List cartlist = new LinkedList();
    private double totalPrice = 0;

    public ShoppingCart() {
    }

    public void addToCart(Product product) {
        boolean found = false;
        // first check if product is already in the shoppingcart
        Iterator iter = cartlist.iterator();
        while (iter.hasNext()) {
            Cartitem cartitem = (Cartitem) iter.next();
            Product prod = cartitem.getProduct();
            if (prod.getItemCode().equals(product.getItemCode())) {
                cartitem.setQuantity(cartitem.getQuantity() + 1);
                found = true;
                break;
            }
        }
        if (!found) {
            cartlist.add(new Cartitem(product, 1));
        }
        computeTotalPrice();
    }

    public void computeTotalPrice() {
        totalPrice = 0;
        Iterator iter = cartlist.iterator();
        while (iter.hasNext()) {
            Cartitem cartitem = (Cartitem) iter.next();
            totalPrice = totalPrice + (cartitem.getQuantity() * cartitem.getProduct().getItemPrice());
        }
    }

    public void removeFromCart(String itemcode) {
        Iterator iter = cartlist.iterator();
        while (iter.hasNext()) {
            Cartitem cartitem = (Cartitem) iter.next();
            Product product = cartitem.getProduct();
            if (product.getItemCode().equals(itemcode)) {
                if (cartitem.getQuantity() == 1) {
                    iter.remove();
                    computeTotalPrice();
                    break;
                } else {
                    cartitem.setQuantity(cartitem.getQuantity() - 1);
                }
            }
        }
    } public void removeFromCartUsingObject(Cartitem cartitem) {
        Iterator iter = cartlist.iterator();
        while (iter.hasNext()) {
            Cartitem cItem = (Cartitem) iter.next();
            Product product = cItem.getProduct();
            if (product.getItemCode().equals(cartitem.getProduct().getItemCode())) {
                if (cItem.getQuantity() == 1) {
                    iter.remove();
                    computeTotalPrice();
                    break;
                } else {
                    cItem.setQuantity(cItem.getQuantity() - 1);
                }
            }
        }
    }

    public List getCartlist() {
        return cartlist;
    }

    public void setCartlist(List cart) {
        this.cartlist = cart;
    }

    public double getTotalPrice() {
        computeTotalPrice();
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
