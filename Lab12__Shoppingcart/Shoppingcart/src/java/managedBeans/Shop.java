package managedBeans;

import java.util.*;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIParameter;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.servlet.http.HttpSession;
import shoppingModels.Product;
import shoppingModels.ShoppingCart;


@ManagedBean
@RequestScoped
public class Shop {
    private List productlist = new LinkedList();

    public Shop(){
        productlist.add(new Product("A32581","The winner takes it all",12.95));
        productlist.add(new Product("A33278","Yellow submarine",11.35));
    }

    public void setProductlist(List theshop) {
        this.productlist = theshop;
    }

    public List getProductlist() {
        return productlist;
    }

    public void addToCart(ActionEvent event){
        UIParameter component = (UIParameter) event.getComponent().findComponent("itemcode");
        String itemcode = component.getValue().toString();
        //get the session
        HttpSession session=(HttpSession) FacesContext.getCurrentInstance().
                                                          getExternalContext().getSession(true);
        // get the shoppingcart
        ShoppingCart shoppingCart = (ShoppingCart) session.getAttribute("cart");
        if (shoppingCart == null){
        	shoppingCart = new ShoppingCart();
        	session.setAttribute("cart", shoppingCart);
        }

        // Find the product
         Iterator iter = productlist.iterator();
         while (iter.hasNext()){
         Product product = (Product)iter.next();
         if (product.getItemcode().equals(itemcode)){
                shoppingCart.addToCart(product);
         }
        }

    }

    public String showCart() {

        return "cart";
    }

}
