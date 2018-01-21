package shoppingModels;


public class Cartitem {
    private int quantity;
    private Product product;
    private double price=0;
    
    public Cartitem() {
    }
 
    public Cartitem(Product product, int quantity) {
       this.product=product;
       this.quantity=quantity;
       price = quantity * product.getItemPrice();
    }
   
    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        price = quantity * product.getItemPrice();
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
