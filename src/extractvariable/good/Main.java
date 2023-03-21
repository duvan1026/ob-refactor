package extractvariable.good;

import extractvariable.bad.Order;

public class Main {

    void printProductprice(Order order){

        // calcular precio total


        // 1. Precio de los productos
        Double quantityPrice = order.getPrice()  * order.getQuantity();

        // 2. Descuento
        Double offerPrice = order.getPrice() *  order.getOfter();

        // 3. calcular precio productos con el descuento incluido
        Double finalPrice = quantityPrice - offerPrice;

        // 4. Precio envio
        Double shippingCost = 0.0;
        if(finalPrice < 50){
            shippingCost = 2.99;
        }

        // precio definitivo
        Double totalPrice = finalPrice + shippingCost;


        System.out.println(totalPrice);

    }

}
