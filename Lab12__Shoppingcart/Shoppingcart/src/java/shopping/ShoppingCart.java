package shoppingModels;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.faces.component.UIParameter;
import javax.faces.event.ActionEvent;

public class ShoppingCart {
    private List cartlist = new LinkedList();
    private double totalPrice= 0;

    public ShoppingCart() {
    }
    
    public void addToCart(Product product){
        boolean found=false;
        // first check if product is already in the shoppingcart
        Iterator iter = cartlist.iterator();
        while (iter.hasNext()){
            Cartitem cartitem = (Cartitem) iter.next();
            Product prod = cartitem.getProduct();
            if (prod.getItemcode().equals(product.getItemcode())){
                cartitem.setQuantity(cartitem.getQuantity()+1);
                found=true;
                break;
            }
        }
        if (!found){
          cartlist.add(new Cartitem(product,1));
        }
        computeTotalPrice();
    }

    public void computeTotalPrice(){
        totalPrice = 0;
        Iterator iter = cartlist.iterator();
        while (iter.hasNext()){
            Cartitem cartitem = (Cartitem) iter.next();
            totalPrice = totalPrice + (cartitem.getQuantity()* cartitem.getProduct().getItemprice());
        }
    }
    
    public void removeFromCart(String itemcode){
        Iterator iter = cartlist.iterator();
        while (iter.hasNext()){
            Cartitem cartitem = (Cartitem) iter.next();
            Product product = cartitem.getProduct();
            if (product.getItemcode().equals(itemcode)){
            	if (cartitem.getQuantity()== 1){
                    iter.remove();
                    computeTotalPrice();
                    break;
            	}
            	else{
            		cartitem.setQuantity(cartitem.getQuantity()-1);
            	}
            }
        }
    }

    public void setCartlist(List cart) {
        this.cartlist = cart;
    }

    public List getCartlist() {
        return cartlist;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
