package mangedBeans;

import shoppingModels.Product;
import shoppingModels.ShoppingCart;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIParameter;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.servlet.http.HttpSession;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


@ManagedBean(name = "Shop")
@SessionScoped
public class Shop {
    private List productlist = new LinkedList();

    public String getpItemCode() {
        return pItemCode;
    }

    public void setpItemCode(String pItemCode) {
        this.pItemCode = pItemCode;
    }

    public String getpItemName() {
        return pItemName;
    }

    public void setpItemName(String pItemName) {
        this.pItemName = pItemName;
    }

    public Double getpItemPrice() {
        return pItemPrice;
    }

    public void setpItemPrice(Double pItemPrice) {
        this.pItemPrice = pItemPrice;
    }

    public String pItemCode;
    public String pItemName;
    public Double pItemPrice;
    public void addItemAtShop()
    {
        Product p=new Product(this.pItemCode,pItemName,pItemPrice);
        this.productlist.add(p);

    }
    public Shop(){
        productlist.add(new Product("A32581","The winner takes it all",12.95));
        productlist.add(new Product("A33278","Yellow submarine",11.35));
        productlist.add(new Product("A89587","Nokia6 Mobile",200.35));
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
        System.out.println("The Item code added !!"+itemcode);
        //get the session
        HttpSession session=(HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
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
         if (product.getItemCode().equals(itemcode)){

                shoppingCart.addToCart(product);
         }
        }

    }

    public String showCart() {

        return "ShoppingCartPage";
    }

}
