package shoppingModels;


public class Product {
    private String itemcode;
    private String name;
    private double itemprice;

    public Product() {
    }
    public Product(String itemcode, String name, double price) {
      this.itemcode=itemcode;
      this.name=name;
      this.itemprice=price;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setItemprice(double itemprice) {
        this.itemprice = itemprice;
    }

    public double getItemprice() {
        return itemprice;
    }
}
