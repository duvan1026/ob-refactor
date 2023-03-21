package replacemethod.good;

public class Product {

    double price;
    int quantity;
    double discount;
    double shipping;

    // constructores


    // metodos


    //tostring

    public double calculatePrice(){

    ProductPriceCalculator calculator = new ProductPriceCalculator(this);
    return calculator.calculatePrice();

    }

    // getter y setter


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getShipping() {
        return shipping;
    }

    public void setShipping(double shipping) {
        this.shipping = shipping;
    }
}
